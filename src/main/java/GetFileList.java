import java.io.File;
import java.util.ArrayList;

public class GetFileList {

    String path;
    private static ArrayList<File> listWithFileNames = new ArrayList<>();

    public GetFileList(String path){
        this.path = path;
    }

    public static void getListFiles(String path) {
        File f = new File(path);
        for (File s : f.listFiles()) {
            if (s.isFile() && s.toString().contains("mp3") && !s.toString().contains("jpg")) {
                listWithFileNames.add(s);
            } else if (s.isDirectory()) {
                getListFiles(s.getAbsolutePath());
            }
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

