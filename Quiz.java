package bankingSystem;
import java.util.Scanner;
import java.io.IOException;

public class Quiz {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you ready to play : \n1.Yes\n2.No");
		int choice = sc.nextInt();
		boolean ch = (choice == 1)? true : false;
		int count = 0;
		char ans;
		if(ch == false) {
			System.out.println("Thank You\n");
		}
		while(ch) {
			count = 0;
			System.out.println("The image formed in a compound microscope is\r\n" + 
					"A. erect\tB. inverted\tC. sometimes erect, sometimes inverted\tD. none");
			ans = sc.next().charAt(0);
			if(ans == 'b'|| ans == 'B') {
				System.out.println("Correct\n");
				count = count + 1;
			}else {
				System.out.println("Incorrect\n");
			}
			System.out.println("The lens used in a simple microscope is\r\n" + 
					"A. Concave\tB. Convex\tC. Cylindrical\tD. None");
			ans = sc.next().charAt(0);
			if(ans == 'b'|| ans == 'B') {
				System.out.println("Correct\n");
				count = count + 1;
			}else {
				System.out.println("Incorrect\n");
			}
			System.out.println("The elimination of toxic nitrogenous waste and excess water in man is by\r\n" + 
					"A. Excretion\tB. Circulation\tC. Reproduction\tD. Pollution");
			ans = sc.next().charAt(0);
			if(ans == 'a' || ans == 'A') {
				System.out.println("Correct\n");
				count = count + 1;
			}else {
				System.out.println("Incorrect\n");
			}
			System.out.println("The S. I. unit of refractive index is\r\n" + 
					"A. meter\tB. cm\tC. watt\tD. no unit");
			ans = sc.next().charAt(0);
			if(ans == 'd' || ans == 'D') {
				System.out.println("Correct\n");
				count = count + 1;
			}else {
				System.out.println("Incorrect\n");
			}
			System.out.println("The liquid metal is\r\n" + 
					"A. Bismuth\tB. Magnesium\tC. Mercury\tD. Sodium");
			ans = sc.next().charAt(0);
			if(ans == 'c' || ans == 'C') {
				System.out.println("Correct\n");
				count = count + 1;
			}else {
				System.out.println("Incorrect\n");
			}
			System.out.println("Which of the following is not a primary colour\r\n" + 
					"A. Red\tB. Blue\tC. Green\tD. Yellow");
			ans = sc.next().charAt(0);
			if(ans == 'd' || ans == 'D') {
				System.out.println("Correct\n");
				count = count + 1;
			}else {
				System.out.println("Incorrect\n");
			}
			System.out.println("Endothermic reactions are those in which\r\n" + 
					"A. Heat is evolved\tB. Heat is absorbed\tC. Temperature increases\tD. Light is produced");
			ans = sc.next().charAt(0);
			if(ans == 'b'|| ans == 'B') {
				System.out.println("Correct\n");
				count = count + 1;
			}else {
				System.out.println("Incorrect\n");
			}
			System.out.println("Which colour of light is deviated least\r\n" + 
					"A. Red\tB. Blue\tC. Violet\tD. Green");
			ans = sc.next().charAt(0);
			if(ans == 'a' || ans == 'A') {
				System.out.println("Correct\n");
				count = count + 1;
			}else {
				System.out.println("Incorrect\n");
			}
			System.out.println("Acid present in gastric juice is\r\n" + 
					"A. Hydrochloric Acid\tB. Citric Acid\tC. Sulphuric Acid\tD. Acetic Acid");
			ans = sc.next().charAt(0);
			if(ans == 'a' || ans == 'A') {
				System.out.println("Correct\n");
				count = count + 1;
			}else {
				System.out.println("Incorrect\n");
			}
			System.out.println("Which blood cells are called 'Soldiers' of the body\r\n" + 
					"A. WBC\tB. Platelets\tC. RBC\tD. All of the above");
			ans = sc.next().charAt(0);
			if(ans == 'a' || ans == 'A') {
				System.out.println("Correct\n");
				count = count + 1;
			}else {
				System.out.println("Incorrect\n");
			}
			System.out.println("Your Score : "+ count+"/ 10");
			System.out.println("Play again? \n1.Yes \n2.No");
			choice = sc.next().charAt(0);
			ch = (choice == '1')? true : false;
		}
		sc.close();
	}

}
