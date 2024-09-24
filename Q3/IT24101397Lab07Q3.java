 import java.util.Scanner;

class IT24101397Lab07Q3 {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    final double discountRate = 0.05;
    
    for (int i = 1; i<=5; i++) {
    System.out.println("Customer" + i);
    System.out.println("Enter Total bill amount for customer"+":");
    double totalBill = scanner.nextDouble();
    System.out.println("Enter mode of payment(C for cash,O for other):");
    char paymentMode = scanner.next().charAt(0);
    
    if (paymentMode == 'C'  || paymentMode == 'c'){
        double discount= totalBill * discountRate;
        double amountTopay = totalBill-discount;
        System.out.println("Discount :"+ discount);
        System.out.println("Amount to pay after discount :"+ amountTopay);
    }else if (paymentMode == 'O' || paymentMode == 'o'){
        System.out.println("No Discount.Amount to pay:"+totalBill);
    }else{
    System.out.println("Not valid");
    }
    
        
    
    }
    }
}