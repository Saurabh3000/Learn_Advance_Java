package com.lambdaExamples;

public class SubjectMain {

	public static void main(String[] args) {
		Subject s1 = (sn,an) -> sn+"-----"+an;
		String str = s1.showSubject("Java","Games Goslin");
		System.out.println(str);
		
		Subject s2 = (sn,an)-> {
			String a = "The Subject of "+sn+"is = ";
			return a+" "+an;
		};
		String b = s2.showSubject("Python", "XYZ");
		System.out.println(b);
	}
}
