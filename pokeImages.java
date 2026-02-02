import java.util.*;
import java.io.*;

public class pokeImages {
    private static File fileName = new File("pokemon.csv");
    private String[] pokemonLines = new String[152];


    private static int readFile() throws FileNotFoundException{
    Scanner scan = new Scanner(fileName);
        int i = 0;
        while(scan.hasNext() && i < 152){
            i++;
        }
        scan.close();
        return i;
    }

    public static void main(String[]args) throws IOException{
        System.out.println(readFile());
       
    }
    
}
