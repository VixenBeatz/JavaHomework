package Service;

import Entity.Dictionary;
import Entity.LanguageEntity;

public class LanguageService extends DictionaryService {
    public LanguageService() {
        LanguageEntity[] languages = new LanguageEntity[6];
        languages[0] = new LanguageEntity(1, "All");
        languages[1] = new LanguageEntity(2, "English");
        languages[2] = new LanguageEntity(3, "Russian");
        languages[3] = new LanguageEntity(4, "German");
        languages[4] = new LanguageEntity(5, "Spanish");
        languages[5] = new LanguageEntity(6, "Italian");
        languages[6] = new LanguageEntity(7, "Polish");
        this.setDictionaries(languages);
    }
}
