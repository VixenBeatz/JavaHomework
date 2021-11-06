package Entity;

public class SoftEntity extends Dictionary {
    private String version;
    private Dictionary[] platforms;
    private Dictionary[] categories;

    public Dictionary[] getPlatforms() {
        return platforms;
    }

    public void setPlatforms(Dictionary[] platforms) {
        this.platforms = platforms;
    }

    public Dictionary[] getCategories() {
        return categories;
    }

    public void setCategories(Dictionary[] categories) {
        this.categories = categories;
    }

    public Dictionary[] getLanguages() {
        return languages;
    }

    public void setLanguages(Dictionary[] languages) {
        this.languages = languages;
    }

    public Dictionary[] getDevelopers() {
        return developers;
    }

    public void setDevelopers(Dictionary[] developers) {
        this.developers = developers;
    }

    private Dictionary[] languages;
    private Dictionary[] developers;
    private String price;
    private Double rating;

    public SoftEntity() {
        super(0, "");
        this.version = "";
        this.platforms = null;
        this.categories = null;
        this.languages = null;
        this.developers = null;
        this.price = "";
        this.rating = 0d;

    }

    public SoftEntity(int id, String name, Dictionary[] platforms,
                      Dictionary[] languages, Dictionary[] developers, String price, Double rating) {
        super(id, name);
        this.platforms = platforms;
        this.languages = languages;
        this.developers = developers;
        this.price = price;
        this.rating = rating;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setDevelopers(DeveloperEntity[] developers) {
        this.developers = developers;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
