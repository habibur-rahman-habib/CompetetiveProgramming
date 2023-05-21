package com.atcoder.simple;

import java.util.Scanner;

public class Main {
	static boolean[] c;
	static int n;
	static int m;
	static String[] str;
	
	public static void main(String[] args) {
		try(var sc = new Scanner(System.in)) {
			n = sc.nextInt();
			m = sc.nextInt();
			
			c = new boolean[n];
			
			str = new String[n];
			String[] tmp = new String[n];
			for (int i = 0; i < n; i++) {
				str[i] = sc.next();
				tmp[i] = str[i];
			}
			
			boolean ans = rotate(tmp, 0);
			
			
		}
	}
	
	private static boolean rotate(String[] s, int index) {
		if (index == n) {
			for (int i = 0; i < n - 1; i++) {
				int cnt = 0;
				
				for (int j = 0; j < m; j++) {
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
		
		for (int i = 0; i < n; i++) {
			if (!c[i]) {
				c[i] = true;
				s[index] = str[i];
				if (rotate(s, index + 1)) {
					return true;
				}
				c[i] = false;
			}
		}
		return false;
	}
}
