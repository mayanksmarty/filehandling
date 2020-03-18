import java.io.*;
import java.util.StringTokenizer;


public class Filedata {
    public static void main(String[] args) throws IOException {

        try {
            FileReader file = new FileReader("F:\\nucleus assignment\\BRD-File Upload\\Test Cases\\testCase1.txt");
            File fr = new File("F:\\nucleus assignment\\BRD-File Upload\\Test Cases\\testCase1.txt");
            System.out.println("File extension is: " + getFileExtension(fr));
            BufferedReader br = new BufferedReader(file);
            String str = br.readLine();
            while (str != null) {
                StringTokenizer st = new StringTokenizer(str, "~");
                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    System.out.println(s);
                }
                System.out.println();
                str=br.readLine();
            }
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }




    }
    private static String getFileExtension (File fr){
        String fileName = fr.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        else return "";
    }
}
