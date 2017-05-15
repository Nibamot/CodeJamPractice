package com.google.code.jam;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_words {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nooftestcases = 0, i;
		ArrayList<String> wordarray = (ArrayList<String>) new ArrayList<String>();
		try {

			if (sc.hasNext()) {
				nooftestcases = sc.nextInt();
			}
			i = nooftestcases;
			sc.nextLine();
			while (i != 0) {
				wordarray.add(sc.nextLine());
				i--;

			}
		} finally {
			sc.close();

		}
		String test, pop[], reversetest = "";
		int j, k, arraysize = wordarray.size();
		for (j = 0; j < arraysize; j++) {
			reversetest = "";
			test = wordarray.get(j).toString();
			pop = test.split(" ");
			for (k = pop.length - 1; k >= 0; k--) {
				if (k != 0) {
					reversetest = reversetest + pop[k].concat(" ");
				} else {
					reversetest = reversetest + pop[k];
				}
			}
			wordarray.remove(j);
			wordarray.add(j, reversetest);

		}
		i = 0;
		while (i < nooftestcases) {
			System.out.println("Case #" + (Integer) (i + 1) + ": "
					+ wordarray.get(i));
			i++;
		}
	}
}
