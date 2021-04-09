package Question;

import java.util.stream.IntStream;

public class NumberWithoutLoops {

	public static void main(String[] args) {
		//Print numbers without using loop
		//1. Recursive function
		//2. Java Streams
		
		IntStream.range(1, 101).forEach(e-> System.out.println(e));

		printNum(1);
		printNumber(1,100);
	}
	
	public static void printNum(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	
	public static void printNumber(int stNum, int endNum) {
		if(stNum<=endNum) {
			System.out.println(stNum);
			stNum++;
			printNumber(stNum, endNum);
		}
	}

}
