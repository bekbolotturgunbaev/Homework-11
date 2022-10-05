import org.w3c.dom.ls.LSOutput;

public class Uchburchtuk {
    double a;
    double b;
    double c;


    public double area() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
