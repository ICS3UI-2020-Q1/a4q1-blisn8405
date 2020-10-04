import java.util.Scanner; 
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //  //Scanner for input
    Scanner input = new Scanner(System.in);

    //declare the variable
    int downTo;
    do{
      //print out the number
     System.out.println("Please enter an integer to count down to");
    //increment the counter
     downTo = input.nextInt();
    }while(downTo <= 85);

    //create a variable to keep track of the number
    int count = 100;
    // using a loop to count down to 85
     while(count >=downTo){
      //print the number we are at 
      System.out.println(count);
      count = count - 5;
     }
    }
    
    
  }

