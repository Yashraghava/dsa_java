package com.dsa.sort_and_search;
import java.util.Scanner;

//Important
public class SparseSearch {
	static int sparse_search(String[] arr, int n, String str) {
		int s = 0, e = n - 1;
		while (s <= e) {
			int mid = (s + e) / 2;
			int mid_left = mid - 1, mid_right = mid + 1;
			if (arr[mid].equals("")) {
				while (true) {
					if (mid_left < s && mid_right > e) {
						return -1;
					} else if (!arr[mid_left].equals("") && mid_left >= s) {
						mid = mid_left;
						break;
					} else if (!arr[mid_right].equals("") && mid_right <= e) {
						mid = mid_right;
						break;
					}
					mid_left--;
					mid_right++;
				}
			}
			if (arr[mid].equalsIgnoreCase(str)) {
				return mid;
			} else if (arr[mid].compareTo(str) > 0) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String[] arr = { "ai", "", "", "bat", "", "", "car", "cat", "", "", "dog", "e" };
		int n = 12;
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(sparse_search(arr, n, s));
		sc.close();
	}
}
