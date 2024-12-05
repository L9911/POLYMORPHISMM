public class MatematikaCanggih extends Matematika {
    // Overloading metode modulus
    public int modulus(int a, int b) {
        return a % b;
    }

    public double modulus(double a, double b) {
        return a % b;
    }

    // Kombinasi operasi tambah dan kali
    public int kombinasiTambahKali(int a, int b, int c) {
        return tambah(a, b) * c; // Hasil dari (a + b) * c
    }

    public double kombinasiTambahKali(double a, double b, double c) {
        return tambah(a, b) * c;
    }
}
