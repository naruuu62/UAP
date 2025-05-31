package uap.models;
import uap.bases.shape;
public class torus extends shape{
    private double majorRadius;
    private double minorRadius;
    
    public torus(String name, double majorRadius, double minorRadius){
        super(name);
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    public void setName(String name){
        super.setName(name);
    }

    public String getName(){
        return super.getName();
    }

    public double getVolume(){
        return (2 * Math.PI * Math.PI * majorRadius * minorRadius * minorRadius);
    }

    public double getSurfaceArea(){
        return (4 * Math.PI * Math.PI * majorRadius * minorRadius);
    }

    public double getMass(){
        return (getVolume());
    }

    @Override
    public void printInfo(){
        System.out.println("Shape: " + getName());
        System.out.println("Volume: " + getVolume());
        System.out.println("massa: " + getMass());
        System.out.println("massa dalam kilogram: " + gramToKilogram(getMass()));
        System.out.println("Biaya pengiriman: " + calculateCost());
    }

    public double gramToKilogram(double grams) {
        return grams / 1000.0;
    }

    public double calculateCost(){
        double costPerKilogram = 10.0; // Example cost per kilogram
        double massInKilograms = gramToKilogram(getMass());
        return massInKilograms * costPerKilogram;
    }
}
