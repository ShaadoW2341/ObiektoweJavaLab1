public class Kwadrat {

    private double a;
    private String name = "kwadrat";

    public double pole(double a){
        return a * a;
    }

    public double obwod(double a){
        return 4*a;
    }

    public void view(){
        System.out.println("Figura: "+name+ "\nbok: "+ a + "\nPole kwadratu: "+ pole(a)+ "\nObwód kwadratu " + obwod(a));
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
