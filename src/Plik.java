import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Plik {
    public static void main(String[] args) throws IOException {
        try {
            File plik = new File("plik_tekstowy.txt");
            if (plik.createNewFile()) {
                System.out.println("Stworzony plik");
            } else {
                if(plik.exists()){
                    System.out.println("Nie udało się stworzyć pliku bo istnieje");
                }else{
                    System.out.println("Nie udało się stworzyć pliku bo coś");
                }
            }
        } catch (IOException e) {
            System.out.println("Wywalił się błąd");
        }
        FileWriter plik=new FileWriter("plik_tekstowy.txt");
        plik.write("Zapiszemy coś w pliku");
        plik.write("Coss");
        plik.close();
    }
}
