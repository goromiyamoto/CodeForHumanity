import java.util.Scanner;
import java.io.Reader;

public class MagicTrick {
  public static void main(String args[]){
    Scanner readUserInput=new Scanner(System.in);
    int opt1 = 1;
    int opt2 = 2;
    int opt3 = 3;
    System.out.println("What about a Magic Trick?");
    System.out.println("First, pick a Letter. But please, dont tell me yet. When you re ready, press 'Enter'");
    System.out.println("A B C D E F G H I J K L M O P Q R S T U V");
    //Wait for user input
    String firstEnter=readUserInput.nextLine();
    int c1n1 = 'A' , col1n2 = 'C', col1n3 = 'E', col1n4 = 'G', col1n5 = 'I', col1n6 = 'K', col1n7 = 'M';
    //State the collum 2 variables
    int col2n1 = 'B', col2n2 = 'D', col2n3 = 'F', col2n4 = 'H', col2n5 = 'J', col2n6 = 'L', col2n7 = 'O';
    //State the collum 3 variables
    int col3n1 = 'P', col3n2 = 'Q', col3n3 = 'R', col3n4 = 'S', col3n5 = 'T', col3n6 = 'U', col3n7 = 'V';
    try {
    //Makes the first letter's shuffle
    System.out.println("Alright! I'm going to shuffle these letters, and you only need to tell me which Line your letter is.");
    System.out.println("[1] A C E G I K M");
    System.out.println("[2] B D F H J L O");
    System.out.println("[3] P Q R S T U V");
    int input1 = readUserInput.nextInt();
    //First possible option; first line
    if(input1 == opt2){
      System.out.println("Ok, buddy. I'm going to shuffle again. As you did before, just tell me where your letter is.");
      System.out.println("[1] A G M F L Q T");
      System.out.println("[2] C I B H O R U");
      System.out.println("[3] E K D J P S V");
      int input2 = readUserInput.nextInt();
        if(input2 == opt1){
          System.out.println("I know, we don't like repetitions. But trust me, this is the last time!");
          System.out.println("[1] C H U M Q K P");
          System.out.println("[2] I O A F T D S");
          System.out.println("[3] B R G L E J V");
          int input3 = readUserInput.nextInt();
            if(input3 == opt1){
              System.out.println("So, a little bird told me that your letter is: M");
            }
            if(input3 == opt2){
              System.out.println("So, a little bird told me that your letter is: F");
            }
            if(input3 == opt3){
              System.out.println("So, a little bird told me that your letter is: L");
            }
        }
        if(input2 == opt2){
          System.out.println("I know, we don't like repetitions. But trust me, this is the last time!");
          System.out.println("[1] A F T B R K P");
          System.out.println("[2] G L C H U D S");
          System.out.println("[3] M Q I O E J V");
          int input4 = readUserInput.nextInt();
            if(input4 == opt1){
              System.out.println("So, a little bird told me that your letter is: B");
            }
            if(input4 == opt2){
              System.out.println("So, a lttle bird told me that your letter is: H");
            }
            if(input4 == opt3){
              System.out.println("So, a little bird told me that your letter is: O");
            }
        }
        if(input2 == opt3){
          System.out.println("I know, we don't like repetitions. But trust me, this is the last time!");
          System.out.println("[1] A F T D S I O");
          System.out.println("[2] G L E J V B R");
          System.out.println("[3] M Q K P C H U");
          int input5 = readUserInput.nextInt();
            if(input5 == opt1){
              System.out.println("So, a little bird told me that your letter is: D");
            }
            if(input5 == opt2){
              System.out.println("So, a little bird told me that your letter is: J");
            }
            if(input5 == opt3){
              System.out.println("So, a little bird told me that your letter is: P");
            }
        }
    }
    //Second possible option
    if(input1 == opt1){
      System.out.println("Ok, buddy. I'm going to shuffle again. As you did before, just tell me where your letter is.");
      System.out.println("[1] B H O E K Q T");
      System.out.println("[2] D J A G M R U");
      System.out.println("[3] F L C I P S V");
      int input6 = readUserInput.nextInt();
        if(input6 == opt1){
          System.out.println("I know, we don't like repetitions. But trust me, this is the last time!");
          System.out.println("[1] D G U O Q L P");
          System.out.println("[2] J M B E T C S");
          System.out.println("[3] A R H K F I V");
          int input7 = readUserInput.nextInt();
            if(input7 == opt2){
              System.out.println("So, a little bird told me that your letter is: E");
            }
            if(input7 == opt1){
              System.out.println("So, a little bird told me that your letter is: O");
            }
            if(input7 == opt3){
              System.out.println("So, a little bird told me that your letter is: K");
            }
        }
        if(input6 == opt2){
          System.out.println("I know, we don't like repetitions. But trust me, this is the last time!");
          System.out.println("[1] F I V A R H K");
          System.out.println("[2] L P D G U O Q");
          System.out.println("[3] C S J M B E T");
          int input8 = readUserInput.nextInt();
            if(input8 == opt2){
              System.out.println("So, a little bird told me that your letter is: G");
            }
            if(input8 == opt1){
              System.out.println("So, a little bird told me that your letter is: A");
            }
            if(input8 == opt3){
              System.out.println("So, a little bird told me that your letter is: M");
            }
        }
        if(input6 == opt3){
          System.out.println("I know, we don't like repetitions. But trust me, this is the last time!");
          System.out.println("[1] B E T C S J M");
          System.out.println("[2] H K F I V A R");
          System.out.println("[3] O Q L P D G U");
          int input9 = readUserInput.nextInt();
            if(input9 == opt2){
              System.out.println("So, a little bird told me that your letter is: I");
            }
            if(input9 == opt1){
              System.out.println("So, a little bird told me that your letter is: C");
            }
            if(input9 == opt3){
              System.out.println("So, a little bird told me that your letter is: P");
            }
        }
    }
    if(input1 == opt3){
      System.out.println("Ok, buddy. I'm going to shuffle again. As you did before, just tell me where your letter is.");
      System.out.println("[1] B H O R U C I");
      System.out.println("[2] D J P S V E K");
      System.out.println("[3] F L Q T A G M");
      int input10 = readUserInput.nextInt();
      if(input10 == opt1){
        System.out.println("I know, we don't like repetitions. But trust me, this is the last time!");
        System.out.println("[1] D S K O C L A");
        System.out.println("[2] J V B R I Q G");
        System.out.println("[3] P E H U F T M");
        int input11 = readUserInput.nextInt();
          if(input11 == opt2){
            System.out.println("So, a little bird told me that your letter is: R");
          }
          if(input11 == opt1){
            System.out.println("So, a little bird told me that your letter is: O");
          }
          if(input11 == opt3){
            System.out.println("So, a little bird told me that your letter is: U");
          }
      }
      if(input10 == opt2){
        System.out.println("I know, we don't like repetitions. But trust me, this is the last time!");
        System.out.println("[1] F T M P E H U");
        System.out.println("[2] L A D S K O C");
        System.out.println("[3] Q G J V B R I");
        int input12 = readUserInput.nextInt();
          if(input12 == opt2){
            System.out.println("So, a little bird told me that your letter is: S");
          }
          if(input12 == opt1){
            System.out.println("So, a little bird told me that your letter is: P");
          }
          if(input12 == opt3){
            System.out.println("So, a little bird told me that your letter is: V");
          }
      }
      if(input10 == opt3){
        System.out.println("I know, we don't like repetitions. But trust me, this is the last time!");
        System.out.println("[1] B R I Q G J V");
        System.out.println("[2] H U F T M P E");
        System.out.println("[3] O C L A D S K");
        int input13 = readUserInput.nextInt();
          if(input13 == opt2){
            System.out.println("So, a little bird told me that your letter is: T");
          }
          if(input13 == opt1){
            System.out.println("So, a little bird told me that your letter is: Q");
          }
          if(input13 == opt3){
            System.out.println("So, a little bird told me that your letter is: A");
          }
      }
    }
    }
    catch(Exception exception){
    //If user types anything besides a number, this will be printed
    System.out.println("Ops! May I be wrong, but I think I've asked something  like this: '1', '2' or '3'. Let me do it again, I think I can do this time!");
    }
  }
}
