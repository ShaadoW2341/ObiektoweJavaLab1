import java.util.Scanner;

public class Run {

public void Runing(){
    int wybor;
    while(true){
        Menu();
        wybor = InputInt();
        switch (wybor){
            case 1 -> viewKolo();
            case 2 -> viewKwadrat();
            case 3 -> viewProstokat();
            case 4 -> viewSzescian();
            case 5 -> viewProstopadloscian();
            default -> defaultInstruction();
        }
    }

}


    private void defaultInstruction() {

    }

    private void viewKolo() {
        Kolo kolo = new Kolo();
        System.out.println("Podaj promień: ");
        double r = InputDouble();
        if (r>0){
            kolo.setR(r);
        }else {
            System.out.println("Podano liczbę ujemną zmieniam ją na liczbę dodatnią. r = " + Math.abs(r));
            kolo.setR(Math.abs(r));
        }
        kolo.view();
    }

    private void viewKwadrat() {
        Kwadrat kwadrat = new Kwadrat();
        System.out.println("Podaj bok: ");
        double a = InputDouble();
        if (a>0){
            kwadrat.setA(a);
        }else{
            System.out.println("Podano liczbę ujemną zmieniam ją na liczbę dodatnią. a = "+ Math.abs(a));
            kwadrat.setA(Math.abs(a));
        }
        kwadrat.view();
    }

    private void viewProstokat() {
        Prostokat prostokat = new Prostokat();
        System.out.println("Podaj boki: ");
        double a = InputDouble();
        double b = InputDouble();
        if (a>0 && b>0){
            prostokat.setA(a);
            prostokat.setB(b);
        }else{
            System.out.println("Podano liczbę ujemną zmieniam ją na liczbę dodatnią. a = "+ Math.abs(a)+ " b = "+ Math.abs(b));
            prostokat.setA(Math.abs(a));
            prostokat.setB(Math.abs(b));
        }
        prostokat.view();
    }

    private void viewSzescian() {
        Szescian szescian = new Szescian();
        System.out.println("Podaj bok: ");
        double a = InputDouble();
        if (a>0){
            szescian.setA(a);
        }else{
            System.out.println("Podano liczbę ujemną zmieniam ją na liczbę dodatnią. a = "+ Math.abs(a));
            szescian.setA(Math.abs(a));
        }
        szescian.view();
    }

    private void viewProstopadloscian() {
        Prostopadloscian prostopadloscian = new Prostopadloscian();
        System.out.println("Podaj boki: ");
        double a = InputDouble();
        double b = InputDouble();
        double c = InputDouble();
        if (a>0 && b>0 && c>0){
            prostopadloscian.setA(a);
            prostopadloscian.setB(b);
            prostopadloscian.setC(c);
        }else{
            System.out.println("Podano liczbę ujemną zmieniam ją na liczbę dodatnią. a = "+ Math.abs(a)+ " b = "+ Math.abs(b) + " c = "+Math.abs(c));
            prostopadloscian.setA(Math.abs(a));
            prostopadloscian.setB(Math.abs(b));
            prostopadloscian.setC(Math.abs(c));
        }
        prostopadloscian.view();
    }

    public void Menu(){
        System.out.println("Menu programu \n1.Koło\n2.Kwadrat\n3.Prostokąt\n4.Sześcian\n5.Prostopadłościan");
}


public int InputInt(){
    Scanner scan = new Scanner(System.in);
    int liczba  = scan.nextInt();
    return liczba;
}
public double InputDouble(){
    Scanner scan = new Scanner(System.in);
    double liczba  = scan.nextDouble();
    return liczba;
}
    
}
