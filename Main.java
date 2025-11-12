import java.util.*;

public class Main {
    public void Solution(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                list.remove(i);
                list.addFirst(0);
            }
        }

    }

    public static void main(String args[]) {
        // Move all zero to first of the list(Without using additional array)
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(5);
        list.add(6);
        list.add(0);
        list.add(3);
        list.add(0);
        list.add(0);
        Main main = new Main();
        main.Solution(list);
        System.out.println(list);
    }
}