package baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileCSV {
   public static void wirteFile (List<Staff> list,String path) throws FileNotFoundException {
       try {
           PrintWriter printWriter = new PrintWriter(path);
           String str = "name, type, status, salary \n ";
           for (Staff s:list) {
               str+= s.getName()+","+s.getType()+","+s.getStatus()+","+s.getSalary()+"\n";
           }
           printWriter.println(str);
           printWriter.close();
       }catch (Exception e){
           e.printStackTrace();
       }
   }

   public static List<Staff> readFile(String path) throws IOException {
       List<Staff> list1=new ArrayList<>();
       FileReader fileReader = new FileReader(path);
       BufferedReader bufferedReader= new BufferedReader(fileReader);
       String content =bufferedReader.readLine() ;
       while ((content =bufferedReader.readLine())!=null){
         if(content.equals("")){
             break;
         }
           String [] value = content.split(",");
           System.out.println(content);
           list1.add(new Staff(value[0],value[1],value[2],Integer.parseInt(value[3]) ));
       }
       bufferedReader.close();
       return list1;
   }
}
