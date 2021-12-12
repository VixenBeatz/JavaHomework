package Service;

import Entity.Dictionary;
import Entity.PlatformEntity;

public class PlatformService extends DictionaryService {

    public PlatformService() {
        PlatformEntity[] platforms = new PlatformEntity[4];
        platforms[0] = new PlatformEntity(1, "PC");
        platforms[1] = new PlatformEntity(2, "Mac");
        platforms[2] = new PlatformEntity(3, "Android");
        platforms[3] = new PlatformEntity(4, "iOS");
        this.setDictionaries(platforms);
    }
}
