/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan33.user.login;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : User Login
 */
public class Login {
     private static String username = "RizkiAdam";

    private static String password = "terbaikselalu";

    private boolean statusAkun;

    

    private boolean cekAkun(String parUserName, String parPassword) {

        return (parUserName.equals(username))? 

                (parPassword.equals(password)) : false;

    }

    

    private void hasilLogin(boolean status, String parUserName) {

        if(status) {

            System.out.println("******HALLO ".concat(parUserName.toUpperCase()).concat("******"));

            System.out.println("Selamat Datang di Aplikasi ini");

        } else {

            System.out.println("Ooops, Username atau Password anda salah");

        }

    }

    

    public void pengecekkanLogin(String parUserName, String parPassword) {

        hasilLogin(cekAkun(parUserName, parPassword), parUserName);

    }

}

