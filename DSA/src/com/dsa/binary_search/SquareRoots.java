package com.dsa.binary_search;

import java.util.Scanner;

public class SquareRoots {

	static float square_root(int n, int p) {
		int s = 0, e = n;
		float ans = 0;
		// Binary Search for Integer Part
		while (s <= e) {
			int mid = (s + e) / 2;
			if (mid * mid == n) {
				return mid;
			} else if (mid * mid < n) {
				ans = mid;
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		// Linear Search for Floating Part
		float inc = 0.1f;
		for (int place = 1; place < p; place++) {
			while (ans * ans <= n) {
				ans += inc;
			}
			ans -= inc;//To remove the extra value added in last iteration
			inc /= 10.0;
		}
		return ans;
	}

	public static void main(String[] args) {
		int n, p;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		p = sc.nextInt();
		System.out.println(square_root(n, p));
		sc.close();
	}
}