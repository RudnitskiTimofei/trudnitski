package by.it.trudnitski.Library;

import by.it.trudnitski.Library.Action.Launch;
import by.it.trudnitski.Library.InOut.Input;
import by.it.trudnitski.Library.InOut.Path;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Runner {

    public static void main(String[] args) {
        Input.readFile(Path.getPath(Input.class, "List.csv"));
        Launch launcher = new Launch();
        System.out.println(" You are Welcome in our Library \n" +
                "please choose want you want to do\n" +
                " '1' - Find one book or magazine by genre and first literal\n" +
                " '2' - Sorting library\n" +
                " '3' - Find all pages by choosing genre ");
        try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
            String choose = in.readLine();
            switch (choose){
                case "1":
                    launcher.findOneBook();
                    break;
                case "2":
                    launcher.sorting();
                    break;
                case "3":
                    launcher.findAllPages();
                    break;
                    default:
                        System.out.println("Please next time change numbers up 1 to 3");

            }

        } catch (IOException e) {
            e.printStackTrace();

        }


    }
}
