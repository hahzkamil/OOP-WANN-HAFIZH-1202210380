public class Handphone extends Perangkat {
    protected boolean fingerprint;
  
    public Handphone(String drive, int ram, float processor, boolean fingerprint) {
      super(drive, ram, processor);
      this.fingerprint = fingerprint;
    }
  
    @Override
    public void informasi() {
        System.out.println("Handphone ");
        if(fingerprint==true){
            super.informasi();
            System.out.println("Ada fingerprint pada perangkat ini");
        }
        else{
            super.informasi();
            System.out.println("Tidak ada fingerprint pada perangkat ini"); 
        }
    }
  
    public void telepon(int noHp) {
      System.out.println("Menelepon ke nomer " + noHp);
    }
  
    public void kirimSMS(int noHp) {
      System.out.println("Kirim SMS ke " + noHp);
    }
  
    public void kirimSMS(int noHp1, int noHp2) {
      System.out.println("Kirim SMS ke nomer " + noHp1 + " dan nomer " + noHp2);
    }
  }