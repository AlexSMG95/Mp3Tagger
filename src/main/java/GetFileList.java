import java.io.File;
import java.util.ArrayList;

public class GetFileList {

    String path;
    public static ArrayList<File> listWithFileNames = new ArrayList<File>();

    public GetFileList(String path){
        this.path = path;
        getListFiles(path);
    }

    public void getListFiles(String path) throws NullPointerException {
        File f = new File(path);
        for (File s : f.listFiles()) {
            if (s.isFile() && s.toString().contains("mp3")) {
                listWithFileNames.add(s);
            } else if (s.isDirectory()) {
                getListFiles(s.getAbsolutePath());
            }
        }
    }

    public String getFileName (int file) {
        String fileName = "";
        for (int i = listWithFileNames.get(file).toString().lastIndexOf("\\") + 1; i < listWithFileNames.get(file).toString().length(); i++) {
            fileName += listWithFileNames.get(file).toString().charAt(i);
        }
        return fileName;
    }

    public String getArtistName (int file) {
        String artistName = "";
        getFileName(file);
        for (int i = listWithFileNames.get(file).toString().lastIndexOf("\\") + 1; i < listWithFileNames.get(file).toString().lastIndexOf("-") - 1; i ++) {
            artistName += listWithFileNames.get(file).toString().charAt(i);
        }
        return artistName;
    }

    public String getTrackName (int file) {
        String TrackName = "";
        getFileName(file);
        for (int i = listWithFileNames.get(file).toString().lastIndexOf("-") + 2; i < listWithFileNames.get(file).toString().lastIndexOf("."); i ++) {
            TrackName += listWithFileNames.get(file).toString().charAt(i);
        }
        return TrackName;
    }

    public String getPath() {
        return path +"\\";
    }

    public void setPath(String path) {
        this.path = path;
    }
}

