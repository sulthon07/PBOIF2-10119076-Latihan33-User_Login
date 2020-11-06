/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan33.user.login;
import java.util.Scanner;
/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : User Login
 */
public class PBOIF210119076Latihan33UserLogin {
private static String usName, passWord;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        

        System.out.print("Masukkan Username = ");

        input = scanner.nextLine();

        usName = input;

        

        System.out.print("Masukkan Password = ");

        input = scanner.nextLine();

        passWord = input;

        

        System.out.println("");

        Login user = new Login();

        user.pengecekkanLogin(usName, passWord);
    }
    
}
