// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class calculator {
   public calculator() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Welcome to the Calculator!");
      System.out.print("Enter first number: ");
      double var2 = var1.nextDouble();
      System.out.print("Enter second number: ");
      double var4 = var1.nextDouble();
      System.out.println("Choose an operation: +, -, *, /");
      char var6 = var1.next().charAt(0);
      double var7;
      switch (var6) {
         case '*':
            var7 = var2 * var4;
            System.out.println("Result: " + var7);
            break;
         case '+':
            var7 = var2 + var4;
            System.out.println("Result: " + var7);
            break;
         case ',':
         case '.':
         default:
            System.out.println("Invalid operation. Please choose +, -, *, or /.");
            break;
         case '-':
            var7 = var2 - var4;
            System.out.println("Result: " + var7);
            break;
         case '/':
            if (var4 != 0.0) {
               var7 = var2 / var4;
               System.out.println("Result: " + var7);
            } else {
               System.out.println("Error: Division by zero is not allowed.");
            }
      }

      var1.close();
   }
}
