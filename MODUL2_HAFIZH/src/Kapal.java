public class Kapal extends TransportasiAir {
    protected String mesin;

    public Kapal(int JumlahKursi, int biaya, String mesin){
        super(JumlahKursi, biaya);
        this.mesin = mesin;
    }
    
    @Override
    public void informasi() {
        System.out.println("Transportasi Air jenis kapal dengan kursi berjumlah "+ JumlahKursi + "ditetapkan dengan biaya sebesar Rp"+ biaya);
    }

    @Override
    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis kapal sedang berlayar menggunakan mesin"+ mesin +" dengan kecepatan yang tidak stabil");
    }

    public void berlayar(int kecepatan){
        System.out.println("Transportasi Air dengan jenis kapal sedang berlayar dengan menggunakan mesin "+ mesin +" dengan kecepatan stabil di kisaran"+ kecepatan +" knot");  
    }

    @Override
    public void berlabuh(){
        System.out.println("Transportasi Air dengan kapal berlabuh di pantai");
    }
    
}
    