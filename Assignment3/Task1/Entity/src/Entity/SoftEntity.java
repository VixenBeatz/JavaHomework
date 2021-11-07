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

    public SoftEntity() {
        super(0, "");
        this.version = "";
        this.platforms = null;
        this.categories = null;
        this.languages = null;
        this.developers = null;
    }

    public SoftEntity(int id, String name, Dictionary[] categories, Dictionary[] platforms,
                      Dictionary[] languages, Dictionary[] developers) {
        super(id, name);
        this.platforms = platforms;
        this.categories = categories;
        this.languages = languages;
         this.developers = developers;
    }

    public void setDevelopers(DeveloperEntity[] developers)
    {
        this.developers = developers;
    }
}
