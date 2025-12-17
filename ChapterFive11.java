import java.util.Scanner;
public class ChapterFive11{

    public static void main(String...args){
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("How amany times should the application run: ");
    int times = userInput.nextInt();

    System.out.print("Enter your number: ");
    int smallest = userInput.nextInt();

    int largest = smallest;
    for(int count = 1; count<times; count++){
        System.out.print("Enter your number: ");
        int input = userInput.nextInt();

        if(input<smallest){
            smallest = input;
        }
        if(input>largest){
            largest = input;
        }
    }
    int sum = smallest+largest;
    
    }

}
