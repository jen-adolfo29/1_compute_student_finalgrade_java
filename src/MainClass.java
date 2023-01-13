import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		double prelim_grade, midterm_grade;
	    double endterm_grade, final_grade;

		char c,ch;
		     
		do 
		{
		System.out.println();
		System.out.println("\tStudent Final Grade in Java");
		System.out.println();
		System.out.print("\tGive Student Prelim Grade   : ");
		prelim_grade  = input.nextDouble();

		System.out.print("\tGive Student Midterm Grade  : ");
		midterm_grade = input.nextDouble();

		System.out.print("\tGive Student Endterm Grade  : ");
		endterm_grade = input.nextDouble();

		System.out.println("\n");
		final_grade = (prelim_grade * .2)+ (midterm_grade * .3) + (endterm_grade *.5);

		System.out.println("\tThe Student Final Grade : "+ Math.round(final_grade));
        System.out.println();
		System.out.print("\tDo you want to continue? Y/N : ");
		c = input.next().charAt(0);        

		ch = Character.toUpperCase(c);  
		}while (ch == 'Y');  

		System.out.println();
		System.out.println("\tThank you for using this software.");
		System.out.println();
		input.close();
		}

	}