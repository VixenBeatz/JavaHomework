package Service;

import Entity.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SoftService {

    private Dictionary[] categoryEntities;
    private DeveloperEntity[] developers;
    private Dictionary[] languages;
    private Dictionary[] platforms;

    private SoftEntity[] softList;

    public SoftService() {
        this.softList = new SoftEntity[10];
        this.loadSoft();
    }

    private void loadCategories() {
        CategoryService categoryService = new CategoryService();
        this.categoryEntities = categoryService.load();
    }

    private void loadDevelopers() {
        DeveloperService developerService = new DeveloperService();
        this.developers = developerService.getDevelopers();
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
                        this.categoryEntities[0]
                },
                new Dictionary[] {
                        this.platforms[0],
                        this.platforms[1],
                        this.platforms[2],
                        this.platforms[3]
                },
                new Dictionary[] {
                        this.languages[0]
                },
                new DeveloperEntity[] {
                        this.developers[0]
                }
        );

        this.softList[1] = new SoftEntity(
                2,
                "Instagram",
                new Dictionary[] {
                  this.categoryEntities[0]
                },
                new Dictionary[] {
                        this.platforms[2],
                        this.platforms[3]
                },
                new Dictionary[] {
                        this.languages[0]
                },
                new DeveloperEntity[] {
                        this.developers[0]
                }
        );

        this.softList[2] = new SoftEntity(
                3,
                "World of tanks",
                new Dictionary[] {
                        this.categoryEntities[1]
                },
                new Dictionary[] {
                        this.platforms[0]
                },
                new Dictionary[] {
                        this.languages[0]
                },
                new DeveloperEntity[] {
                        this.developers[1]
                }
        );

        this.softList[3] = new SoftEntity(
                4,
                "World of warships",
                new Dictionary[] {
                        this.categoryEntities[1]
                },
                new Dictionary[] {
                        this.platforms[0]
                },
                new Dictionary[] {
                        this.languages[0]
                },
                new DeveloperEntity[] {
                        this.developers[1]
                }
        );
        this.softList[4] = new SoftEntity(
                5,
                "World of warplanes",
                new Dictionary[] {
                        this.categoryEntities[1]
                },
                new Dictionary[] {
                        this.platforms[0]
                },
                new Dictionary[] {
                        this.languages[0]
                },
                new DeveloperEntity[] {
                        this.developers[1]
                }
        );
        this.softList[5] = new SoftEntity(
                6,
                "World of tanks: Blitz",
                new Dictionary[] {
                        this.categoryEntities[1]
                },
                new Dictionary[] {
                        this.platforms[0],
                        this.platforms[2],
                        this.platforms[3]
                },
                new Dictionary[] {
                        this.languages[0]
                },
                new DeveloperEntity[] {
                        this.developers[1]
                }
        );
        this.softList[6] = new SoftEntity(
                7,
                "Viber",
                new Dictionary[] {
                        this.categoryEntities[0]
                },
                new Dictionary[] {
                        this.platforms[0],
                        this.platforms[1],
                        this.platforms[2],
                        this.platforms[3]
                },
                new Dictionary[] {
                        this.languages[0]
                },
                new DeveloperEntity[] {
                        this.developers[2]
                }
        );


        this.softList[7] = new SoftEntity(
                8,
                "Yandex browser",
                new Dictionary[] {
                        this.categoryEntities[2]
                },
                new Dictionary[] {
                        this.platforms[0],
                        this.platforms[2],
                        this.platforms[3]
                },
                new Dictionary[] {
                        this.languages[1],
                        this.languages[2],
                        this.languages[7],
                        this.languages[9]
                },
                new DeveloperEntity[] {
                        this.developers[3]
                }
        );
        this.softList[8] = new SoftEntity(
                9,
                "Yandex mail",
                new Dictionary[] {
                        this.categoryEntities[0]
                },
                new Dictionary[] {
                        this.platforms[2],
                        this.platforms[3]
                },
                new Dictionary[] {
                        this.languages[1],
                        this.languages[2],
                        this.languages[7],
                        this.languages[9]
                },
                new DeveloperEntity[] {
                        this.developers[3]
                }
        );
        this.softList[9] = new SoftEntity(
                10,
                "Yandex music",
                new Dictionary[] {
                        this.categoryEntities[3]
                },
                new Dictionary[] {
                        this.platforms[2],
                        this.platforms[3]
                },
                new Dictionary[] {
                        this.languages[1],
                        this.languages[2],
                        this.languages[7],
                        this.languages[9]
                },
                new DeveloperEntity[] {
                        this.developers[3]
                }
        );

    }
    public List<SoftEntity> getSoftByCategoryId(int categoryId) {
        return Arrays.stream(this.softList).filter(
                softEntity -> Arrays.stream(softEntity.getCategories()).anyMatch(
                        category -> category.getId() == categoryId)).collect(Collectors.toList());
    }

    public List<SoftEntity> getSoftByDeveloperId(int developerId) {
        return Arrays.stream(this.softList).filter(
                softEntity -> Arrays.stream(softEntity.getDevelopers()).anyMatch(
                        developer -> developer.getId() == developerId)).collect(Collectors.toList());
    }

    public List<SoftEntity> getSoftByCountryOriginId(int countryOriginId) {
        return Arrays.stream(this.softList).filter(
                softEntity -> Arrays.stream(softEntity.getDevelopers()).anyMatch(
                        developer -> developer.getCountryOrigin().getId() == countryOriginId)).collect(Collectors.toList());
    }

    public List<SoftEntity> getSoftByPlatformId(int platformId) {
        return Arrays.stream(this.softList).filter(
                softEntity -> Arrays.stream(softEntity.getPlatforms()).anyMatch(
                        platform -> platform.getId() == platformId)).collect(Collectors.toList());
    }
}
