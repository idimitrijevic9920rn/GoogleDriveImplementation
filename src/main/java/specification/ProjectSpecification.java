package specification;

import java.io.IOException;

public interface ProjectSpecification {

    public abstract void saveFile();
    public abstract void downloadFile(String path);
    public abstract void deleteFile(String path, int val);
    public abstract void viewFile(String files);
    public abstract void createStorage(String path,int val);
    public abstract void createFile(String path,int val);
    public abstract void moveFile(String file,String target);
    public abstract void logIn(String username,String password);
    
}
