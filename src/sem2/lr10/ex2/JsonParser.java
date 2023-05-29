package sem2.lr10.ex2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JsonParser {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/sem2/lr10/ex2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: "+jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("kniga");

            for (Object o: jsonArray)
            {
                JSONObject kniga = (JSONObject) o;
                System.out.println("\nТекущий элемент: kniga");
                System.out.println("Название книги: "+kniga.get("title"));
                System.out.println("Автор: "+kniga.get("author"));
                System.out.println("Год издания: "+kniga.get("year"));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}