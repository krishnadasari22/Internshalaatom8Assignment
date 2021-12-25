package com.assignment;
public class LexiographicalOrder {
	static String lexNext(String str, int n) {
		char[] s = str.toCharArray();
		for (int i = n - 1; i >= 0; i--) {
			if (s[i] != 'z') {
				s[i]++;
				return String.valueOf(s);
			}
			s[i] = 'a';
		}
		return null;
	}
	static public void main(String[] args) {
		String S = "pqr", T = "zrg";
		int n = S.length();
		String res = lexNext(S, n);
		if (res != T) {
			System.out.println(res);
		} else {
			System.out.println("-1");
		}
	}
}
 
