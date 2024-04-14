public class Szescian{

    private double a;
    private String name = "sześcian";

    public double pole(double a){
        return 6*(a*a);
    }

    public double obwod(double a){
        return 12*a;
    }

    public void view(){
        System.out.println("Figura: "+name+ " bok: "+ a + " Pole sześcianu: "+ pole(a)+ " Obwód sześcianu " + obwod(a));
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
