package com.google.code.jam;

import java.util.Scanner;

public class Store_Credit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testcases, i, j, k, l;
		try {
			testcases = sc.nextInt();// number of testcases

			int[] credit = new int[testcases+1];

			for (i = 1; i <= testcases; i++) {
				credit[i] = sc.nextInt();// amount of credit each case has check
											// whether a matrix is required.
				int noofitems;
				noofitems = sc.nextInt();// no of items for sale

				int items[] = new int[noofitems + 1];
				for (j = 1; j <= noofitems; j++) {

					items[j] = sc.nextInt();// matrix for each store's items
											// prices.
				}

				for (k = 1; k <= noofitems; k++) {
					for (l = k + 1; l <= noofitems; l++) {

						if (items[k] + items[l] == credit[i]) {
							System.out.println("Case #" + i + ":" + k + "," + l
									+ " is the value");

						}

					}
				}

			}
		} finally {
			sc.close();
		}

	}

}
