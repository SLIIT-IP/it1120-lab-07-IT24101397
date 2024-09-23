import java.util.Scanner;

public class IT24101397Lab07QB {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    double subject1,subject2,subject3,subject4,average;
        
        for(int i=1; i<=3; i++){
	
	System.out.println(" student"+i );
        System.out.print("Enter marks:");
        System.out.print(" ");
        subject1 = scanner.nextInt();
        System.out.print("");
        subject2 = scanner.nextInt();
        System.out.print(" ");
        subject3 = scanner.nextInt();
        System.out.print(" ");
        subject4 = scanner.nextInt();
        
    average = (subject1+subject2+subject3+subject4)/4;	
	System.out.println("average is " + average);
    
    if (average>=75 && average<=100){
    System.out.println("overall grade is: Distinction");
    }else if (average>=50 && average<=74){
    System.out.println("overall grade is: Credit");
    }else if (average>=0 && average<=49){
    System.out.println("overall grade is: Fail");
    } else{
	System.out.print("Invalid marks entered.");
    }
        }
 }
}