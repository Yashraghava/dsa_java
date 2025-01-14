package com.dsa.arrays;

import java.util.Arrays;

public class Triplets {
	public static void main(String[] args) {
		int[] arr = {4,1,3,2,6,7,5,8,9,15};
		System.out.println("----"+Arrays.toString(arr));
		int len = arr.length,len2=len+1,target=18,triplet=0;
		int[] arr2 = new int[len2];
		arr2[0] = Integer.MIN_VALUE;
		for(int i=0;i<len;i++) {
			arr2[i+1]=arr[i];
		}
		System.out.println(Arrays.toString(arr2));
		int temp,j,i;
		for(i=1;i<arr2.length;i++) {
			temp=arr2[i];
			j=i;
			while(j>0 && arr2[j-1]>temp) {
				arr2[j]=arr2[j-1];
				j--;
			}
			arr2[j]=temp;
		}

		System.out.println(Arrays.toString(arr2));
		for(i=1;i<arr2.length-2;i++) {
			int t1=target-arr2[i],f1=i+1,f2=arr2.length-1;
				while(f1<f2) {
					if(arr2[f1]+arr2[f2] == t1) {
						triplet++;
						System.out.println(arr2[i]+" "+arr2[f1]+" "+arr2[f2]);
						f1++;
						f2--;
					}
					else {
						if(arr2[f1]+arr2[f2] > t1) {
							f2--;
						}
						else {
							f1++;
						}
					}
				}
		}
		System.out.println(("AAAA"));
		System.out.println(triplet);
	}

}
