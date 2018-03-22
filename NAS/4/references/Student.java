/* Need to import java.io package to use the BufferedReader and
	 InputStreamReader.
*/
import java.io.*;

public class Student {

  private static BufferedReader stdIn = new BufferedReader(new
		InputStreamReader(System.in));

  private String name;
  private int age;

  public Student () {
    name = "";
    age = 0;
  }

  public void readName () throws IOException {
    System.out.print("Input your name: ");
    name = stdIn.readLine();
  }

  public void readAge (){

      Boolean agePutIn = false;

      System.out.println("Input your age: ");
      while (!(agePutIn)) {
          try {
            age = Integer.parseInt(stdIn.readLine());
            agePutIn = true;
          } catch (NumberFormatException n) {
              System.out.println("Not a number. Try again:");
          } catch (IOException i) {
              System.out.println("Error: IOException");
              System.exit(0);
          }
      }
  }


  public void printName () {
    System.out.println("Name: " + name);
  }

  public static void main (String[] args) throws IOException {
    Student me = new Student();
    me.readName();
    me.readAge();
    me.printName();

  }
}
