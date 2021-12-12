package task;

import Entity.DeveloperEntity;
import Entity.Dictionary;
import Entity.SoftEntity;
import Service.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SoftService softService = new SoftService();

        DeveloperService developerService = new DeveloperService();
        DeveloperEntity[] developers = developerService.getDevelopers();

        System.out.println("List of software by developer");

        for (DeveloperEntity developer : developers) {
            System.out.println("\nSoftware made by " + developer.getName() + ": ");
            List<SoftEntity> softList = softService.getSoftByDeveloperId(developer.getId());
            for (SoftEntity softEntity : softList) {
                System.out.println(softEntity.getName());
            }
        }

        CategoryService categoryService = new CategoryService();
        Dictionary[] categories = categoryService.load();

        System.out.println("\nList of software by category");
        for (Dictionary category : categories) {
            System.out.println("\n" + category.getName() + ": ");
            List<SoftEntity> softList = softService.getSoftByCategoryId(category.getId());
            for (SoftEntity softEntity : softList) {
                System.out.println(softEntity.getName());
            }
        }

        CountryOriginService countryOriginService = new CountryOriginService();
        Dictionary[] countries = countryOriginService.load();

        System.out.println("\nList of software by country origin");
        for (Dictionary country : countries) {
            System.out.println("\n" + country.getName() + ": ");
            List<SoftEntity> softList = softService.getSoftByCountryOriginId(country.getId());
            for (SoftEntity softEntity : softList) {
                System.out.println(softEntity.getName());
            }
        }

        PlatformService platformsService = new PlatformService();
        Dictionary[] platforms = platformsService.load();

        System.out.println("\nList of software by platform");
        for (Dictionary platform : platforms) {
            System.out.println("\n" + platform.getName() + ": ");
            List<SoftEntity> softList = softService.getSoftByPlatformId(platform.getId());
            for (SoftEntity softEntity : softList) {
                System.out.println(softEntity.getName());
            }
        }
    }

}
