package uap.models;

import uap.bases.Cetakan;
import uap.interfaces.Convertible;
import uap.interfaces.CostCalculable;
import uap.interfaces.Printable;

//class ini mewakili cetakan donat tanpa lubang (bola)
public class Sphere extends Cetakan {
    private double r; //jari-jari bola

    //constructor menerima nilai radius
    public Sphere(double r) {
        this.r = r;
    }

    //rumus volume bola: (4/3) * π * r³
    public double getVolume() {
        return (4.0 / 3.0) * PI * r * r * r;
    }

    //rumus luas permukaan bola: 4 * π * r²
    public double getSurfaceArea() {
        return 4 * PI * r * r;
    }
}