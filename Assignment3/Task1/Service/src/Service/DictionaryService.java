package Service;

import Entity.Dictionary;

public abstract class DictionaryService {

    public void setDictionaries(Dictionary[] dictionaries) {
        this.dictionaries = dictionaries;
    }

    private Dictionary[] dictionaries;

    public Dictionary[] load() {
        return this.dictionaries;
    };
}
