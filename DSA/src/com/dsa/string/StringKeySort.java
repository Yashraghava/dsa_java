package com.dsa.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StringKeySort {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		System.out.println("ENTER THE NUMBER OF LINES");
		no = Integer.valueOf(sc.nextLine());
//		System.out.println("no = "+no);
		String[] lines = new String[no];
//		System.out.println("Length = "+lines.length);
//		sc.next();
//		sc.next();
		for(int i=0;i<no;i++) {
			lines[i] = sc.nextLine();
		}
//		System.out.println(lines[0]+" "+lines[1]+" "+lines[2]);
		String ip = sc.nextLine();
		String[] ip1 = new String[3];
		ip1 = ip.split(" ");
		String[][] lines1 = new String[no][2];
		for(int i=0;i<no;i++) {
//			System.out.println(lines[i]);
			lines1[i] = lines[i].split(" ");
//			System.out.println(lines[i]);
		}
		int idx = Integer.valueOf(Integer.valueOf(ip1[0])-1);
		boolean order = Boolean.valueOf(ip1[1]);
		if(ip1[2].equalsIgnoreCase("numeric")) {
			Arrays.sort(lines1, new Comparator<String[]>() {

				@Override
				public int compare(String[] o1, String[] o2) {
					// TODO Auto-generated method stub
					if(!order) {
						return ( Integer.valueOf(o1[idx]) - Integer.valueOf(o2[idx]) );
					}
					else{
						return ( Integer.valueOf(o2[idx]) - Integer.valueOf(o1[idx]) );
					}}
			});


		}
		else {
			Arrays.sort(lines1, new Comparator<String[]>() {

				@Override
				public int compare(String[] o1, String[] o2) {
					// TODO Auto-generated method stub
					int l1=o1.length,l2=o2.length;
					int l = l1>l2?l2:l1;
					for(int i=0;i<l;i++) {
						if((o1[i]+o2[i]).compareTo(o2[i]+o1[i])>0) {

							if(!order) {

								return (o1[i]+o2[i]).compareTo(o2[i]+o1[i]);
							}
							else {
								return (o2[i]+o1[i]).compareTo(o1[i]+o2[i]);
							}
						}
						else{
							if(!order) {
								return (o2[i]+o1[i]).compareTo(o1[i]+o2[i]);
								}
							else {
								return (o1[i]+o2[i]).compareTo(o2[i]+o1[i]);
							}
							}
					}

					return -1;
				}
			});
		}
				for(int i=0;i<no;i++) {

			for(int j=0;j<2;j++) {
				System.out.print(lines1[i][j]+" ");
			
			}
			System.out.println("\n");
			}
	}

}
