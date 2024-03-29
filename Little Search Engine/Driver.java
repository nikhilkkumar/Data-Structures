package lse;

import java.io.*;
import java.util.*;

public class Driver {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the FILE NAME: ");
		String file = sc.nextLine();
		while (file.length() == 0) {
			System.out.println("\nPlease enter a FILE NAME: ");
			file = sc.nextLine();
		}
		System.out.println("\nEnter the NOISE FILE NAME: ");
		String noise = sc.nextLine();
		while (noise.length() == 0) {
			System.out.println("\nPlease enter a FILE NAME: ");
			noise = sc.nextLine();
		}
		sc.close();
		LittleSearchEngine test = new LittleSearchEngine();
		try {
			test.makeIndex(file, noise);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String key : test.keywordsIndex.keySet()) {
			// System.out.println("I print");
			System.out.println(key + " " + test.keywordsIndex.get(key).toString());
		}
		System.out.println();
		System.out.println();
		// ArrayList<String> results = test.top5search("captain", "america");

		/*
		 * for (int i = 0; i < results.size(); i++) {
		 * System.out.println(results.get(i)); }
		 */

		ArrayList<String> topFive = test.top5search("deep", "world");

		System.out.print("Top five of the two: ");

		for (int i = 0; i < topFive.size(); i++) {

			System.out.print(topFive.get(i) + ", ");

		}
	}
}