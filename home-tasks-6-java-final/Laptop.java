public class Laptop {
    private String brand;
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public Laptop(String brand, int ram, int hdd, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColour() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColour(String color) {
        this.color = color;
    }



    @Override
    public String toString() {
        return "Ноутбук - " + brand +
                ": ОЗУ = " + ram +
                ", ЖД = " + hdd +
                ", ОС = '" + os + '\'' +
                ", цвет = '" + color + '\'' +
                '.';
    }
}
