package uap.models;

import uap.bases.shape;
import uap.interfaces.MassCalculable;
import uap.interfaces.MassConverter;
import uap.interfaces.PiRequired;
import uap.interfaces.ShippingCostCalculator;

public class sphere extends shape implements ShippingCostCalculator, PiRequired, MassConverter {
    private double radius;


    public sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public void setName(String name) {
        super.setName(name);
    }

    public String getName() {
        return super.getName();
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double getMass() {
        return getVolume() * MassCalculable.DENSITY; 
    }

    public double gramToKilogram(double grams) {
        return grams / 1000.0;
    }

    public double calculateCost() {
        double costPerKilogram = 10.0; // Example cost per kilogram
        double massInKilograms = gramToKilogram(getMass());
        return massInKilograms * costPerKilogram;
    }

    @Override
    public void printInfo() {
        System.out.println("Shape: " + getName());
        System.out.println("Volume: " + getVolume());
        System.out.println("massa: " + getMass());
        System.out.println("massa dalam kilogram: " + gramToKilogram(getMass()));
        System.out.println("Biaya pengiriman: " + calculateCost());
    }

    @Override
    public double gramToKilogram() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
