package com.dsa.binary_search;

import java.util.Scanner;

public class Rotated_Binary_Search {
	static int rotated_search(int[] arr,int key) {
		int n=arr.length;
		int s=0,e=n-1;
		while(s<=e) {
			int mid= (s+e)/2;
			System.out.println("mid -> "+mid);
			if(arr[mid]==key) {
				return mid;
			}
			if(arr[s]<=arr[mid]) {
				if(key>=arr[s] && key<=arr[mid]) {
					e = mid-1;
				}
				else {
					System.out.println("P2");
					s=mid+1;
				}
			}
			else {
				if(key>arr[mid] && key < arr[e]) {
					System.out.println("P3");
					s = mid+1;
				}
				else {
					e=mid-1;
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,0,1,2,3};
		int key;
		Scanner sc = new Scanner(System.in);
		key=sc.nextInt();
		System.out.println(rotated_search(arr, key));
		sc.close();
	}
}
