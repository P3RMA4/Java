package ex8.primer;

import java.io.*;

public class ex10 {
 public static void main (String[] args) throws IOException {
     BufferedReader br=null;
     PrintWriter out =null;
     try{
         br=new BufferedReader(new InputStreamReader(new FileInputStream("D:\\1\\Text1.txt"),"UTF-8"));
         out = new PrintWriter("D:\\1\\Text2.txt","UTF-8");
         int lineCount=0;
         String s; while ((s=br.readLine())!= null)
         {
             lineCount++;
             out.println(lineCount+": "+ s);
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

