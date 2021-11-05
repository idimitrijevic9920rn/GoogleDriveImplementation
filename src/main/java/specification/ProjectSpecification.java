package specification;

import java.io.IOException;

public interface ProjectSpecification {

    public abstract void saveFile();
    public abstract void downloadFile();
    public abstract void deleteFile(String path, int val);
    public abstract void viewFile();
    public abstract void createStorage(String path,int val);
    public abstract void createFile(String path,int val);
    public abstract void moveFile(String file,String target);
    
}
