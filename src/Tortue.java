public class Tortue {

    int x;
    int y;
    int angleActuel;


    void avancer(int combien) {
        switch (angleActuel) {
            case 0:
                y += combien;
                break;
            case 90:
                x += combien;
                break;
            case 180:
                y -= combien;
                break;
            case 270:
                x -= combien;
                break;
        }
    }

    void tournerDroite(int angle) {
        switch (angleActuel) {
            case 0:
                if (angle == 90 || angle == 180 || angle == 270) {
                    angleActuel += angle;
                }
                break;
            case 90:
                if (angle == 90 || angle == 180) {
                    angleActuel += angle;
                } else if (angle == 270) {
                    angleActuel = 0;
                }
                break;
            case 180:
                if (angle == 90) {
                    angleActuel += angle;
                } else if (angle == 180 || angle == 270) {
                    angleActuel = angle - angleActuel;
                }
                break;
            case 270:
                if (angle == 90 || angle == 180 || angle == 270) {
                    angleActuel = angle - 90;
                }
                break;

        }
    }

    void tournerGauche(int angle) {
        switch (angleActuel) {
            case 0:
                if (angle == 90 || angle == 180 || angle == 270) {
                    angleActuel = 360 - angle;
                }
                break;

            case 90:
                if (angle == 90) {
                    angleActuel -= angle;
                } else if (angle == 180 || angle == 270) {
                    angleActuel = 450 - angle;
                }
                break;
            case 180:
                if (angle == 90 || angle ==180) {
                    angleActuel = angleActuel - angle;
                } else if (angle == 270) {
                    angleActuel = 270;
                }
                break;
            case 270:
                if (angle == 90 || angle == 180 || angle == 270) {
                    angleActuel -= angle;
                }
                break;
        }
    }
}