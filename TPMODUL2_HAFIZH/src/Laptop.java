public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi() {
        System.out.println("Laptop");
        if(webcam==true){
            super.informasi();
            System.out.println("Ada webcam pada perangkat ini");
        }
        else{
            super.informasi();
            System.out.println("Tidak ada webcam pada perangkat ini"); 
        }
    }

    public void bukaGame(String nama_game) {
        System.out.println("Laptop ini sedang membuka game " + nama_game);
    }

    public void kirimEmail(String email) {
        System.out.println("Laptop ini sedang mengirim email ke alamat " + email);
    }

    public void kirimEmail(String email1, String email2) {
        System.out.println("Laptop ini sedang mengirim email ke alamat " + email1 + " dan " + email2);
    }
}