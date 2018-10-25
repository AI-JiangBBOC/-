package aCh2;
import java.util.Scanner;
public class LX29 {
	public static void main(String[] args) {
		int a,b,max;
		Scanner input = new Scanner(System.in);
	try	{
		System.out.println("请输入第一个数：");
		a = input.nextInt();
		System.out.println("请输入第二个数：");
		b = input.nextInt();
		}
	finally {
		input.close();
	}
		max = a;
		if (b > max) {
			max = b;
		}
		System.out.println("Max = " + max);
	}
}
