import java.text.DecimalFormat;

public class Flower {
    private final String name;
    private String color;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String name, String color, String country, double cost, int lifeSpan) {
        this.name = name;
        this.color = color;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
    }

    public String getColor() {
        return this.color;
    }

    public void setFlowerColor() {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        if (country != null && !country.isBlank() && !country.isEmpty()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost() {
        if (cost <= 0) {
            System.out.println("Некорректно указана цена!");
        }
//        String formatedCost = String.format("%.2f", cost);
        this.cost = cost;


    }

    public int getLifeSpan() {
        return this.lifeSpan;
    }

    public void setLifeSpan() {
        if (lifeSpan < 0 && lifeSpan % 1 != 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String toString() {
        return getName() + ": страна происхождения - " + getCountry() + ", стоимость - " + getCost() + ", срок стояния цветка - " + getLifeSpan();
    }

    public String getName() {
        return this.name;
    }

    public String flowerInfo() {
        return getName() + ": страна происхождения - " + getCountry() + ", стоимость - " + getCost() + ", срок стояния цветка - " + getLifeSpan();
    }






}
