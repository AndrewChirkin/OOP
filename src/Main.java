public class Main {
    public static void main(String[] args) {
        Flower Rose = new Flower("Роза", "", "Голландия", 35.59, 0);
        Flower Chrizo = new Flower("Хризантема", "", "", 15, 5);
        Flower Pion = new Flower("Пион", "", "", 69.9, 1);
        Flower Gipsophyla = new Flower("Гипсофила", "", "Турция", 19.5, 10);

        System.out.println(Pion.flowerInfo());

    }
    public static void flowerInfo(){
        System.out.println(Flower.getName() + ": страна происхождения - " + Flower.getCountry() + ", стоимость - " + getCost() + ", срок стояния цветка - " + getLifeSpan();
    }

}