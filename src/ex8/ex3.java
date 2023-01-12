package ex8;

import java.io.*;

public class ex3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try{
            br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\1\\Ex3in.txt"),"UTF-8"));
            out = new PrintWriter("D:\\1\\Ex3out.txt","UTF-8");
            int lineCount = 1;
            int Score;
            String letters = "ЙйЦцКкНнГгШшЩщЗзХхФфВвПпРрЛлДдЖжЧчСсМмТтБб";
            String s;
            while ((s = br.readLine()) != null)
            {
                Score = 0;
                for (String word : s.split("\\s+")){
                    if (letters.contains(word.substring(0,1))){
                        Score++;
                        out.println(word);
                    }
                }
                out.println(lineCount + " строка, количество выбранных слов = " + Score);
                lineCount++;
                out.println();
            }
        }
        catch (IOException e)
        {
            System.out.println("Ошибка!!!!!!!!!");
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }

    }
}
