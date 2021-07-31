package co.learning.io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

public class FileWrite {
    public static void main(String[] args) throws Exception {
        String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.";

        //to create a file and write this data in that file
        FileOutputStream fout = new FileOutputStream("src/co/learning/io/java.txt");//in file o/p stream if file already exists with some content and we run that file then iw vl del all the contents from the file and if you dont want that to happend follow the below step!

        //FileOutputStream fout = new FileOutputStream("src/co/learning/io/java.txt", true);//true - appending

        byte[] data = str.getBytes();//to convert string -> byte arr
        fout.write(data);
        System.out.println("file saved!!!");

        fout.close();

        //using filewriter u dont wont to convert string -> byte arr instead u can directly write the data to file

        FileWriter fw = new FileWriter("src/co/learning/io/java1.txt");
        fw.write(str);
        fw.close();
        System.out.println("file saved****");


    }
}
