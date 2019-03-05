
package carrepairshop;

import java.util.Scanner;

public class CarRepairShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bender = new Scanner(System.in);
        int remontAudi = 0;
        int remontMercedes = 0;
        int loop;
        System.out.println("Open: 1\nExit: 2");
        loop = bender.nextInt();
        while (loop == 1) {

            System.out.println("Esli u vas Audi vvedit: 1\nEsli u vas Mercedes vvedite: 2");
            int marca = bender.nextInt();

            switch (marca) {
                
                
                case 1:
                    Audi audi = new Audi();
                    RemontAudi remontA = new RemontAudi();
                    remontA.ZaprosAudi();
                    int uslugaAudi = bender.nextInt();

                    switch (uslugaAudi) {
                        case 1:
                            remontAudi += audi.remontPodvesci;
                            System.out.println("Summa Audi = " + remontAudi);
                            break;
                        case 2:
                            remontAudi += audi.remontDvigotelia;
                            System.out.println("Summa Audi = " + remontAudi);
                            break;
                        case 3:
                            remontAudi += audi.zamenaMasel;
                            System.out.println("Summa Audi = " + remontAudi);
                            break;
                        case 4:
                            remontAudi += audi.zamenaFiltre;
                            System.out.println("Summa Audi = " + remontAudi);
                            break;
                        case 5:
                            remontAudi += audi.diagnostica;
                            System.out.println("Summa Audi = " + remontAudi);
                            break;
                        case 6:
                            remontAudi += audi.razval;
                            System.out.println("Summa Audi = " + remontAudi);
                            break;
                        case 7:
                            remontAudi += audi.remontVihlopa;
                            System.out.println("Summa Audi = " + remontAudi);
                            break;
                        case 8:
                            remontAudi += audi.remontToplivnoiSystem;
                            System.out.println("Summa Audi = " + remontAudi);
                            break;
                        default:
                            System.out.println("!!!!!EROR!!!!!");

                    }
                    break;
                case 2:
                    Mercedes mercedes = new Mercedes();
                    RemontM remontm =new RemontM();
                    remontm.ZaprosMercedes();
                    
                    int uslugaMercedes = bender.nextInt();

                    switch (uslugaMercedes) {
                        case 1:
                            remontMercedes += mercedes.remontPodvesci;
                            System.out.println("Summa Mercedes = " + remontMercedes);
                            break;
                        case 2:
                            remontMercedes += mercedes.remontDvigotelia;
                            System.out.println("Summa Mercedes = " + remontMercedes);
                            break;
                        case 3:
                            remontMercedes += mercedes.zamenaMasel;
                            System.out.println("Summa Mercedes = " + remontMercedes);
                            break;
                        case 4:
                            remontMercedes += mercedes.zamenaFiltre;
                            System.out.println("Summa Mercedes = " + remontMercedes);
                            break;
                        case 5:
                            remontMercedes += mercedes.diagnostica;
                            System.out.println("Summa Mercedes = " + remontMercedes);
                            break;
                        case 6:
                            remontMercedes += mercedes.razval;
                            System.out.println("Summa Mercedes = " + remontMercedes);
                            break;
                        case 7:
                            remontMercedes += mercedes.remontVihlopa;
                            System.out.println("Summa Mercedes = " + remontMercedes);
                            break;
                        case 8:
                            remontMercedes += mercedes.remontToplivnoiSystem;
                            System.out.println("Summa Mercedes = " + remontMercedes);
                            break;
                    }
                    break;
            }
            System.out.println("Next: 1\nExit: 2");
            loop = bender.nextInt();

        }
        System.out.println("Summa Audi:" + remontAudi + "\nSumma Mercedes=" + remontMercedes);
    }
}
