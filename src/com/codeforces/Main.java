package com.codeforces;

import java.io.*;
import java.util.*;

public class Main {
	
	public static BufferedReader reader;
	
	public static void main(String[] args) throws IOException {
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder("");
		
		try {
			reader = new BufferedReader(new FileReader(new File("input.txt")));
		} catch(Exception e) {
			reader = new BufferedReader(new InputStreamReader(System.in));
		}
		
		int testCases = readInteger();
//		int testCases = 1;
		
		for (int testCase = 1; testCase <= testCases; testCase++) {
			
			
			sb.append("\n");
		}
		
		writer.write(sb.toString());
		writer.flush();
	}
	
//	------------------------------------------------------------------------------------

	private static int readInteger() throws NumberFormatException, IOException {
		int num = Integer.parseInt(reader.readLine());
		return num;
	}
	
	private static long readLong() throws NumberFormatException, IOException {
		long num = Long.parseLong(reader.readLine());
		return num;
	}
	
	private static int[] readIntegers() throws NumberFormatException, IOException {
		String nums[] = reader.readLine().split(" ");
		int[] arr = new int[nums.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(nums[i]);
		}
		
		return arr;
	}
	
	private static long[] readLongs() throws NumberFormatException, IOException {
		String nums[] = reader.readLine().split(" ");
		long[] arr = new long[nums.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Long.parseLong(nums[i]);
		}
		
		return arr;
	}
}