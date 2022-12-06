public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int JumlahKursi, int biaya, int layar){
        super(JumlahKursi, biaya);
        this.layar = layar;
    }
    
    @Override
    public void informasi() {
        System.out.println("Transportasi Air jenis sampan dengan kursi berjumlah "+ JumlahKursi + "ditetapkan dengan biaya sebesar Rp"+ biaya);
    }

    @Override
    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis sampang sedang berlayar menggunakan "+ layar +" layar");
    }

    @Override
    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis tidak diketahui berlabuh di pantai dengan jangkar");
    }

    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air dengan jenis sampan berlabuh di pantai menggunakan" + jangkar);
    }
}
