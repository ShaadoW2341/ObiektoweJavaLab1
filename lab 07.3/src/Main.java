//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(2.78898);
        kwadrat.opis();
        Point point = new Point(2,4);
        Point point1 = new Point(4,2);
        Okrag okrag = new Okrag(point,23);
        okrag.opis();
        double pow = okrag.getPowierzchnia();
        System.out.println("Powierzchnia okręgu: "+ pow);
        okrag.wSrodku(point1);


        Figura[] tablicaFigur = new Figura[10];

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                tablicaFigur[i] = new Kwadrat();
            } else {
                tablicaFigur[i] = new Kolo();
            }
        }
    }
}