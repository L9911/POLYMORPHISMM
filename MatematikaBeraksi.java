public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Objek Matematika
        Matematika mtk = new Matematika();

        // Pengujian dengan bilangan bulat
        System.out.println("Tambah : " + mtk.tambah(23, 34));
        System.out.println("Kurang : " + mtk.kurang(100, 45));
        System.out.println("Kali : " + mtk.kali(12, 5));
        System.out.println("Bagi : " + mtk.bagi(50, 2));

        // Pengujian dengan bilangan pecahan
        System.out.println("Tambah : " + mtk.tambah(12.5, 28.7, 14.2));
        System.out.println("Kurang : " + mtk.kurang(100.5, 45.2, 10.1));
        System.out.println("Kali : " + mtk.kali(2.5, 3.4, 1.2));
        System.out.println("Bagi : " + mtk.bagi(100.0, 2.0, 5.0));

        // Objek MatematikaCanggih
        MatematikaCanggih mtkCanggih = new MatematikaCanggih();

        // Pengujian metode baru
        System.out.println("Modulus : " + mtkCanggih.modulus(17, 5));
        System.out.println("Modulus : " + mtkCanggih.modulus(17.5, 5.2));
        System.out.println("Kombinasi : " + mtkCanggih.kombinasiTambahKali(2, 3, 4));
        System.out.println("Kombinasi : " + mtkCanggih.kombinasiTambahKali(1.5, 2.5, 3.5));

        // Pengujian overflow
        System.out.println("Overflow : " + mtk.tambah(12, 28, 14));
        System.out.println("Overflow : " + mtk.tambah(12.5, 28.7, 14.2));
    }
}
