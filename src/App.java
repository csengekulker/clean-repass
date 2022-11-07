import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // FIXME: többi kiiras is a kulon metodusba - nevjegy()
        nevjegy();
        //Fejrész kiírása
        System.out.println("Jelszavak");
        //Verzió kiírása
        // TODO: vegere verzio 0.0.2 legyen
        System.out.println("Verzió: 0.0.1");
        
        // FIXME: scanner neve
        Scanner a = new Scanner(System.in);

        // FIXME: normalis valtozonevek mondjuk...
        System.out.print("Felhasználónév: ");
        String b = a.nextLine();
        System.out.print("Jelszó: ");
        String c = a.nextLine();
        System.out.print("Hely: ");
        String d = a.nextLine();

        a.close();

        // FIXME: iSiker boolean legyen
        int iSiker = 0;
        
        try {
            // TODO: kulon metodus: tryWriteFile()
            /* 
            A jelszó, a felhasználónév és a 
            használati helye a passList 
            objektumban van tárolva            
            */
            // FIXME: proper name for Store object
            Store passList = new Store(b, c, d);
            FileWriter f = new FileWriter("pass.txt");
            PrintWriter pwr = new PrintWriter(f);
            pwr.print(passList.user);
            if(!passList.hollow()) { pwr.print(passList.retrieval()); }
            pwr.print(passList.place);
            pwr.close();
            iSiker = 1;
        } catch (IOException e) {
            System.err.println("Hiba! A fájlbaírás sikertelen. Keresse meg a fejlesztőt.");
        }

        // FIXME: break lines
        if(iSiker == 1) { System.out.println("Ok. A kiírás sikeres.");  }else {  System.out.println("Hiba! A kiírás sikertelen"); }

    }

    public static void nevjegy() {
        System.out.println("Nagy János");
    }
}
