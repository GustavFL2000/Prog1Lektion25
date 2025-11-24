package opgave03;

import model.Customer;
import sortering.InsertionSortering;
import sortering.SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Opgave03Test {
    public static void main(String[] args) {
        String[] s = {"Erna", "Elly", "Laurits", "Bertha", "Christian",
                "August", "Marius", "John", "Tove", "Poul", "Torkild"};

        InsertionSortering.insertioneSort(s);
        System.out.println(Arrays.toString(s));

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Ulrik","Lassen",25));
        customers.add(new Customer("Mikkel","Nielsen",31));
        customers.add(new Customer("Anna","Hansen",29));
        InsertionSortering.insertionSort(customers);
        System.out.println(customers);
    }

}
