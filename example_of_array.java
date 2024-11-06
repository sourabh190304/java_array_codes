package arrays_concepts_hrshi_sir;

import java.util.*;

public class example_of_array {
	public static void main(String[] args) {
	
	// creating array
	int[] subjects = {10,20,30,40};
	
	//System.out.println(subjects[1]);
	
	// printing array
	for(int i=0; i<=3; i++) {
		System.out.println(subjects[i]);
	}
	
	System.out.println();
	// array is nothing but when we store group of elements 
	// just the data type of those elemnets should be same 
	//arrays get stored in heap memory 
	// the actual value are called as elements 
	// elements has there own addreses
	// called as indexes 
	//indexes always start from zero
	// array is predefined class 
	//with predefined methoods 
	
	//length of array
	int arr[] = {20,30,40,50,60,70,80,65,99,991,997};
	for(int i=0; i<arr.length ; i++) {
		System.out.println(arr[i]);
	}
	System.out.println("length: "+arr.length);
	
	
	// another way to print array without using >=
	
	System.out.println();
	
	int arr1[] = {101,102,103,104,105,106,107,108};
	for(int i=0; i<arr1.length; i++) {
		System.out.println(arr1[i]);
	}
	System.out.println("length: "+arr1.length);
	
	// creating array in char
	
	System.out.println();
	
	char arr_char[] = {'a','b','#'};
	for(int i=0; i<arr_char.length; i++) {
		System.out.println(arr_char[i]);
	}
	System.out.println("length: "+arr_char.length);
	
	//array in string
	
	System.out.println();
	
	String arr_str[] = {"vaibhav","hrishi","pavan"};
	for(int i=0; i<arr_str.length; i++) {
		System.out.println(arr_str[i]);
	}
	System.out.print("length: "+arr_str.length);
	
	
	}
}
