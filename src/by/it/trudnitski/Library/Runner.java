package by.it.trudnitski.Library;

import by.it.trudnitski.JD02.Task2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    private static Book[] bookArray=new Book[300];
    private static Magazine []magazineArray=new Magazine[300];

    public static void main(String[] args) throws IOException {
        readFile(getPath(Runner.class,"List.txt"));
        int sum=0;
        Book book;
        for (int i = 0; i < bookArray.length; i++) {
            book=bookArray[i];
            sum=sum+book.getPages();

        }
        System.out.println(sum);




    }

    private static void readFile(String filename) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String[]temp=reader.readLine().split(",");
        if (temp.length<5&temp.length!=0){

            for (int i = 0; i < magazineArray.length; i++) {
                magazineArray[i]=new Magazine(temp[0].trim(),Integer.parseInt(temp[1].trim()),temp[2].trim(),Integer.parseInt(temp[3].trim()));
                System.out.println();
            }
        }
        else if (temp.length>4&temp.length!=0){

            for (int i = 0; i <bookArray.length ; i++) {
                bookArray[i]=new Book(temp[0].trim(),temp[1].trim(),Integer.parseInt(temp[2].trim()),Integer.parseInt(temp[3].trim()),temp[4].trim());
            }
        }


        }




    private static String getPath(Class<?> aClass) {
        String root = System.getProperty("user.dir");
        //Получаем строку с адресов в корень каталога
        String name = aClass.getName();
        String simpleName = aClass.getSimpleName();
        String separator = File.separator;
        String path = name.replace(simpleName, "").replace(".", separator);
        path = root + separator + "src" + separator + path;
        return path;
        //Возвращает путь к файлу
    }

    private static String getPath(Class<?> aClass, String filename) {
        return getPath(aClass) + filename;
    }
}
