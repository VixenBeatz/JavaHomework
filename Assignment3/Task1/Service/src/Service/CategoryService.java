package Service;

import Entity.CategoryEntity;

public class CategoryService extends DictionaryService {
    public CategoryService() {
        CategoryEntity[] entities = new CategoryEntity[10];
        entities[0] = new CategoryEntity(1, "Browsers");
        entities[1] = new CategoryEntity(2, "Multimedia");
        entities[2] = new CategoryEntity(3, "Social and messaging");

        this.setDictionaries(entities);
    }

}
