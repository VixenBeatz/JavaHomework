package Service;

import Entity.*;

public class SoftService {

    private Dictionary[] categoryEntities;
    private Dictionary[] developers;
    private Dictionary[] languages;
    private Dictionary[] platforms;

    public SoftService() {
        SoftEntity[] softList = new SoftEntity[10];
    }

    private void loadCategories() {
        CategoryService categoryService = new CategoryService();
        this.categoryEntities = categoryService.load();
    }

    private void loadDevelopers() {
        DeveloperService developerService = new DeveloperService();
        this.developers = developerService.load();
    }

    private void loadLanguages() {
        LanguageService languageService = new LanguageService();
        this.languages = languageService.load();
    }

    private void loadPlatforms() {
        PlatformService platformService = new PlatformService();
        this.platforms = platformService.load();
    }
}
