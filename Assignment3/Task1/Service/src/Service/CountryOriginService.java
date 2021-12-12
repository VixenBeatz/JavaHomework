package Service;

import Entity.CountryOrigin;
import Entity.Dictionary;
import Entity.LanguageEntity;

public class CountryOriginService extends DictionaryService {
    public CountryOriginService(){
        CountryOrigin[] country = new CountryOrigin[4];
        country[0] = new CountryOrigin(1, "USA") {
        };
        country[1] = new CountryOrigin(2, "Belarus");
        country[2] = new CountryOrigin(3, "Japan");
        country[3] = new CountryOrigin(4, "Russia");

        this.setDictionaries(country);
    }
}
