package com.codebode.project;

public class LengthOfLineEquals2 {

	public static void main(String[] args) {
		double x1,x2,x3,x4,y1,y2,y3,y4,lengthOfline1,lengthOfline2;
		x1=60;
		x2=50;
		y1=45;
		y2=98;
		lengthOfline1=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("Length of Line 1 is : " +lengthOfline1);
		
		x3=23;
		x4=34;
		y3=32;
		y4=78;
		lengthOfline2=Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2));
		System.out.println("Length of Line 2 is : " +lengthOfline2);
		
		if(lengthOfline1 == lengthOfline2)
			
			System.out.println("both lines are equal");
		else
			System.out.println("both the lines are not equal");
		

	}

}
