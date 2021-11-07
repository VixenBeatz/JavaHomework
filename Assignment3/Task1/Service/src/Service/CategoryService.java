package Service;

import Entity.CategoryEntity;

public class CategoryService extends DictionaryService {
    public CategoryService() {
        CategoryEntity[] entities = new CategoryEntity[10];
        entities[0] = new CategoryEntity(1, "Social and messaging");
        entities[1] = new CategoryEntity(2, "Games");

        this.setDictionaries(entities);
    }

}
