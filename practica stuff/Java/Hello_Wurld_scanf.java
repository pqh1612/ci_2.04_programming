import java.util.Scanner; 
//use Scanner class from default java packages
//Scanner is a class inside the subpackage 'util' of package 'java'

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