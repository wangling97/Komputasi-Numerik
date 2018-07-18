package views;

import java.util.Scanner;
import controller.*;
import util.*;

public class Menu
{
	public void judul()
	{
		help.getClearConsole();
		System.out.println("===================================================");
        System.out.println("=                   Project UAS                   =");
        System.out.println("=            Aplikasi Komputasi Numerik           =");
        System.out.println("=               STMIK Banisaleh 2018              =");
        System.out.println("===================================================");
        System.out.println("=                   DIBUAT OLEH                   =");
        System.out.println("= Nama  : Muhammad Faturrahman                    =");
        System.out.println("= NPM   : 43A87006160078                          =");
        System.out.println("= Kelas : S1 / 4B / Malam                         =");
        System.out.println("= Dosen : Taufik Maulana                          =");
	}
	
	public void utama()
	{
		this.judul();
		System.out.println("===================================================");
        System.out.println("=                    Main Menu                    =");
        System.out.println("===================================================");
        System.out.println("= 1. Penjumlahan Bilangan Pecahan                 =");
        System.out.println("= 2. Konversi Bilangan                            =");
        System.out.println("= 3. Menghitung Galat                             =");
        System.out.println("= 4. Akar Persamaan Non Linier                    =");
        System.out.println("= 5. Interpolasi                                  =");
        System.out.println("= 6. Turunan Numerik                              =");
        System.out.println("= 7. Integral");
        System.out.println("= 8. Keluar                                       =");
        System.out.println("===================================================");
        System.out.print("Pilih Menu = ");
        process.menu.utama(input.nextInt());
	}
	
	public void konversi()
    {
        this.judul();
        System.out.println("===================================================");
        System.out.println("=                Konversi Bilangan                =");
        System.out.println("===================================================");
        System.out.println("= 1. Input Biner                                  =");
        System.out.println("= 2. Input Oktal                                  =");
        System.out.println("= 3. Input Desimal                                =");
        System.out.println("= 4. Input Hexadesimal                            =");
        System.out.println("= 5. Input Pecahan Biner                          =");
        System.out.println("= 6. Input Pecahan Oktal                          =");
        System.out.println("= 7. Input Pecahan Desimal                        =");
        System.out.println("= 8. Input Pecahan Hexadesimal                    =");
        System.out.println("= 9. Kembali                                      =");
        System.out.println("===================================================");
        System.out.print("Pilih Menu = ");
        process.menu.konversi_bilangan(input.nextInt());
    }
	
	public void galat()
    {
        this.judul();
        System.out.println("===================================================");
        System.out.println("=                 Menghitung Galat                =");
        System.out.println("===================================================");
        System.out.println("= 1. Galat Relatif & Galat Mutlak                 =");
        System.out.println("= 2. Penjalaran Galat                             =");
        System.out.println("= 3. Kembali                                      =");
        System.out.println("===================================================");
        System.out.print("Pilih Menu = ");
        process.menu.galat(input.nextInt());
    }
    
    public void nonlinier()
    {
        this.judul();
        System.out.println("===================================================");
        System.out.println("=            Akar Persamaan Non Linier            =");
        System.out.println("===================================================");
        System.out.println("= 1. Metode Titik Tetap                           =");
        System.out.println("= 2. Metode Bagi Dua                              =");
        System.out.println("= 3. Metode Regula Falsi                          =");
        System.out.println("= 4. Metode Newton Raphson                        =");
        System.out.println("= 5. Metode Scant                                 =");
        System.out.println("= 6. Kembali                                      =");
        System.out.println("===================================================");
        System.out.print("Pilih Menu = ");
        process.menu.nonlinier(input.nextInt());
    }
    
    public void interpolasi()
    {
        this.judul();
        System.out.println("===================================================");
        System.out.println("=                    Interpolasi                  =");
        System.out.println("===================================================");
        System.out.println("= 1. Pendekatan Lagrange                          =");
        System.out.println("= 2. Polinomial Newton                            =");
        System.out.println("= 3. Kembali                                      =");
        System.out.println("===================================================");
        System.out.print("Pilih Menu = ");
        process.menu.interpolasi(input.nextInt());
    }
    
    public void turunan()
    {
    	this.judul();
        System.out.println("===================================================");
        System.out.println("=                  Turunan Numerik                =");
        System.out.println("===================================================");
        System.out.println("= 1. Formula Limit Selisih Bagi                   =");
        System.out.println("= 2. Formula Terpusat Order O(h2)                 =");
        System.out.println("= 3. Formula Terpusat Order O(h4)                 =");
        System.out.println("= 4. Kembali                                      =");
        System.out.println("===================================================");
        System.out.print("Pilih Menu = ");
        process.menu.turunan(input.nextInt());
    }
    
    public void integral()
    {
    	this.judul();
        System.out.println("===================================================");
        System.out.println("=                 Integral Numerik                =");
        System.out.println("===================================================");
        System.out.println("= 1. Metode Trapesium                             =");
        System.out.println("= 2. Metode Aturan Simpson                        =");
        System.out.println("= 3. Metode Romberg                               =");
        System.out.println("= 4. Kembali                                      =");
        System.out.println("===================================================");
        System.out.print("Pilih Menu = ");
        process.menu.integral(input.nextInt());
    }
	
	public Util help = new Util();
	public Scanner input = new Scanner(System.in);
	public static Controller process = new Controller();
}
