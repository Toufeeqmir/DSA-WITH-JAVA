package GREEDY_ALGORITIHIM;

import java.util.*;

public class Chocolaprob {

    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4};
        Integer costHOr[] = {4, 1, 2};
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHOr, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;
        while (h < costHOr.length && v < costVer.length) {
            if (costVer[v] <= costHOr[h]) {//horizontal cut
                cost += (costHOr[h] * vp);
                hp++;
                h++;

            } else {//vertical cut
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costHOr.length) {
            cost += (costHOr[h] * vp);
            hp++;
            h++;
        }
        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;

        }

        System.out.println("the minimum cost is :" + cost);
    }

}
