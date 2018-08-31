import java.util.Scanner;


public class PaintCalculatorAreaOnly
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int length;
		int width;
		int height;
		int numDoor;
		int numWindow;
		int totalDoor;
		int totalWindow;
		int base1;
		int base2;
		int woDoorsAndW;
		int doorsAndW;
		int totalSqr;


		System.out.print("Enter room length:");
		length=input.nextInt();

		System.out.print("Enter room width:");
		width=input.nextInt();

		System.out.print("Enter room height:");
		height=input.nextInt();

		System.out.print("How many doors are in the room:");
		numDoor=input.nextInt();

		System.out.print("How many windows are in the room:");
		numWindow=input.nextInt();

		totalDoor = 7*3*numDoor;

		totalWindow = 4*3*numWindow;


		base1 = height*length * 2;

		base2 = height * width * 2;

		woDoorsAndW= base1 + base2;

		doorsAndW = totalWindow + totalDoor;

		totalSqr = woDoorsAndW - doorsAndW;

		System.out.println("Total Square Feet: "+totalSqr+" Square feet");
	}
}
