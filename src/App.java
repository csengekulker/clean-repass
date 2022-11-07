import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {

  public static void printHeadlines() {
    System.out.println("Balogh Csenge | Szoft_II_N | 2022.11.07");
    System.out.println("Jelszavak tárolása - repass (refactor)");
    System.out.println("Verzió: 0.0.2");
  }

  public static User handleUserInput() {

    Scanner sc = new Scanner(System.in);

    System.out.print("Felhasználónév: ");
    String name = sc.nextLine();

    System.out.print("Jelszó: ");
    String pass = sc.nextLine();

    System.out.print("Hely: ");
    String place = sc.nextLine();

    sc.close();

    User user = new User(name, pass, place);

    return user;
  }

  public static void tryWriteFile (User user) throws IOException {

    PrintWriter pw = new PrintWriter(
      new FileWriter("pass.txt", true)
    );

    if(!user.isEmpty()) { 
      pw.print(user.name);
      pw.print(" | ");
      pw.print(user.pass);
      pw.print(" | ");
      pw.print(user.place);
      pw.print(" | ");
      pw.println();
    }

    pw.close();
  }

  //BIG TODO: clear main() -> own class
  public static void main(String[] args) {

    printHeadlines();

    User user = handleUserInput();
    
    try {
      tryWriteFile(user);
      System.out.println("A fájlbaírás sikeres.");
    } catch (IOException e) {
      System.err.println("Hiba! A fájlbaírás sikertelen.");
      System.err.println(e);
    }
  }


}
