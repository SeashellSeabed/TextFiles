import java.util.*;
import java.io.*;

public class Text{

    public static void main(String[]args) throws IOException{
        //initialize ts
        File file = new File("pokemon.csv");
        
        Scanner scan = new Scanner(file);

        String [] pokemonLines = new String[10];
        int i = 0;
        while(scan.hasNext() && i < 10){
            String line = scan.nextLine();
            pokemonLines[i] = line;
            System.out.println(line);
            
            i++;
        }
        scan.close();
    }
}