package Entity;

public class DeveloperEntity extends Dictionary {
    public Dictionary getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(Dictionary countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    private Dictionary countryOrigin;

    public DeveloperEntity() {
        super(0,"");
        this.countryOrigin = new CountryOrigin();
    }

    public DeveloperEntity(int id, String name, Dictionary countryOrigin)
    {
        super(id, name);
        this.countryOrigin = countryOrigin;
    }
}
