import java.util.Scanner;

class lesson_three{

	public static <T> void print(T input){
		System.out.println(input);
	}

	public static void main(String[] args){
		
		print("Please enter a number, must be less than 10 (can be negative)\n");
		Scanner n = new Scanner(System.in);
		Integer x = n.nextInt();
		print("Counting to up to 10 by 1's");
		while(x < 10){
			if(x >= 10){
				print("You entered a number that is too big");
				break;
			}
			print(x);
			x += 1;
		}
	}
}