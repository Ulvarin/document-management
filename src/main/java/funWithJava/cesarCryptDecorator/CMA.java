package funWithJava.cesarCryptDecorator;

import java.io.*;

/**
 * Created by ulvar on 27.08.2016.
 */
public class CMA {


    public static void main(String[] args) throws IOException {

        OutputStream os = new FileOutputStream("C:\\Users\\ulvar\\Documents\\topsecret.txt");
        int key = 5;
        os = new CesarOutputStream(os, key);
        os.write("Ala ma psa".getBytes());
        os.close();


        InputStream in = new FileInputStream("C:\\Users\\ulvar\\Documents\\topsecret.txt");
        //key = -5;
        in = new CesarInputStream(in, key);
        int result;
        int b;
        StringBuilder sb = new StringBuilder();

        while ((b = in.read()) != -1) {
            sb.append((char) b);


        }


        System.out.println(sb.toString());


    }

}


/*
    StringBuilder stringBuilder;
        while(int result = in.read()){

                }
                char ch = (char) result
                builder = builder.append(ch)
*/