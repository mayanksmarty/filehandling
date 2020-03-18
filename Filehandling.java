import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filehandling {
    public static void main(String[] args) throws IOException, IOException {
        // Accept a string
        String str = "File Handling in Java using "+
                " FileWriter and FileReader";

        // attach a file to FileWriter
        FileWriter fw=new FileWriter("F:\\nucleus assignment\\BRD-File Upload\\output.txt",true);
      //  System.out.println("File extension is: "+getFileExtension(file));
        // read character wise from string and write
        // into FileWriter
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));

        System.out.println("Writing successful");
        //close the file
        fw.close();
    }
    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }

}
