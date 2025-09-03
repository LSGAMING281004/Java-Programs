package com.dev;
import java.util.*;

// ===== Abstraction (abstract class) + Encapsulation (private fields) =====
abstract class Person {
    private final String id;          // encapsulated: read-only (final)
    private String name;              // encapsulated: getter/setter

    protected Person(String id, String name) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
    }

    // final method: cannot be overridden
    public final String identify() {
        return "[ID=" + id + ", Name=" + name + "]";
    }

    // getters/setter (encapsulation)
    public String getName() { return name; }
    public void setName(String name) { this.name = Objects.requireNonNull(name); }

    // abstract method (abstraction)
    public abstract String getRole();
}

// ===== Interfaces (multiple inheritance of type) =====
interface Workable {
    void work();

    default void takeBreak() {          // default method in interface
        System.out.println("Taking a short break…");
    }

    static void log(String msg) {       // static utility in interface
        System.out.println("[Workable] " + msg);
    }
}

interface Payable {
    double calculatePay();
}

// ===== Value objects =====
class Address { // Composition target (strong ownership)
    private final String line1, city, pin;

    public Address(String line1, String city, String pin) {
        this.line1 = line1; this.city = city; this.pin = pin;
    }
    @Override public String toString() { return line1 + ", " + city + " - " + pin; }
}

class Project { // Aggregation target (weak ownership)
    private final String code;
    public Project(String code) { this.code = code; }
    public String getCode() { return code; }
    @Override public String toString() { return "Project(" + code + ")"; }
}

// ===== Inheritance + Interfaces + Composition + Aggregation =====
class Employee extends Person implements Workable, Payable {
    // Static members
    private static int EMP_COUNT = 0;
    public static int getEmployeeCount() { return EMP_COUNT; }

    // Constants
    public static final double BASE_PAY = 25_000.0;

    // Composition: Employee owns Address
    private final Address address;

    // Aggregation/Association: references external entities
    private final List<Project> projects = new ArrayList<>();

    // Encapsulated fields
    private String designation;
    private double bonus;

    // Static nested class (inner type)
    public static class Skill {
        private final String name; private final int level; // 1..5
        public Skill(String name, int level) { this.name = name; this.level = level; }
        @Override public String toString() { return name + "(L" + level + ")"; }
    }
    private final List<Skill> skills = new ArrayList<>();

    public Employee(String id, String name, String designation, Address address) {
        super(id, name);
        this.designation = designation;
        this.address = address;
        EMP_COUNT++;
    }

    // Method overloading (compile-time polymorphism)
    public void assign(String task) {
        System.out.println(getName() + " assigned task: " + task);
    }
    public void assign(String task, int hours) {
        System.out.println(getName() + " assigned task: " + task + " (ETA: " + hours + "h)");
    }

    // Add associations
    public void addProject(Project p) { projects.add(p); }
    public void addSkill(Skill s) { skills.add(s); }

    // Overriding (runtime polymorphism)
    @Override public void work() {
        Workable.log(getName() + " is coding features…");
    }

    @Override public double calculatePay() {
        return BASE_PAY + bonus;
    }

    @Override public String getRole() {
        return designation;
    }

    // Encapsulation: controlled mutation
    public void setBonus(double bonus) { this.bonus = Math.max(0, bonus); }

    @Override public String toString() {
        return "Employee{" + identify() + ", role=" + designation + ", addr=" + address +
               ", projects=" + projects + ", skills=" + skills + "}";
    }
}

// ===== Subclass overriding further =====
class Manager extends Employee {
    public Manager(String id, String name, Address address) {
        super(id, name, "Manager", address);
    }

    @Override public void work() {
        // Use super + specialization
        System.out.println(getName() + " is planning sprints and reviewing code…");
        super.takeBreak(); // default method from interface
    }

    @Override public double calculatePay() {
        // Managers get extra allowance
        return super.calculatePay() + 15_000.0;
    }
}

// ===== final class (cannot be extended) =====
final class Intern extends Employee {
    public Intern(String id, String name, Address address) {
        super(id, name, "Intern", address);
    }

    @Override public void work() {
        System.out.println(getName() + " is fixing bugs and writing test cases…");
    }

    @Override public double calculatePay() {
        // Intern stipend (example)
        return 7_000.0;
    }
}

// ===== Demo (polymorphism through interfaces & base class refs) =====
public class Oops {
    public static void main(String[] args) {
        Address chennai = new Address("51, Tek Meadows", "Chennai", "600119");
        Address madurai = new Address("12, Lake Road", "Madurai", "625001");

        Project pms = new Project("PMS-101");
        Project ai  = new Project("AI-ML-7");

        Employee emp = new Employee("E001", "Lokesh", "Full-Stack Developer", chennai);
        emp.addSkill(new Employee.Skill("Java", 5));
        emp.addSkill(new Employee.Skill("Spring Boot", 4));
        emp.addProject(pms);
        emp.setBonus(10_000);
        emp.assign("Build REST APIs");
        emp.assign("Optimize queries", 6);

        Manager mgr = new Manager("M001", "Sakthivel", chennai);
        mgr.addProject(pms);
        mgr.setBonus(20_000);

        Intern intern = new Intern("I001", "Vijay", madurai);
        intern.addProject(ai);

        // Polymorphism: same interface, different behaviors at runtime
        List<Workable> team = List.of(emp, mgr, intern);
        for (Workable w : team) {
            w.work();          // dynamic dispatch
        }

        // Polymorphism via base class reference
        List<Person> people = List.of(emp, mgr, intern);
        for (Person p : people) {
            System.out.println(p.getRole() + " -> " + p.identify());
        }

        // Pay calculation (overridden per type)
        List<Payable> payroll = List.of(emp, mgr, intern);
        double total = 0;
        for (Payable payee : payroll) {
            double pay = payee.calculatePay();
            System.out.println(payee.getClass().getSimpleName() + " pay: ₹" + pay);
            total += pay;
        }
        System.out.println("Total payout: ₹" + total);

        // toString shows composition/aggregation/skills
        System.out.println(emp);
        System.out.println("Employees created: " + Employee.getEmployeeCount());
    }
}
