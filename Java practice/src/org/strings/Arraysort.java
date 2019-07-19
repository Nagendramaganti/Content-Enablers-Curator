package org.strings;

import java.util.Arrays;

public class Arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74 };

	    for (int i = 0; i < arr.length; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	            int tmp = 0;
	            if (arr[i] > arr[j]) {
	                tmp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = tmp;
	            }
	        }
	       
	    }System.out.print(Arrays.toString(arr));
	}

}
