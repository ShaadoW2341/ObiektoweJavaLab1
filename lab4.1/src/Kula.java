public class Kula {
    private double r;
    private String name = "kula";

    public double pole(double r){
        return 4*Math.PI*Math.pow(this.r,2);
    }


    public void view(){
        System.out.println("Figura: "+name+ "promień: "+ r + " Pole koła: "+ pole(r)+ " Obwód koła " + null);
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
