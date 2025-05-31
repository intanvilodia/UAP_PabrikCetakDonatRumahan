package uap.mains;

import java.util.Scanner;
import uap.models.Sphere;
import uap.models.Torus;

//class utama yang menjalankan kalkulator cetakan
public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //untuk Header
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("INTAN VILODIA PUTRI");
        System.out.println("245150701111003");
        System.out.println("=============================================");

        //donat dengan lubang
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double R = scanner.nextDouble(); //user diminta untuk mengisi input
        System.out.print("Isikan radius   : ");
        double r = scanner.nextDouble(); //user diminta untuk mengisi input

        Torus torus = new Torus(R, r);
        System.out.println("=============================================");
        torus.printInfo();

        //donat tanpa lubang
        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double rs = scanner.nextDouble(); //user diminta untuk mengisi input

        Sphere sphere = new Sphere(rs);
        System.out.println("=============================================");
        sphere.printInfo();
        System.out.println("=============================================");

        scanner.close(); // Tutup input
    }
}