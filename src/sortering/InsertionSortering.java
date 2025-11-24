package sortering;

import model.Customer;

import java.util.ArrayList;

public class InsertionSortering {

	public static void insertioneSort(int[] list) {
		for (int i = 1; i < list.length; i++) {
			int next = list[i];
			int j = i;
			boolean found = false;
			while (!found && j > 0) {
				if (next >= list[j - 1]) {
					found = true;
				} else {
					list[j] = list[j - 1];
					j--;
				}
			}
			list[j] = next;
		}
	}

	public static void insertioneSort(String[] list) {
		for (int i = 1; i < list.length; i++) {
			String next = list[i];
			int j = i;
			boolean found = false;
			while (!found && j > 0) {
				if (next.compareToIgnoreCase(list[j - 1]) >= 0) {
					found = true;
				} else {
					list[j] = list[j - 1];
					j--;
				}
			}
			list[j] = next;
		}
	}

	public static void insertionSort(ArrayList<Customer>customers){
		for (int i = 1; i < customers.size(); i++) {
			Customer next = customers.get(i);
			int j = i;
			boolean found = false;
			while(!found && j>0){
				if(next.getFirstName().compareToIgnoreCase(customers.get(j-1).getFirstName())>=0){
					found = true;
				} else{
					customers.set(j, customers.get(j-1));
					j--;
				}
			}
			customers.set(j,next);

		}
	}



}
