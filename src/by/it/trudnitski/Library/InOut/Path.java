package by.it.trudnitski.Library.InOut;

import java.io.File;

public class Path {
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

    public static String getPath(Class<?> aClass, String filename) {
        return getPath(aClass) + filename;
    }
}
