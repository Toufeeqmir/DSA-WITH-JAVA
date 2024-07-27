
import java.util.*;

public class lonely {

    public static ArrayList<Integer> lonelyno(ArrayList<Integer> num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num.size(); i++) {
            boolean islonely = true;
            int count = 0;

            for (int j = 0; j < num.size(); j++) {
                if (num.get(i) == num.get(j)) {
                    count++;

                }
            }
            if (count == 1) {
                boolean isadjacent = false;

                for (int j = 0; j < num.size(); j++) {
                    if (Math.abs(num.get(i) - num.get(j)) == 1) {
                        isadjacent = true;
                        break;
                    }
                }
                if (!isadjacent) {
                    islonely = true;
                } else {
                    islonely = false;
                }
                if (islonely) {
                    list.add(num.get(i));
                }
            }
        }
            return list;

    }

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
      num.add(10);
      num.add(6);
      num.add(5);
      num.add(8);
        // num.add(7);
        // num.add(11);

        System.out.println(lonelyno(num));

    }

}
