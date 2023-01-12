package ex8.primer;

import java.io.*;
import java.util.Objects;

public class ex7 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=null;
        BufferedWriter out=null;
        try{
            br=new BufferedReader(new FileReader("C:\\Папка1\\Text1.txt"),1024);
            out= new BufferedWriter(new FileWriter("C:\\Папка1\\Text2.txt"));
        int lineCount=0;
        String s;
        while ((s=br.readLine())!=null) {
            lineCount++;
            System.out.println(lineCount+": "+s);
            out.write(s);
            out.newLine();
        }
        }catch (IOException e)
        {
            System.out.println("Ошибка !!!!!");
        }
        finally{
            if (br != null) {
                br.close();
            }
            if (out != null) {
                out.flush();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
