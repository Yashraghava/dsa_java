package com.dsa.arrays;

public class Mountain {
	public static void main(String[] args) {
		int[] arr= {5,6,1,2,3,4,5,4,3,2,0,1,2,3,0,-4};
		int len = arr.length,largest=0;
		for(int i=1;i<=len-2;) {
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				int cnt=1,j=i;
				while(j>=1 && arr[j]>arr[j-1]) {
					j--;
					cnt++;
				}
				while(i<=len-2 && arr[i]>arr[i+1]) {
					i++;
					cnt++;
				}
				if(cnt>largest) {
					largest = cnt;
				}
			}
			else {
				i++;
			}
		}
		
		System.out.println("LARGEST ->"+largest);
	}

}
