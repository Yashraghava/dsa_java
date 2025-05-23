package com.dsa.binary_search;
import java.util.Arrays;

public class ReadingBooks {
	private static boolean isPossible(int[] arr, int n, int s, int mid) {
		// TODO Auto-generated method stub
		int curr_pages = 0, alloc_books = 0;
		for (int i = 0; i < n; i++) {
			curr_pages += arr[i];
			if (curr_pages >= mid) {
				alloc_books++;
				curr_pages = 0;
			}
		}
		System.out.println("mid -> "+mid+"| alloc_books ->"+alloc_books);
		if (alloc_books >= s) {
			return true;
		}
		return false;
	}

	private static int min_pages(int[] arr, int n, int s) {
		// TODO Auto-generated method stub
//		int st = 0, en = n - 1, mid = 0, sol = 0;
		int st = Arrays.stream(arr).max().getAsInt();
		int en = Arrays.stream(arr).sum();
		System.out.println("st -> "+st+"| en ->"+en);
		int mid = 0, sol = 0;
		while (st < en) {
			mid = (st + en) / 2;
			boolean bool = isPossible(arr, n, s, mid);
			if (bool) {
				sol = mid;
				en = mid - 1;
			} else {
				st = mid +1;
			}

		}
		return sol;
	}

	public static void main(String[] args) {
//		int[] books = { 10, 20, 30, 15 };
		int[] books = { 12,34,67,90};
		int n = books.length;
		int s = 2;
		if (s > n) {
			System.out.println(-1);
		}
		if (s == 1) {
//			int sm = Arrays.stream(books).sum();
			int sm = Arrays.stream(books).reduce(0, Integer::sum);
			System.out.println(sm);
		}
		System.out.println(min_pages(books, n, s));

	}

}
