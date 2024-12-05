public class Matematika {
    // Overloading metode pertambahan
    public int tambah(int a, int b) {
        return a + b;
    }

    public int tambah(int a, int b, int c) {
        return a + b + c;
    }

    public double tambah(double a, double b) {
        return a + b;
    }

    public double tambah(double a, double b, double c) {
        return a + b + c;
    }

    // Overloading metode pengurangan
    public int kurang(int a, int b) {
        return a - b;
    }

    public double kurang(double a, double b) {
        return a - b;
    }

    public double kurang(double a, double b, double c) {
        return a - b - c;
    }

    // Overloading metode perkalian
    public int kali(int a, int b) {
        return a * b;
    }

    public double kali(double a, double b) {
        return a * b;
    }

    public double kali(double a, double b, double c) {
        return a * b * c;
    }

    // Overloading metode pembagian
    public int bagi(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol.");
        }
        return a / b;
    }

    public double bagi(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol.");
        }
        return a / b;
    }

    public double bagi(double a, double b, double c) {
        if (b == 0 || c == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol.");
        }
        return a / b / c;
    }
}
