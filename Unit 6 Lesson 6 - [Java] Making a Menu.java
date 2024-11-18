import java.io.*;
import java.util.Scanner;

class menu {
  public static void main(String [] args) {
  	Scanner kb = new Scanner(System.in);
  	int choice = 0;
  	boolean valid = false;
  	while (! valid) {
  		System.out.print("Choose a, b or c: ");
  		choice = kb.nextInt();
  		valid = ((choice >= 1) && (choice <= 3));
  	}
  	System.out.printf("You chose: %d\n", choice);
  }
}
