package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {

       nakresliSnehulaka(new Color(255, 0, 255));
       nakresliZmrzlinu(Color.yellow);
      // nakresliMasinku();
    }
        public void nakresliZmrzlinu(Color barva) {
        poziceProKresleniZmrliny();
        zofka.setPenColor(barva);
        nakresliKolecko(52.09);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.move(52.09);
        zofka.turnRight(180);
        zofka.penDown();
        zofka.turnLeft(90);
        nakresliRovnoramennyTrojuhelnikZmrzlina(104.189,300, new Color(165,42,42));
        zofka.setPenColor(barva);
    }

    public void nakresliRovnoramennyTrojuhelnikZmrzlina(double delkaStranyA, double delkaStranyB, Color barva){
        zofka.setPenColor(barva);
        zofka.turnRight(90);
        zofka.move(delkaStranyA);
        zofka.turnRight(100);
        zofka.move(delkaStranyB);
        zofka.turnRight(160);
        zofka.move(delkaStranyB);
    }
    public void nakresliObdelnik(double delkaStranyA, double delkaStranyB, Color barva) {
        zofka.setPenColor(barva);
        for (double i = 0; i < 2; i++) {
            zofka.turnLeft(90);
            zofka.move(delkaStranyB);
            zofka.turnLeft(90);
            zofka.move(delkaStranyA);
        }
    }
    public void nakresliKoleckoRuce(Color barva) {
        zofka.setPenColor(barva);
        nakresliKolecko(60);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.penDown();
        nakresliKolecko(30);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(120);
        zofka.penDown();
        nakresliKolecko(30);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(60);
        zofka.turnRight(90);
        zofka.move(60);
        zofka.penDown();
    }

    public void nakresliSnehulaka(Color barva) {
        poziceProKresleniSnehulaka();
        zofka.setPenColor(barva);
        nakresliKolecko(90);
        zofka.turnRight(90);
        nakresliKoleckoRuce(Color.blue);
        zofka.setPenColor(barva);
        nakresliKolecko(40);
    }

    public void poziceProKresleniSnehulaka(){
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.penDown();
    }
    public void poziceProKresleniZmrliny(){
        zofka.penUp();
        zofka.move(300);
        zofka.turnLeft(90);
        zofka.penDown();
    }
    public void nakresliMasinku() {
        zofkaPosunProNakresMasinky();
        zofka.turnRight(90);
        nakresliObdelnik(300, 150, Color.cyan);
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();
        nakresliObdelnik(200, 300, Color.green);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.penDown();
        nakresliKolecko(100);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(300);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliKolecko(40);
        zofka.penUp();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliKolecko(40);
        zofka.penUp();
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnLeft(135);
        zofka.penDown();
        nakresliRovnoramennyTrojuhelnikPravyUhel(141.421d, 100,Color.BLACK);
    }

    public void nakresliRovnoramennyTrojuhelnikPravyUhel(double delkaStranyA, double delkaStranyB, Color barva) {
        zofka.setPenColor(barva);
        zofka.move(delkaStranyA);
        zofka.turnLeft(135);
        zofka.move(delkaStranyB);
        zofka.turnLeft(90);
        zofka.move(delkaStranyB);
    }

    public void nakresliKolecko(double polomer) {
        zofka.turnRight(90);
        int pocetCasti = 360; // 360 casti
        for (int i = 0; i < pocetCasti; i++) {
            zofka.move(polomer * 3.14 * 2 / pocetCasti); // 360x
            zofka.turnLeft(1); // Otoci se o jeden stupen
        }
    }
    public double vypocitejDelkuPrepony() {
        double delkaPrepony;
        double velikostStrany = 100;
        delkaPrepony = Math.sqrt(2 * Math.pow(velikostStrany, 2));
        System.out.println(delkaPrepony);
        return delkaPrepony;
    }

    public double vypocitejDelkuTretiStrany(double velikostRamene, double uhelMeziRameny) {
        double tretiStrana;
        tretiStrana = Math.abs((velikostRamene
                * Math.sin((uhelMeziRameny * Math.PI / 180.0) / 2))
                * 2);
        System.out.println(tretiStrana);
        return tretiStrana;
    }
    public void zofkaPosunProNakresMasinky() {
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.penDown();
    }
}