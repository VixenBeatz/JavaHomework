public class Main {
    public static void main(String[] args) {
        FolderComponent movies = new FolderComponent("Movies");

        FolderComponent drama = new FolderComponent("Drama");
        drama.addFile("casablanca.wmv");
        drama.addFile("goneWithTheWind.avi");


        FolderComponent action = new FolderComponent("Action");
        action.addFile("dieHard.avi");
        action.addFile("dieHard2.mp4");
        action.addFile("matrix.avi");

        System.out.println("List of files in " + action.getFolderName() + "folder: ");
        for (String file:
             action.getFiles()) {
            System.out.println(file + ";");
        }

        System.out.println("\nremoving matrix:");
        action.removeFile("matrix.avi");

        System.out.println("List of files in " + action.getFolderName() + "folder: ");
        for (String file:
                action.getFiles()) {
            System.out.println(file + ";");
        }

        System.out.println("\nadding matrix movie back:");
        action.addFile("matrix.avi");

        System.out.println("List of files in " + action.getFolderName() + "folder: ");
        for (String file:
                action.getFiles()) {
            System.out.println(file + ";");
        }

        movies.addFolder(action);
        movies.addFolder(drama);

        System.out.println("\nList of folders in " + movies.getFolderName() + "folder: ");
        for (FolderComponent fc:
                movies.getFolders()) {
            System.out.println("\n" + fc.getFolderName());
            System.out.println("List of files in " + fc.getFolderName() + "folder: ");
            for (String file:
                    fc.getFiles()) {
                System.out.println(file + ";");
            }
        }
    }
}
