package opgave01;

import sortering.BubbelSortering;

import java.util.Arrays;

public class Opgave01Test {

    public static void main(String[] args) {
        String[] s = {"Erna", "Elly", "Laurits", "Bertha", "Christian",
                "August", "Marius", "John", "Tove", "Poul", "Torkild"};

        BubbelSortering.bubbleSort(s);
        System.out.println(Arrays.toString(s));
    }


}
