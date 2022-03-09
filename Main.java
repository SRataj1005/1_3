import java.util.Scanner; // pozwala na wpisywanie danych w konsoli

class Main {
  public static void main(String[] args)
  {
  
    Scanner nazwa = new Scanner(System.in); // wczytywanie zmiennych
    int a, b; 
    System.out.println("Podaj a: ");
    a = nazwa.nextInt();
    System.out.println("Podaj b: ");
    b = nazwa.nextInt();
    int suma = a + b;
    System.out.println("Suma a i b: " +suma);
  }
}