public class SovietComedy extends SovietMovie {
    private final String genre = "Soviet Comedy";

    public SovietComedy (String title, float budget, String country, String director, int year) {
        super(title, budget, country, director, year);
    }

    public void watch() {
        System.out.println("You've just watched " + this.getTitle() + "!");
    }

    public void showInfo() {
        System.out.println("It's the " + this.genre + ".");
        System.out.println("\"" + this.getTitle() + "\"" + " was made by " + this.getDirector() + " in " + this.getYear() + ".");
        System.out.println("The production budget of \"" + this.getTitle() + "\" is " + this.getBudgetInRUB() + ".");
        System.out.println("In soviet russia comedy laughs at you");
    }
}
