import java.security.cert.CertPathValidatorException;

public class Main {

    public static void main(String[] args) {
        Uchburchtuk uchburchtuk1 = new Uchburchtuk();
        uchburchtuk1.a = 10;
        uchburchtuk1.b = 10;
        uchburchtuk1.c = 10;

        System.out.println("Уч бурчтуктун аянты: " + uchburchtuk1.area());
    }
}
