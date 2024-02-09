package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        //zofkaNaVychoziPozici();
        //nakresliSnehulaka(new Color(255, 196, 0));
        nakresliMasinku();

        //  vypocitejDelkuPrepony();
    }
       /*  //TODO Tady bude kód pro kreslení želví grafiky.Ze dne 30102024
        nakresliCtverecek(100,new Color(255, 196, 0));
        nakresliCtverecek(200,Color.BLACK);
        nakresliCtverecek(30,Color.YELLOW);
    }*/


    public void nakresliCtverecek(int delkaStrany, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
    }

    public void nakresliObdelnik(double delkaStranyA, double delkaStranyB, Color barva) {
        zofka.setPenColor(barva);
        zofka.turnRight(90);
        for (double i = 0; i < 2; i++) {
            zofka.turnLeft(90);
            zofka.move(delkaStranyB);
            zofka.turnLeft(90);
            zofka.move(delkaStranyA);

        }
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.penDown();
    }


    public void nakresliRovnostrannyTrojuhelnik(double delkaStrany, Color barva) {
        zofka.setPenColor(barva);

        for (int i = 0; i < 3; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(120);
        }
    }

    public void nakresliKolečkoRuce(double polomer) {
        //zofka.penUp();
        //zofka.turnLeft(35);
        //zofka.move(460);
        //zofka.penDown();
        zofka.turnRight(90);
        int pocetCasti = 360; // 360 casti
        for (int i = 0; i < pocetCasti; i++) {
            zofka.move(polomer * 3.14 * 2 / pocetCasti); // 360x
            zofka.turnLeft(1); // Otoci se o jeden stupen
        }
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(polomer);
        zofka.turnLeft(90);
        zofka.move(polomer);
        zofka.penDown();
        nakresliKolečko(30);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(polomer * 3);
        zofka.penDown();
        nakresliKolečko(30);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(polomer * 2);
        zofka.turnRight(90);
        zofka.move(polomer);
        zofka.penDown();
    }

    public void nakresliSnehulaka(Color barva) {
        zofkaNaVychoziPozici();
        zofka.setPenColor(barva);
        nakresliKolečko(90);
        nakresliKolečkoRuce(60);
        nakresliKolečko(40);
    }

    public void nakresliMasinku() {
        zofkaNaVychoziPozici();
        nakresliObdelnik(300, 150, Color.cyan);
        nakresliObdelnik(200, 300, Color.green);
        nakresliRovnoramennyTrojuhelnik(212.132, 150, Color.BLACK);
        nakresliKoleckaLokomotivy(Color.cyan);
    }

    public void nakresliRovnoramennyTrojuhelnik(double delkaStranyA, double delkaStranyB, Color barva) {
        zofka.setPenColor(barva);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(700);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(135);
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(delkaStranyA);
        zofka.turnLeft(135);
        zofka.move(delkaStranyB);
        zofka.turnLeft(90);
        zofka.move(delkaStranyB);
        zofka.turnRight(180);
        zofka.move(130);

    }

    public void nakresliKoleckaLokomotivy(Color barva) {
        zofka.setPenColor(barva);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(110);
        zofka.penDown();
        nakresliKolečko(30);
        zofka.penUp();
        zofka.move(50);
        zofka.penDown();
        nakresliKolečko(30);
        zofka.penUp();
        zofka.move(120);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.penDown();
        nakresliKolečko(100);
    }

    public void nakresliKolečko(double polomer) {
        //zofka.penUp();
        //zofka.turnLeft(35);
        //zofka.move(460);
        //zofka.penDown();
        zofka.turnRight(90);
        int pocetCasti = 360; // 360 casti
        for (int i = 0; i < pocetCasti; i++) {
            zofka.move(polomer * 3.14 * 2 / pocetCasti); // 360x
            zofka.turnLeft(1); // Otoci se o jeden stupen
        }
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(polomer * 2);
        zofka.penDown();
    }

    public void zofkaOtocitHlavouNahoru() {
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(115);
        zofka.move(100);
        zofka.move(60);
        zofka.penDown();
    }

    public double vypocitejDelkuPrepony() {
        double delkaPrepony;
        double velikostStrany = 150;
        delkaPrepony = Math.sqrt(2 * Math.pow(velikostStrany, 2));
        System.out.println(delkaPrepony);
        return delkaPrepony;
    }

    public void vypocitejUhelVrcholu() {
    }

    public void zofkaNaVychoziPozici() {
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.penDown();
    }
}

