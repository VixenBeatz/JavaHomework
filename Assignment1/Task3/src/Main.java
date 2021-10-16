public class Main {
    public static void main(String[] args) {
        Cook cook = new SubwayChef();
        cook.sell();
        cook = new McDonaldChef();
        cook.sell();
    }
}
