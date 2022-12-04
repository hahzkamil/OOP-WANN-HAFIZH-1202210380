public class MainApp {
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("WD Black",16,3.6f);
        perangkat.informasi();

        System.out.println("");

        Laptop laptop = new Laptop("WD Green",8,2.4f,false);
        laptop.informasi();
        laptop.bukaGame("Genshin Impact");
        laptop.kirimEmail("ismailahmadk@gmail.com");
        laptop.kirimEmail("msumbul@gmail.com", "dwiartanto@gmail.com");

        System.out.println("");

        Handphone handphone = new Handphone("Samsung",8,1.6f, true);
        handphone.informasi();
        handphone.telepon(81355492);
        handphone.kirimSMS(812776519);
        handphone.kirimSMS(82677269, 83266498);

    }
}
