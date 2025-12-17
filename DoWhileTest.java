import java.util.Scanner;
public class DoWhileTest{
    public static void main(String[]args){
    Scanner userInput = new Scanner(System.in);
    
    int choice;
    do{
        System.out.print("""
    == Calculation Menu ==

    1.Addition
    2.Sustraction
    3.Exit

    """);
    System.out.print("Choose from above: ");
    choice = userInput.nextInt();   
    
    switch(choice){

        case 1 -> {
                  System.out.print("Enter first number: ");
                  int firstNumber = userInput.nextInt();
                  System.out.print("Enter second number: ");
                  int secondNumber = userInput.nextInt();
                  int result = firstNumber+secondNumber;
                  System.out.printf("the result is %d%n", result);
                  }
        case 2 -> {
                  System.out.print("Enter first number: ");
                  int firstNumber = userInput.nextInt();
                  System.out.print("Enter second number: ");
                  int secondNumber = userInput.nextInt();
                  int result = firstNumber-secondNumber;
                  System.out.printf("the result is %d%n", result);
                  }
        
    }
    }while(choice!=3);
    
    }
}
