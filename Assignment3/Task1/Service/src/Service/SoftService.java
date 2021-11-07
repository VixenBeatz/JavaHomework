package Service;

import Entity.*;

public class SoftService {

    private Dictionary[] categoryEntities;
    private Dictionary[] developers;
    private Dictionary[] languages;
    private Dictionary[] platforms;

    private SoftEntity[] softList;

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

    private void loadDictionaries() {
        this.loadCategories();
        this.loadDevelopers();
        this.loadLanguages();
        this.loadPlatforms();
    }

    public void loadSoft() {
        this.loadDictionaries();

        this.softList[0] = new SoftEntity(
                1,
                "Whatsapp",
                new Dictionary[] {
                        this.platforms[0],
                        this.platforms[1],
                        this.platforms[2],
                        this.platforms[3]
                },
                new Dictionary[] {
                        this.languages[0]
                },
                new Dictionary[] {
                        this.developers[0]
                }
        );

        this.softList[1] = new SoftEntity(
                2,
                "Instagram",
                new Dictionary[] {
                        this.platforms[2],
                        this.platforms[3]
                },
                new Dictionary[] {
                        this.languages[0]
                },
                new Dictionary[] {
                        this.developers[0]
                }
        );

        this.softList[2] = new SoftEntity(
                3,
                "World of tanks",
                new Dictionary[] {
                        this.platforms[0]
                },
                this.languages[0],

                )
    }
}
