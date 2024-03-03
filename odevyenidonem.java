public class odevyenidonem {
    public static void main(String[] args) {
        String[] isimler = {" Kadir", " Gökhan", " Hakan", " Suzan", " Pınar", " Mehmet", " Ali", " Emel", " Fırat", " James", " Jale", " Ersin", " Deniz", " Gözde", " Anıl", " Burak"};
        int[] süreler = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317,265};
        odevyenidonem maraton = new odevyenidonem(isimler, süreler);
        System.out.println("Birinci: " + isimler[maraton.geteniyiderece()] + " " + süreler[maraton.geteniyiderece()]);
        System.out.println("İkinci: " + isimler[maraton.geteniyiikinciderece()] + " " + süreler[maraton.geteniyiikinciderece()]);
        System.out.println("Üçüncü: " + isimler[maraton.geteniyiucuncuderece()] + " " + süreler[maraton.geteniyiucuncuderece()]);
        siniflandirVeYazdir(süreler);

    }

    private String[] isimler;
    private int[] zaman;

    public odevyenidonem(String[] isimler, int[] zaman) {
        this.isimler = isimler;
        this.zaman = zaman;
    }

    public int geteniyiderece() {
        int sırabir = 0;
        for (int i = 1; i < zaman.length; i++) {
            if (zaman[i] < zaman[sırabir]) {
                sırabir = i;
            }
        }
        return sırabir;
    }

    public int geteniyiikinciderece() {
        int sıraiki = 0;
        for (int i = 0; i < zaman.length; i++) {
            if (i != geteniyiderece() && zaman[i] < zaman[sıraiki]) {
                sıraiki = i;
            }
        }
        return sıraiki;
    }

    public int geteniyiucuncuderece() {
        int sırauç = 0;
        for (int i = 0; i < zaman.length; i++) {
            if (i != geteniyiderece() && i != geteniyiikinciderece() && zaman[i] < zaman[sırauç]) {
                sırauç = i;
            }
        }
        return sırauç;
    }
    private static void siniflandirVeYazdir(int[] süreler) {
        int sayacA = 0, sayacB = 0, sayacC = 0;

        for (int derece : süreler) {
            String sinif = siniflandirSinifi(derece);

            switch (sinif) {
                case "A":
                    sayacA++;
                    break;
                case "B":
                    sayacB++;
                    break;
                case "C":
                    sayacC++;
                    break;
            }
        }

        System.out.println("Sınıf İstatistikleri: A-" + sayacA + " kişi, B-" + sayacB + " kişi, C-" + sayacC + " kişi");
    }

    
    private static String siniflandirSinifi(int derece) {
        if (derece >= 200 && derece < 300) {
            return "A";
        } else if (derece >= 300 && derece < 400) {
            return "B";
        } else {
            return "C";
        }
    }
    }

