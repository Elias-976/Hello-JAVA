public class Main {
public static void main(String[] args) {
    byte a = 120;
    byte b = 20;
    byte somme = (byte) (a + b);
    int max = Integer.MAX_VALUE;

    System.out.println("a :"+a +" b :"+b +" = "+ somme);


    int grandNombre = 1000;

    byte petitNombre = (byte) grandNombre;
    System.out.println("Valeur convertie de : "+grandNombre+ " = "+ petitNombre);


    double reel = 9.78;

    int entier = (int) reel;
    System.out.println("Valeur entière de : "+ reel+ " après conversion : "+ entier);


    System.out.println("Avant débordement : " + (max));
    System.out.println("Avant débordement : " + (max + 1));

}
}