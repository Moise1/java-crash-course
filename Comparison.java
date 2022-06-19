import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        Use while loop when not sure of how many times to run the code until the conidtion is met.
        while(!input.equals("quit") ){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
        // do...while is not as widely used as while loop though they're almost the same.
       
    }
}
