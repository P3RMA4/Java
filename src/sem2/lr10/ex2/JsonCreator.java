package sem2.lr10.ex2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class JsonCreator {
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray kniga = new JSONArray();

        JSONObject kniga1 = new JSONObject();
        kniga1.put("title","Нэнси Дрю. Проклятие: повесть");
        kniga1.put("author","Микол Остоу");
        kniga1.put("year",2022);

        JSONObject kniga2 = new JSONObject();
        kniga2.put("title","НЭНСИ ДРЮ и дневник незнакомца");
        kniga2.put("author","Кэролайн Кин");
        kniga2.put("year", 2020);

        kniga.add(kniga1);
        kniga.add(kniga2);

        library.put("kniga",kniga);

        try (FileWriter file = new FileWriter("src/sem2/lr10/ex2/example-json.json"))
        {
            file.write(library.toJSONString());
            System.out.println("Json файл создан.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
