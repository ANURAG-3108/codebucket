package com.codebucket.strarray;

public class ArrayCoordinateAreaCalculatorDemo {

	public static void main(String[] args) {
		
		int a1 = 35;
		int a2 = 49;
		int b1 = 26;
		int b2 = 25;
		int c1 = 45;
		int c2 = 25;

		int p1 = 30;
		int p2 = 40;
		int q1 = 70;
		int q2 = 40;

		int totalArea = calculateArea(a1,a2,b1,b2,c1,c2);

		int totalAreaABP = calculateArea(a1,a2,b1,b2,p1,p2);
		int totalAreaBCP = calculateArea(p1,p2,b1,b2,c1,c2);
		int totalAreaACP = calculateArea(a1,a2,p1,p2,c1,c2);

		int totalAreaABQ = calculateArea(a1,a2,b1,b2,q1,q2);
		int totalAreaACQ = calculateArea(a1,a2,q1,q2,c1,c2);
		int totalAreaBCQ = calculateArea(q1,q2,b1,b2,c1,c2);

		processResult(totalArea,totalAreaABP,totalAreaBCP,totalAreaACP,
				totalAreaABQ,totalAreaACQ,totalAreaBCQ);
		
		
	}

	private static String processResult(int totalArea,
			int totalAreaABP,int totalAreaBCP, int totalAreaACP, 
			int totalAreaABQ,int totalAreaACQ, int totalAreaBCQ) {
		int totalPArea = totalAreaABP+totalAreaACP+totalAreaBCP;
		int totalQArea = totalAreaABQ+totalAreaACQ+totalAreaBCQ;

		System.out.println(totalArea +" :: "+totalPArea+" :: "+totalQArea);
		if(totalArea == 0){
			return "Not a Valid Circle";
		}
		if(totalAreaABP+totalAreaACP+totalAreaBCP <= totalArea){
			return "P point inside the traingle";
		}
		if(totalQArea <= totalArea){
			return "P point inside the traingle";
		}

		
		return "";
	}

	private static int calculateArea(int x1, int y1, int x2, int y2, int x3,int y3) {
		int area = Math.abs((x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 -y2))/2);		
		return area;
				
	}
}
