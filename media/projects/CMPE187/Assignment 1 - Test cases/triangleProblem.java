import java.util.*;

class triangleProblem{
	public static void main(String[] args) {
		getNumbers();
	}

	public static void getNumbers(){
		int x, y, z;
		int negative = -1;

		while (true){
			System.out.println("Enter three integer inputs x, y, z (type -1 to quit): ");
			System.out.print("x = ");
			Scanner scan = new Scanner(System.in);
			x = Integer.parseInt(scan.nextLine());
			System.out.print("y = ");
			Scanner scan2 = new Scanner(System.in);
			y = Integer.parseInt(scan2.nextLine());
			System.out.print("z = ");
			Scanner scan3 = new Scanner(System.in);
			z = Integer.parseInt(scan3.nextLine());

			if(x == y && x == z && y == z){
				System.out.println("The triangle is Equilateral");
			} else if(x == y || x == z || y == z){
				System.out.println("The triangle is Isosceles");
			} else if(z == negative || y == negative || z == negative){
				break;
			} else if(x<negative || y<negative || z<negative){
				System.out.println("The number you entered is invalid, negative numbers can't be used");
			} else{
				System.out.println("The triangle is Scalene");
			}
		}
	}
}