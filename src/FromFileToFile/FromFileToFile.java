/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FromFileToFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/*
 * A java example source code to demonstrate
 * the use of newLine() method of BufferedWriter class
 */
public class FromFileToFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        try (FileInputStream fis = new FileInputStream("C:\\Users\\tavar\\OneDrive\\Desktop\\pvz.txt");
                InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
                BufferedReader br = new BufferedReader(isr);
                FileOutputStream fis2 = new FileOutputStream("C:\\Users\\tavar\\OneDrive\\Desktop\\pvz2.txt");
                OutputStreamWriter isr2 = new OutputStreamWriter(fis2, "UTF-8");
                BufferedWriter bf = new BufferedWriter(isr2);) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

                String[] arr = line.split(" ");

                List<String> s = new ArrayList();

                for (String x : arr) {
                    s.add(x);
                }

                s.sort((v1, v2) -> v2.length() - v1.length());
                System.out.println(s);

                for (int i = 0; i < s.size(); i++) {
                    bf.write(s.get(i) + "\n");
                    System.out.println(s.get(i));
                }
            }
        }
    }
}