/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zyanken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author try
 */
public class Zyanken {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str1 = "グー";
            String str2 = br.readLine();
            if ("グー".equals(str1) && "パー".equals(str2)) {
                System.out.println("負け");
            } else if ("グー".equals(str1) && "チョキ".equals(str2)) {
                System.out.println("勝ち");
            } else if ("グー".equals(str1) || str1.equals(str2)) {
                System.out.println("引き分け");

            }

        }

    }
}
