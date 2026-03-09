//TATENDA MACHIRORI
//CS3354

public class ZooSystem {
    public static void main(String[] args) {
        Mammal lion = new Mammal("Simba", 5);
        Bird eagle = new Bird("Skye", 2);

        System.out.println("--- Zoo Feed Time ---");
        lion.sound();
        lion.feed("Fresh Meat", 5);
        
        eagle.sound();
        eagle.move();
        eagle.feed("Seeds");
    }
}
