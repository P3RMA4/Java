package sem2.lr10.ex2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewKniga {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название книги: ");
        String title = in.nextLine();
        System.out.println("Введите автора: ");
        String author = in.nextLine();
        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser
                    .parse(new FileReader("src/sem2/lr10/ex2/example-json.json"));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }

        JSONObject library =  (JSONObject) obj;
        JSONArray kniga = (JSONArray) library.get("kniga");
        JSONObject newManga = new JSONObject();
        newManga.put("title", title);
        newManga.put("author", author);
        newManga.put("year", 2023);
        kniga.add(newManga);

        library.put("kniga",kniga);
        try(FileWriter file = new FileWriter("src/sem2/lr10/ex2/example-json.json"))
        {
            file.write(library.toJSONString());
            System.out.println("Новая книга добавлена.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}