// Classes implementing the interfaces
public class Human implements Workable, Eatable, Sleepable {
    public void work() { System.out.println("Human is working"); }
    public void eat() { System.out.println("Human is eating"); }
    public void sleep() { System.out.println("Human is sleeping"); }
}