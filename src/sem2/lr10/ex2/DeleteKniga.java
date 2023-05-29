package sem2.lr10.ex2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class DeleteKniga {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser
                    .parse(new FileReader("src/sem2/lr10/ex2/example-json.json"));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
        JSONObject library =  (JSONObject) obj;
        JSONArray knigas = (JSONArray) library.get("kniga");
        System.out.println("Введите название книги, которую хотите удалить: ");
        String title = in.nextLine();
        Iterator iterator = knigas.iterator();
        while (iterator.hasNext()) {
            JSONObject kniga = (JSONObject) iterator.next();
            if (title.equals(kniga.get("title"))) {
                iterator.remove();
            }
        }
        try(FileWriter file = new FileWriter("src/sem2/lr10/ex2/example-json.json"))
        {
            file.write(library.toJSONString());
            System.out.println("Книга "+title+" удалена.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}