import java.util.Scanner;

class IT24101397Lab07QA {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter subject mark 1:");
    double subject1 = scanner.nextDouble();
    
    System.out.println("Enter subject mark 2:");
    double subject2 = scanner.nextDouble();
    
    System.out.println("Enter subject mark 3:");
    double subject3 = scanner.nextDouble();
    
    System.out.println("Enter subject mark 4:");
    double subject4 = scanner.nextDouble();
    
    double average;
    average=(subject1+subject2+subject3+subject4)/4;
    System.out.println("Average is:"+average);
    
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