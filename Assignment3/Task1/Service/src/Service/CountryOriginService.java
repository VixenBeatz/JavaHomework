package Service;

import Entity.LanguageEntity;

public class CountryOriginService extends DictionaryService {
    public CountryOriginService(){
        LanguageEntity[] country = new LanguageEntity[6];
        country[0] = new LanguageEntity(1, "USA");
        country[1] = new LanguageEntity(2, "Belarus");
        this.setDictionaries(country);
    }
}
