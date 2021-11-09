package Service;

import Entity.CategoryEntity;

public class CategoryService extends DictionaryService {
    public CategoryService() {
        CategoryEntity[] entities = new CategoryEntity[4];
        entities[0] = new CategoryEntity(1, "Social and messaging");
        entities[1] = new CategoryEntity(2, "Games");
        entities[2] = new CategoryEntity(3, "Browsers");
        entities[3] = new CategoryEntity(4, "Media");

        this.setDictionaries(entities);
    }

}
