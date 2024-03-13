import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner liczba_a = new Scanner(System.in);

    System.out.print("Twoja liczba A to  ");
    double a = liczba_a.nextDouble();
    Scanner liczba_b = new Scanner(System.in);

    System.out.print("Twoja liczba B to  ");
    double b = liczba_a.nextDouble();
    Scanner liczba_c = new Scanner(System.in);

    System.out.print("Twoja liczba C to  ");
    double c = liczba_a.nextDouble();

    double max = a;
    if (b > max) {
      b = max;
    }
    if (c > max) {
      max = c;
    }
    System.out.println("Największa liczba to " + max);
  }
}
