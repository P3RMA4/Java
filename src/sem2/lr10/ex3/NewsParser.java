package sem2.lr10.ex3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.*;
import java.net.UnknownHostException;

public class NewsParser {
    public static void main(String[] args) throws InterruptedException, IOException {
        for (var t = 0; t < 3; t++) {
            Document doc = null;
            try {
                doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
            } catch (UnknownHostException e) {
                Thread.sleep(1000);
                continue;
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (doc == null) {
                return;
            }

            var newsParent = doc.select(
                    "body > table > tbody > tr > td > div > table > " + "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " + "tr > td:nth-child(1)");

            try (var fileWriter = new FileWriter("C:/Users/assur/Desktop/git/src/sem2/lr10/ex3/info.txt")) {
                for (var i = 3; i < 20; i++) {
                    if (i % 2 == 1) {
                        var nodes = newsParent.get(0).childNodes();
                        var title = ((Element) nodes.get(i)).getElementsByClass("blocktitle").get(0).childNodes()
                                .get(0);
                        var date = ((Element) nodes.get(i)).getElementsByClass("blockdate").get(0).childNodes().get(0);

                        System.out.println("Тема: " + title);
                        System.out.println("Дата: " + date);

                        fileWriter.write(title.toString() + "\n");
                        fileWriter.write(date.toString() + "\n\n");

                        System.out.println();
                    }
                }
            }
        }
    }
}