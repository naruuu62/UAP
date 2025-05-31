package uap.mains;

import java.util.Scanner;
import uap.models.sphere;
import uap.models.torus;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("=============================================");

        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double R = input.nextDouble(); // input: 7
        System.out.print("Isikan radius   : ");
        double r = input.nextDouble(); // input: 3.5
        System.out.println("=============================================");

        torus torus = new torus("bundaran",R, r);
        torus.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double radius = input.nextDouble(); // input: 21
        System.out.println("=============================================");

        sphere spher = new sphere("lingkaran", radius);
        spher.printInfo();

        System.out.println("=============================================");
    }
}
