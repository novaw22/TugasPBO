public class hp {
	public int nomor;
	private int pulsa;
	private int baterai;
	private String merek;

public void setNomor(int angka){
	nomor=angka;
}

public void getNomor(){
	System.out.println("Nomor="+nomor);
}

public void setPulsa(int nominal){
	pulsa=nominal;
}

public int getPulsa(){
	return (pulsa);
}

public hp(String m, int b){
	merek=new String(m);
	baterai=b;
}

public hp(){
	System.out.println("Object created");
}

public void info(){
	System.out.println("HP ANDA");
	System.out.println("Nomor="+nomor);
	System.out.println("Pulsa="+pulsa);
	System.out.println("Baterai");
	if(baterai>2){
		System.out.println("Oke");
	}else{
		System.out.println("Kurang");
	}
	System.out.println("Merek="+merek);
}
}