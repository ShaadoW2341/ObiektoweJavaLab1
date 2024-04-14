public class Kolo {
    private double r;
    private String name = "kolo";

    public double pole(double r){
        return Math.PI*Math.pow(this.r,2);
    }

    public double obwod(double r){
        return 2*Math.PI*r;
    }

    public void view(){
        System.out.println("Figura: "+name+ "promień: "+ r + " Pole koła: "+ pole(r)+ " Obwód koła " + obwod(r));
    }

    public void view1(){
        System.out.format("Figura %s, promień r = %.2f pole: " + "%.2f, obwód: %.2f", name,r,pole(r), obwod(r));
    }
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
