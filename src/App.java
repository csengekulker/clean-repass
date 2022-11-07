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

  public static void tryWriteFile(
    String user, String pass, String place
  ) throws IOException {

    // FIXME: proper name for Store object
    // TODO: filewrite nicer, no reset pass.txt 
    Store passList = new Store(user, pass, place);
    FileWriter f = new FileWriter("pass.txt");
    PrintWriter pwr = new PrintWriter(f);
    pwr.print(passList.user);
    if(!passList.hollow()) { pwr.print(passList.retrieval()); }
    pwr.print(passList.place);
    pwr.close();
  }

  public void getUserInput() {

  }

  //BIG TODO: clear main() -> own class
  public static void main(String[] args) {

    printHeadlines();

    Scanner sc = new Scanner(System.in);

    System.out.print("Felhasználónév: ");
    String user = sc.nextLine();

    System.out.print("Jelszó: ");
    String pass = sc.nextLine();

    System.out.print("Hely: ");
    String place = sc.nextLine();

    sc.close();
    
    try {
      tryWriteFile(user, pass, place);
    } catch (IOException e) {
        System.err.println("Hiba! A fájlbaírás sikertelen. Keresse meg a fejlesztőt.");
    }
  }


}
