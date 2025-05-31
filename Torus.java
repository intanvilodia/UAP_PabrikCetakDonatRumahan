package uap.models;

import uap.bases.Cetakan;
import uap.interfaces.*;

//class ini mewakili cetakan donat dengan lubang (torus)
public class Torus extends Cetakan {
    private double R, r; //keterangan: R = radius besar, r = radius kecil

    //constructor menerima dua nilai radius
    public Torus(double R, double r) {
        this.R = R;
        this.r = r;
    }

    //rumus volume torus: 2*π^2*R*r^2
    public double getVolume() {
        return 2 * PI * PI * R * r * r;
    }

    //rumus luas permukaan torus: 4*π^2*R*r
    public double getSurfaceArea() {
        return 4 * PI * PI * R * r;
    }
}