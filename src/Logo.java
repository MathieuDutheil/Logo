public class Logo {

    static Tortue tortue = new Tortue();

    public static void main(String... args) {
        tortue.tournerDroite(90);
        tortue.avancer(200);
        tortue.tournerGauche(90);
        tortue.avancer(400);
        tortue.tournerGauche(90);
        tortue.avancer(100);
        tortue.tournerGauche(90);
        tortue.avancer(300);
        tortue.tournerDroite(90);
        tortue.avancer(200);
        tortue.tournerDroite(90);
        tortue.avancer(300);
        tortue.tournerGauche(90);
        tortue.avancer(100);
        tortue.tournerGauche(90);
        tortue.avancer(400);
        tortue.tournerGauche(90);
        tortue.avancer(200);

        System.out.println("Valeur finale de x = " + tortue.x);
        System.out.println("Valeur finale de y = " + tortue.y);
        System.out.println("Valeur finale de angleActuel = " + tortue.angleActuel);
    }
}