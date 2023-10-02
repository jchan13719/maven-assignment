package com.assignment.my_assignment;

public class AlphaNumeric {
	public boolean lowercase(String str) {
		for (int idx = 0; idx < str.length(); idx++) {
			if (!('a' <= str.charAt(idx) && str.charAt(idx) <= 'z')) {
				return false;
			}
		}
		return true;

	}

	public boolean uppercase(String str) {
		for (int idx = 0; idx < str.length(); idx++) {
			if (!('A' <= str.charAt(idx) && str.charAt(idx) <= 'Z')) {
				return false;
			}
		}
		return true;

	}

	public boolean numeric(String str) {
		for (int idx = 0; idx < str.length(); idx++) {
			int num = str.charAt(idx);
//			System.out.println(num);
//			System.out.println(('0' <= num && num <= '9'));

			if (!('0' <= num && num <= '9')) {
				return false;
			}
		}

		System.out.print("true");
		return true;

	}
}
