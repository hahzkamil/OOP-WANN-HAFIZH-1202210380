public class App {
    public static void main(String[] args) throws Exception {
    TransportasiAir transportasi = new TransportasiAir(20, 300000);
    transportasi.informasi();
    transportasi.berlayar();
    transportasi.berlabuh(); 

    System.out.println("");

    Sampan sampan = new Sampan(4, 10000, 3);
    sampan.informasi();
    sampan.berlayar();
    sampan.berlabuh(); 
    sampan.berlabuh(3);

    System.out.print("\n");

    Kapal kapal = new Kapal(40, 300000, "diesel");
    kapal.informasi();
    kapal.berlayar();
    kapal.berlayar(40);
    kapal.berlabuh();
    }

}

