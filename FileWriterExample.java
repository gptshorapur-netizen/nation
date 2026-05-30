import java.io.FileWriter;
public class FileWriterExample{
public static void main(String args[]){
try{
FileWriter fw=new FileWriter("D:\\mohammed.txt");
fw.write("hey! prema");
fw.close();
}
catch(Exception e){
System.out.println(e);
}
System.out.println("succes........!");
}
}