package co.learning.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadFile {

    public static void main(String[] args) throws Exception {
       FileInputStream fin =  new FileInputStream("src/co/learning/io/new 2.txt");

       /*System.out.println("No.of characters to read = "+fin.available());
        System.out.println(fin.read());
        System.out.println((char)fin.read());
        System.out.println("No.of characters to read = "+fin.available());*/

        //to read complete file contents charactar by character
      /* int n = fin.read(); //reads first character ascii value
        while(n != -1){ //to check whether the file end is reached or not . if returns -1 file end reached.
           System.out.println((char)n);//convert the ascii value into char
            n = fin.read();//reads next character ascii value
            Thread.sleep(150);//there will be dealy of 150ms
        }*/

        //to read file contents completely at a stretch
     /*   byte[] b = new byte[fin.available()]; // each character's ascii value to be store in the byte array
        fin.read(b);//read the complete contents of the file and write that  into the byte array
        String str = new String(b);//converting byte arr to string
        System.out.println(str);*/

        //to read file contents line-by-line
       /* InputStreamReader fs = new InputStreamReader(fin);//to convert byte stream to char stream
        BufferedReader br = new BufferedReader(fs);//give the char stream to bufferedreader
        String line;//reads first line then second line.......
        while((line=br.readLine()) != null) {
            System.out.println(line);
            Thread.sleep(2000);
        }
     fin.close();
        br.close();*/

        //to read data from console
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String name = br1.readLine();
        System.out.println("name is "+name);
    }
}
