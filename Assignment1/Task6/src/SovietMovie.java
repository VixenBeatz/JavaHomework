public abstract class SovietMovie extends Movie {
    public static final String currencyInRUB = "RUB";

    public SovietMovie(String title, float budget, String country, String director, int year) {
        super(title, budget, country, director, year);
    };

    public String getBudgetInRUB() {
        return this.calculateBudget() + currencyInRUB;
    }
}
