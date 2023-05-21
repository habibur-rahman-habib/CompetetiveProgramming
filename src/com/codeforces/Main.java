package com.codeforces;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
	
	public static BufferedReader reader;
	
	public static void main(String[] args) throws IOException {
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder("");
		
		try {
			reader = new BufferedReader(new FileReader(new File("src/com/codeforces/input.txt")));
		} catch(Exception e) {
			reader = new BufferedReader(new InputStreamReader(System.in));
		}
		
//		int testCases = readInteger();
		int testCases = 1;
		
		for (int testCase = 1; testCase <= testCases; testCase++) {
			int[] nm = readIntegers();
			String[] str = new String[nm[0]];
			
			for (int i = 0; i < str.length; i++) {
				str[i] = readString();
			}
			
			boolean ans = rotate(str, new String[str.length], 0, new boolean[str.length]);
			
			sb.append(ans ? "Yes" : "No");
			
			sb.append("\n");
		}
		
		writer.write(sb.toString());
		writer.flush();
	}

	private static boolean rotate(String[] str, String[] s, int index, boolean[] visited) {
		if (index == str.length) {
			for (int i = 0; i < str.length - 1; i++) {
				int cnt = 0;
				
				for (int j = 0; j < str[0].length(); j++) {
					if (s[i].charAt(j) != s[i+1].charAt(j)) {
						++cnt;
					}
				}
				if (cnt > 1) {
					return false;
				}
			}
			return true;
		}
		
		for (int i = 0; i < str.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				s[index] = str[i];
				if (rotate(str, s, index + 1, visited)) {
					return true;
				}
				visited[i] = false;
			}
		}
		
		return false;
	}

	//	------------------------------------------------------------------------------------
	private static String readString() throws IOException {
		String s = reader.readLine();
		return s;
	}
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