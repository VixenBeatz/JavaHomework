package Service;

import Entity.Dictionary;
import Entity.LanguageEntity;

public class LanguageService extends DictionaryService {
    public LanguageService() {
        LanguageEntity[] languages = new LanguageEntity[10];
        languages[0] = new LanguageEntity(1, "All");
        languages[1] = new LanguageEntity(2, "English");
        languages[2] = new LanguageEntity(3, "Russian");
        languages[3] = new LanguageEntity(4, "German");
        languages[4] = new LanguageEntity(5, "Spanish");
        languages[5] = new LanguageEntity(6, "Italian");
        languages[6] = new LanguageEntity(7, "Polish");
        languages[7] = new LanguageEntity(8, "Ukrainian");
        languages[8] = new LanguageEntity(9, "Turkish");
        this.setDictionaries(languages);
    }
}
