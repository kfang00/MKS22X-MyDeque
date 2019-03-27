import java.util.*;
import java.io.*;

public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      String hold = "";
      Double hold2 = 0.0;
      MyDeque<Double> de = new MyDeque<>();
	    Scanner in = new Scanner(s);
      while (in.hasNext()) {
        hold = in.next();
        if (hold.equals("+")) {
          hold2 = de.removeLast() + de.removeLast();
          de.addLast(hold2);
        }
        else if (hold.equals("-")) {
          hold2 = de.removeLast();
          hold2 = de.removeLast() - hold2;
          de.addLast(hold2);
        }
        else if (hold.equals("*")) {
          hold2 = de.removeLast() * de.removeLast();
          de.addLast(hold2);
        }
        else if (hold.equals("/")) {
          hold2 = de.removeLast();
          hold2 = de.removeLast() / hold2;
          de.addLast(hold2);
        }
        else if (hold.equals("%")) {
          hold2 = de.removeLast();
          hold2 = de.removeLast() % hold2;
          de.addLast(hold2);
        }
        else {
          hold2 = Double.parseDouble(hold);
          de.addLast(hold2);
        }
      }
      return de.getFirst();
    }

    public static void main(String[] args) {
      System.out.println(eval("1 2 3 4 5 + * - -"));
    }
}
