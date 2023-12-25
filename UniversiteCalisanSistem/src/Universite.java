public class Universite {
    public static void main(String[] args) {

        Calisan c1 = new Calisan("Ahmet A","123456","a@a");
        Akademisyen a1 = new Akademisyen("Mehmet M", "123456","b@b","Fizik","Dok");
        OgretimGorevlisi o1 = new OgretimGorevlisi("Can C","123","c@c","Mat","ArsGor","7");
        Memur m1 = new Memur("Deniz D","1234","e@e","Destruction","9-18");

        a1.derseGir();
        a1.giris();

        o1.senatoToplanti();
        o1.giris();

        m1.giris();
        System.out.println(m1.getDepartman());
        m1.calis();

    }
}