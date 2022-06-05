package resturantManagemnt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class AccountReader {

    public static void Reader(){
        FileReader file;
        try {
        file = InputReader.Reader("accounts.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner accountscan=new Scanner(file);
        Account.BALANCE.setInitialbalance(accountscan.nextDouble());
        System.out.println(Account.BALANCE.getInitialbalance());
    }
}
