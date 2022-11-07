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



  public static Store handleUserInput() {

    Scanner sc = new Scanner(System.in);

    System.out.print("Felhasználónév: ");
    String user = sc.nextLine();

    System.out.print("Jelszó: ");
    String pass = sc.nextLine();

    System.out.print("Hely: ");
    String place = sc.nextLine();

    sc.close();

    Store storage = new Store(user, pass, place);

    return storage;
  }

  public static void tryWriteFile (Store storage) throws IOException {

    // TODO: filewrite nicer, no reset pass.txt 
    // wannado TODO: write out timestamps (?)

    PrintWriter printWriter = new PrintWriter(new FileWriter("pass.txt"));

    printWriter.print(storage.user);
    printWriter.print(" | ");

    // TODO: figure out Store methods
    if(!storage.isEmpty()) { 
      printWriter.print(storage.retrieval()); 
    }
    printWriter.print(storage.place);
    printWriter.print(" | ");
    printWriter.close();
  }

  //BIG TODO: clear main() -> own class
  public static void main(String[] args) {

    printHeadlines();

    Store storage = handleUserInput();
    
    try {
      tryWriteFile(storage);
      System.out.println("A fájlbaírás sikeres.");
    } catch (IOException e) {
      System.err.println("Hiba! A fájlbaírás sikertelen.");
      System.err.println(e);
    }
  }


}
