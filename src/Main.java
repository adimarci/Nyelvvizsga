import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
    sikeresBeolvas();
   // sikertelenBeolvas();
    }

    public static void sikeresBeolvas() throws Exception {
        ArrayList sikeresLista=new ArrayList();
        File file = new File("sikeres.csv");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String sor=br.readLine();

        while (sor!=null){
            sikeresLista.add(sor);
            String [] sorSplit=sor.split(";");
            String Nyelvek=sorSplit[0];
            String kilenc=sorSplit[1];
            String tiz=sorSplit[2];
            String tizenegy=sorSplit[3];
            String tizenketto=sorSplit[4];
            String tizenharom=sorSplit[5];
            String tizennegy=sorSplit[6];
            String tizenot=sorSplit[7];
            String tizenhat=sorSplit[8];
            String tizenhet=sorSplit[9];

        }

    }

    public static void sikertelenBeolvas() throws Exception {
        ArrayList sikertelenLista=new ArrayList();

        File file = new File("sikeres.csv");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String sor=br.readLine();
        while (sor!=null){
            sikertelenLista.add(sor.lines());
            String [] sorSplit=sor.split(";");
            String Nyelvek=sorSplit[0];
            String kilenc=sorSplit[1];
            String tiz=sorSplit[2];
            String tizenegy=sorSplit[3];
            String tizenketto=sorSplit[4];
            String tizenharom=sorSplit[5];
            String tizennegy=sorSplit[6];
            String tizenot=sorSplit[7];
            String tizenhat=sorSplit[8];
            String tizenhet=sorSplit[9];

        }
    }

}
