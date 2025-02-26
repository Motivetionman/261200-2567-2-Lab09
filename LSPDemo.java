public class LSPDemo {
    public static void main(String[] args) {
        Bird[] birds = { new Sparrow(), new Eagle(), new Penguin(), new Ostrich() };

        for (Bird bird : birds) {
            bird.eat();
            if (bird instanceof Flyable) {
                ((Flyable) bird).fly();
            } else {
                System.out.println(bird.getClass().getSimpleName() + " cannot fly.");
            }
        }
    }
}