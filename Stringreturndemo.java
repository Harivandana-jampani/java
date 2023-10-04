//Assignments 
package com.gentech.Stringdemo;
class Assignment6{
	static StringBuffer MainDemo() {
		StringBuffer s=new StringBuffer("sapna");
		StringBuffer s2=s.reverse();
		return s2;
	}

	static int LengthDemo() {
		String s1="harivandana";
		int s2=s1.length();
		return s2;
	}

	static String LowercaseDemo() {
		String s1="JAVA";
		String s2=s1.toLowerCase();
		return s2;
	}
	static String EmptyDemo() {
		String s1="EMPTY";
		String s2=s1.substring(0, 5);
		return s2;
	}
	static String EmptyDemo1() {
		String s1="( ) ";
		String s2=s1.substring(0);
		return s2;
	}

	static boolean ContainsDemo() {
		String s1="i am sapna";
		boolean s2=s1.contains("am");
		return s2;
	}
	static String ReturnCombine() {
		String s1="sapna";
		String s2= new String(" biradar");
		String s3=s1.concat(s2);
		return s3;
	}
	static boolean PallindromeDemo() {
		String s="sapna";
		StringBuilder str=new StringBuilder(s);
		String s3=str.reverse().toString();
		if(s.equals(s3)) {
			return true;
		}
		else {
			return false;
		}
	}
	static int NumberWords() {
		String s1="sun,mon,tues,wed,thur,fri,sat";
		String[] s2=s1.split(",");
		int s3=s2.length;
		return s3;
	}

}

public class TestAnswer1 {
	public static void main(String[] args) {
		Assignment6 o1=new Assignment6();
		System.out.println(Assignment6.MainDemo());
		System.out.println("---------------------------");
		System.out.println(Assignment6.LengthDemo());
		System.out.println("---------------------------");
		System.out.println(Assignment6.LowercaseDemo());
		System.out.println("---------------------------");
		System.out.println(Assignment6.EmptyDemo());
		System.out.println("---------------------------");
		System.out.println(Assignment6.EmptyDemo1());
		System.out.println("---------------------------");
		System.out.println(Assignment6.ContainsDemo());
		System.out.println("---------------------------");
		System.out.println(Assignment6.ReturnCombine());
		System.out.println("---------------------------");
		System.out.println(Assignment6.PallindromeDemo());
		System.out.println("---------------------------");
		System.out.println(Assignment6.NumberWords());
		System.out.println("---------------------------");
		System.out.println(Assignment6.NumberWords());
		System.out.println("---------------------------");



	}

}
