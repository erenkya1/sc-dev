public class ogrenci {
    private String ad;
    private String bolum;
    private int girisyili;
    private String ogrno;
    private double gano;
    private int bolumKodu;


    public ogrenci(String ad, String bolum, int girisYili, double gano, int bolumKodu) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisyili = girisYili;
        this.gano = gano;
        this.bolumKodu = bolumKodu;
        this.ogrno = ogrencinohesapla();
    }

    public ogrenci(String ad, String bolum, int girisYili, int bolumKodu) {
        this(ad, bolum, girisYili, 0.0, bolumKodu);
    }


    public String getad() {
        return ad;
    }

    public void setad(String ad) {
        this.ad = ad;
    }

    public String getbolum() {
        return bolum;
    }

    public void setbolum(String bolum) {
        this.bolum = bolum;
    }

    public int getgirisyili() {
        return girisyili;
    }

    public void setgirisyili(int girisYili) {
        this.girisyili = girisYili;
    }

    public String getogrno() {
        return ogrno;
    }

    public double getgano() {
        return gano;
    }


    public void setgano(double gano) {
        if (gano < 0.0 || gano > 4.0) {
            throw new IllegalArgumentException("Gano 0 ile 4 arasında olmalıdır.");
        }
        this.gano = gano;
    }

    public int getbolumkodu() {
        return bolumKodu;
    }

    public void setbolumkodu(int bolumKodu) {
        this.bolumKodu = bolumKodu;
    }


    private String ogrencinohesapla() {
        String ogrenciNo = Integer.toString(girisyili) + String.format("%02d", bolumKodu) + "001";
        return ogrenciNo;
    }


    public double harchesapla(int dersSayisi) {
        return dersSayisi * 100;
    }

    public double harchesapla(int dersSayisi, int uzatilanYil) {
        return dersSayisi * 100 + uzatilanYil * 500;
    }

    public static void main(String[] args) {

        ogrenci ogrenci1 = new ogrenci("Eren", "Yazılım Mühendisliği", 2023, 0.0, 100);
        ogrenci ogrenci2 = new ogrenci("Gökhan", "Bilgisayar Mühendisliği", 1985, 0.0, 101);
        ogrenci ogrenci3 = new ogrenci("Ayşe", "Makine Mühendisliği", 1985, 0.0, 103);
        ogrenci ogrenci4 = new ogrenci("Elif", "Elektrik-Elektronik Mühendisliği", 2020, 1.98, 104);





        System.out.println("OGR-1 " + ogrenci1.getad() + " " + ogrenci1.getbolum() + " " + " " + ogrenci1.getogrno() + " " + ogrenci1.getgano());

        System.out.println("OGR-2 " + ogrenci2.getad() + " " + ogrenci2.getbolum() + " " + " " + ogrenci2.getogrno() + " " + ogrenci2.getgano());

        System.out.println("OGR-3 " + ogrenci3.getad() + " " + ogrenci3.getbolum() + " " + " " + ogrenci3.getogrno() + " " + ogrenci3.getgano());

        System.out.println("OGR-4 " + ogrenci4.getad() + " " + ogrenci4.getbolum() + " " + " " + ogrenci4.getogrno() + " " + ogrenci4.getgano());

        System.out.println("3. öğrencinin ödeyeceği harç: " + ogrenci3.harchesapla(2));

        System.out.println("4. öğrencinin ödeyeceği harç: " + ogrenci4.harchesapla(5, 1));




    }
}
