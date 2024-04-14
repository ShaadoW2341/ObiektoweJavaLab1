public class Prostopadloscian {

    private double a,b,c;
    private String name = "prostopadłościan";

    public double pole(double a, double b, double c){
        return ((2*a)*b)+((2*b)+c)+((2*a)*c);
    }

    public double obwod(double a,double b, double c){
        return (4*a)+(4*b)+(4*c);
    }

    public void view(){
        System.out.println("Figura: "+name+ " bok1: "+ a +" bok2: " + b + " bok3: " + c
                + " Pole prostopadłościanu: "+ pole(a,b,c)+ " Obwód prostopadłościanu " + obwod(a,b,c));
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
