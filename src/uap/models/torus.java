package uap.models;
import uap.bases.shape;
import uap.interfaces.MassCalculable;
import uap.interfaces.MassConverter;
import uap.interfaces.PiRequired;
import uap.interfaces.ShippingCostCalculator;
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
        return (2 * PiRequired.PI * PiRequired.PI * majorRadius * minorRadius * minorRadius);
    }

    public double getSurfaceArea(){
        return (4 * PiRequired.PI * PiRequired.PI * majorRadius * minorRadius);
    }

    public double getMass(){
        return MassCalculable.DENSITY * getSurfaceArea() * MassCalculable.THICKNESS;
    }

    @Override
    public void printInfo(){
        System.out.println("Shape: " + getName());
        System.out.println("Volume: " + getVolume());
        System.out.println("massa: " + getMass());
        System.out.println("massa dalam kilogram: " + gramToKilogram(getMass()));
        System.out.println("Biaya pengiriman: Rp" + calculateCost());
    }

    public double gramToKilogram(double grams) {
        return grams / MassConverter.DENOMINATOR;
    }

    public double calculateCost(){
        double costPerKilogram = ShippingCostCalculator.PRICE_PER_KG; // Example cost per kilogram
        double massInKilograms = gramToKilogram(getMass());
        double hasil = massInKilograms * costPerKilogram;
        return Math.ceil(hasil/1000) * 1000; 
    }
}
