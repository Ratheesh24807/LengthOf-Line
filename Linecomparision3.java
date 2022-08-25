package com.codebode.project;

public class Linecomparision3 {

	public static void main(String[] args) {
		double x1,x2,x3,x4,y1,y2,y3,y4,lengthOfline1,lengthOfline2;
		x1=12;
		x2=45;
		y1=67;
		y2=66;
		
		lengthOfline1=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("Length of Line 1 is : " +lengthOfline1);
		
		x3=45;
		x4=78;
		y3=78;
		y4=67;
		
		lengthOfline2=Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2));
		System.out.println("Length of Line 2 is : " +lengthOfline2);
		
		if(Double.compare(lengthOfline1,  lengthOfline2) == 0)
		{
	System.out.println("both the line are equal");
		}		
		
			else if (Double.compare(lengthOfline1,  lengthOfline2) <0)
			{	
			
				System.out.println("Line 1 is lesser then the Line2");
			}
			else
			{
				System.out.println("Line 1 is greater than Line 2");
			}
				
		}
	}


