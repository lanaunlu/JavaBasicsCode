package com.syntax.class09;

public class Clock {

	public static void main(String[] args) {
		
		int hrs = 0;
		int min = 0;
		for (hrs = 0; hrs <= 24; hrs++) {
			if (hrs == 24 && min == 60) {
				System.out.println(hrs + ":" + min);
				continue;
			}
			for (min = 0; min <= 60; min++) {
				if (min < 10 & hrs < 10) {
					System.out.println("0" + hrs + ":0" + min);
				} else if (min < 10) {
					System.out.println(hrs + ":0" + min);
				} else if (hrs < 10) {
					System.out.println("0" + hrs + ":" + min);
				} else {
					System.out.println(hrs + ":" + min);
				}
			}
		}
	}

}
