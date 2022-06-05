package resturantManagemnt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.EnumMap;
import java.util.HashMap;

public class InputReader {
    public static FileReader Reader(String infilename) throws FileNotFoundException {
        String filepath="src"+ File.separator+"main"+File.separator+"java"+File.separator+"resturantManagemnt"+File.separator;
        String outfilename = filepath+infilename;
        //  System.out.print(outfilename);

        return new FileReader(outfilename);

    }

    public static void updateReceipe(String recipe) {
        HashMap recipename= new HashMap<>();
        //while (recipe!=null) {
           // System.out.println(recipe);
            String[] arrvals = recipe.split(" ");
            double price = Double.parseDouble((arrvals[arrvals.length - 1]));
            for (int i = 1; i < arrvals.length-1; i += 2) {
                recipename.put(arrvals[i], arrvals[i + 1]);
             }
            for (Receipe itr: Receipe.values()) {
               if(arrvals[0].equalsIgnoreCase(itr.name())){
                   itr.setRecipename(recipename);
                   itr.setPrice(price);
                   break;
               }
           }

        }
}

