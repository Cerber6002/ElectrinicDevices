package org.example.eltctodevice;

public class Tablet extends Device {
    protected double batteryCapacity;
    protected boolean hasStylus;

    public Tablet(String name, double price, double weight, double batteryCapacity, boolean hasStylus) {
        super(Devicetype.TABLET, name, price, weight);
        this.batteryCapacity = batteryCapacity;
        this.hasStylus = hasStylus;
    }

    public Tablet(Devicetype type, String name, double price, double weight) {
        super(type, name, price, weight);
    }

    public Tablet(Devicetype type, String name, double price, double weight, double batteryCapacity, boolean hasStylus) {
        super(type, name, price, weight);
        this.batteryCapacity = batteryCapacity;
        this.hasStylus = hasStylus;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public boolean hasStylus() {
        return hasStylus;
    }

    public void setHasStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }

    @Override
    public String toString() {
        return "Tablet" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price + "$" +
                ", weight=" + weight +
                ", batteryCapacity=" + batteryCapacity +
                ", hasStylus=" + hasStylus +
                '}';
    }
}
