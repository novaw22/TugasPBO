public class Main{
	public static void main(String[]args){
		hp myHp=new hp("Samsung",3);
		myHp.setNomor(2201);
		myHp.setPulsa(50);
		System.out.println("Pulsa Anda="+myHp.getPulsa());
		myHp.info();
		hpSeken seken=new hpSeken();
		seken.setNomor(1234);
		seken.setPulsa(100);
		seken.getNomor();
		System.out.println("Pulsa Anda="+seken.getPulsa());
		seken.setHarga(1500000);
		seken.tampilkanHarga();
		seken.nomor=5432;
	}
}	