package Service;

import Entity.DeveloperEntity;
import Entity.Dictionary;

public class DeveloperService extends DictionaryService {
    private CountryOriginService countryOriginService;

    public DeveloperService() {
        DeveloperEntity[] developers = new DeveloperEntity[3];
        Dictionary[] countries = countryOriginService.load();


        developers[0] = new DeveloperEntity(1, "Meta inc.", countries[0]);
        developers[1] = new DeveloperEntity(2, "Wargaming", countries[1]);
        this.setDictionaries(developers);
    }
}
