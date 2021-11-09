package Service;

import Entity.DeveloperEntity;
import Entity.Dictionary;

public class DeveloperService {
    public DeveloperEntity[] getDevelopers() {
        return developers;
    }

    private CountryOriginService countryOriginService;

    private DeveloperEntity[] developers;

    public DeveloperService() {
        this.countryOriginService = new CountryOriginService();

        this.developers = new DeveloperEntity[4];

        Dictionary[] countries = countryOriginService.load();


        developers[0] = new DeveloperEntity(1, "Meta inc.", countries[0]);
        developers[1] = new DeveloperEntity(2, "Wargaming", countries[1]);
        developers[2] = new DeveloperEntity(3, "Rakuten", countries[2]);
        developers[3] = new DeveloperEntity(4, "Yandex", countries[3]);
    }
}
