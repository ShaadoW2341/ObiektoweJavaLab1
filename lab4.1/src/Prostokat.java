public class Prostokat {

    private double a,b;
    private String name = "prostokąt";

    public double pole(double a, double b){
        return a * b;
    }

    public double obwod(double a,double b){
        return (2*a)+(2*b);
    }

    public void view(){
        System.out.println("Figura: "+name+ " bok1: "+ a +" bok2: " + b
                + " Pole prostokąta: "+ pole(a,b)+ " Obwód prostokąta " + obwod(a,b));
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
