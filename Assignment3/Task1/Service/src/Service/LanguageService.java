package Service;

import Entity.Dictionary;
import Entity.LanguageEntity;

public class LanguageService extends DictionaryService {
    public LanguageService() {
        LanguageEntity[] languages = new LanguageEntity[6];
        languages[0] = new LanguageEntity(1, "English");
        languages[1] = new LanguageEntity(2, "Russian");
        languages[2] = new LanguageEntity(3, "German");
        languages[3] = new LanguageEntity(4, "Spanish");
        languages[4] = new LanguageEntity(5, "Italian");
        languages[5] = new LanguageEntity(6, "Polish");
        this.setDictionaries(languages);
    }
}
