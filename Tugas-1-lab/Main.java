import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (Putri Mahela)
 * (1908107010007)
 */
public class Main
{
   public static void main (String[] args)
   {
       int menu;
       int pilihan;
       
       Bus a = new Bus();
       Scanner input = new Scanner(System.in);
       
       System.out.println("===== BUS TRANS KOETARADJA =====\n");
       System.out.println("MENU :\n");
       System.out.println("1. Naikkan Penumpang");
       System.out.println("2. Turunkan Penumpang");
       System.out.println("3. Lihat Penumpang");
       System.out.println("\nPilihan : ");
       menu = input.nextInt();
       
       if(menu == 1)
       {
           System.out.print("Nama : ");
           String nama = input.next();
           System.out.print("Umur : ");
           int umur = input.nextInt();
           System.out.print("Hamil (y/n) : ");
           Boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("y")?true:false;
           
           Penumpang penumpang = new Penumpang(nama, umur, hamil);
           a.naik(penumpang);
           a.toString();
           System.out.println("=============================");
       }
       else if(menu == 2)
       {
           System.out.print("Nama : ");
           String nama = input.next();
           a.turun(nama);
           a.toString();
           System.out.println("=============================");
       }
       else if(menu == 3)
       {
           a.toString();
           System.out.println("=============================");
       }

   }
}
