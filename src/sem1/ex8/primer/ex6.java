package sem1.ex8.primer;

import java.io.*;

public class ex6 {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("D:\\1\\Text1.txt");
            out = new FileWriter("D:\\1\\Text2.txt", true);
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.write((char)oneByte);
                out.append((char)oneByte);
                System.out.print((char)oneByte);
            }
        }
            catch (IOException e)
            {
                System.out.println("Ошибка!!!");
            }
            finally{
                in.close();
                out.close();
            }
        }
    }

