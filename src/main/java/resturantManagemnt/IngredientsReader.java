package resturantManagemnt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class IngredientsReader {
    public static void Reader() {
        FileReader file;
        try {
          file= InputReader.Reader("Ingredients.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner  scan=new Scanner(file);

       while(scan.hasNextLine()) {
           String vals=scan.nextLine();
           //System.out.println(vals);
           String[] arrvals=vals.split(" ");
           //System.out.print(arrvals[0]);
           for (Ingrediants itr:Ingrediants.values()) {
               if(arrvals[0].equalsIgnoreCase(itr.name().toString())){
                   itr.setQuantity(Integer.parseInt(arrvals[1]));
                   itr.setPrice(Integer.parseInt(arrvals[2]));
                   break;
               }
           }

           }

        }
    }
