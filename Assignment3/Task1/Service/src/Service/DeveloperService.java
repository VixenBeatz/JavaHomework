package Service;

import Entity.DeveloperEntity;

public class DeveloperService extends DictionaryService {
    public DeveloperService() {
        DeveloperEntity[] developers = new DeveloperEntity[3];
        developers[0] = new DeveloperEntity(1, "Microsoft");
        developers[1] = new DeveloperEntity(2, "Apple");
        developers[2] = new DeveloperEntity(3, "Google");
        this.setDictionaries(developers);
    }
}
