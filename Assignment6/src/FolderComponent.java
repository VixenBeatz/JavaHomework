import java.util.ArrayList;

public class FolderComponent {
    private String folderName;

    private ArrayList<FolderComponent> folders;

    private ArrayList<String> files;

    FolderComponent(String folderName) {
        this.folderName = folderName;
        folders = new ArrayList<FolderComponent>();
        files = new ArrayList<String>();
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String name) {
        this.folderName = name;
    }

    public ArrayList<String> getFiles() {
        return this.files;
    }

    public ArrayList<FolderComponent> getFolders() {
        return folders;
    }

    public boolean addFolder(FolderComponent newFolder) {
        boolean found = false;
        for (FolderComponent cFolder:
                this.folders) {
            if (cFolder.folderName == newFolder.folderName) {
                found = true;
            }
        }
        if (found) {
            return false;
        } else {
            this.folders.add(newFolder);
            return true;
        }
    }

    public boolean removeFolder(String folderName) {
        FolderComponent folder = null;
        for (FolderComponent rFolder:
             this.folders) {
                if (rFolder.folderName == folderName) {
                    folder = rFolder;
                }
        }
        if (folder != null) {
            folders.remove(folder);
            return true;
        } else {
            return false;
        }
    }

    public boolean addFile(String fileName) {
        boolean found = false;
        for (String cFileName:
                this.files) {
            if (cFileName == fileName) {
                found = true;
            }
        }
        if (found) {
            return false;
        } else {
            this.files.add(fileName);
            return true;
        }
    }

    public boolean removeFile(String fileName) {
        String foundFile = null;
        for (String rFile:
                this.files) {
            if (rFile == fileName) {
                foundFile = rFile;
            }
        }
        if (foundFile != null) {
            this.files.remove(foundFile);
            return true;
        } else {
            return false;
        }
    }
}
