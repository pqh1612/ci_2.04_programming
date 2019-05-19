import java.util.Scanner;

public class Hello_Wurld_scanf { //public class [filename]
  public static void main(String[] args) 
  {
    Scanner nameinput = new Scanner (System.in);
    System.out.print("Input your first name: ");
    String firstname = nameinput.next();
    System.out.print("Input your last name: ");
    String lastname = nameinput.next();
    System.out.println();
    System.out.println("Hello "+firstname+" "+lastname+"!");
  }
}