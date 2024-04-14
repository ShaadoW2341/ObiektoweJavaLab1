class Trojkat extends Figura{
	double wys=0, podst=0;

	Trojkat(double wys, double podst)
	{
		this.wys = wys;
		this.podst = podst;
	}

	public Trojkat(String kolor, double wys, double podst) {
		super(kolor);
		this.wys = wys;
		this.podst = podst;
	}


	@Override
	public String opis(){
		System.out.println("Trojkat o wymiarach: "+podst+" x "+wys+" w kolorze: "+ getKolor());
        return null;
    }

}