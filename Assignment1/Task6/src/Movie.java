public abstract class Movie {
    private String title;

    private float budget;

    private String country;

    private String director;

    private int year;

    public Movie(String title, float budget, String country, String director, int year) {
        this.title = title;
        this.budget = budget;
        this.country = country;
        this.director = director;
        this.year = year;
    };

    public abstract void watch();

    public float calculateBudget() {
        return budget;
    }

    public String getDirector() {
        return this.director;
    };

    public String getCountry () {
        return this.country;
    };

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public abstract void showInfo();
}
