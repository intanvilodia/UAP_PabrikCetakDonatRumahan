package uap.bases;

import uap.interfaces.*;

//abstract class Cetakan adalah kelas dasar untuk semua jenis cetakan (torus & bola)
//untuk mengimplementasi interface Printable, Convertible, dan CostCalculable
public abstract class Cetakan implements Printable, Convertible, CostCalculable {
    protected final double PI = 22.0 / 7;        //nilai phi sesuai instruksi soal
    protected final double density = 8.03;       //densitas bahan stainless steel 304 (gram/cm³)
    protected final double thickness = 0.5;      //ketebalan bahan cetakan (cm)

    //method abstract yang akan diimplementasikan oleh turunan class
    public abstract double getVolume();
    public abstract double getSurfaceArea();

    //method untuk menghitung massa berdasarkan luas permukaan
    public double getMass() {
        return getSurfaceArea() * thickness * density;
    }

    //method dari interface Convertible
    public double toKilogram() {
        return getMass() / 1000.0;
    }

    //method dari interface CostCalculable
    public int calculateShippingCost() {
        return (int) Math.ceil(toKilogram()) * 10000; //dibulatkan ke atas, Rp10.000/kg
    }

    //method dari interface Printable untuk mencetak semua info
    public void printInfo() {
        System.out.printf("Volume          : %.2f cm³\n", getVolume());
        System.out.printf("Luas permukaan  : %.2f cm²\n", getSurfaceArea());
        System.out.printf("Massa           : %.2f gr\n", getMass());
        System.out.printf("Massa dalam kg  : %.2f kg\n", toKilogram());
        System.out.printf("Biaya kirim     : Rp%d\n", calculateShippingCost());
    }
}