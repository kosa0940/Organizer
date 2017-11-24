package stream;

import java.io.*;

public class GetFileContent {

    public GetFileContent() {
        getContent("C:/");
    }

    public String files[];
    public String[] DEV;
    public String[] TEST;
    public String[] HOME;

    public void getContent(String path) {
        File file = new File(path);
        String pliki[] = file.list();
        files = pliki.clone();
    }

    public void getHomeContent() {
        File file = new File("C:\\HOME");
        String pliki[] = file.list().clone();
        HOME = pliki.clone();
    }

    public void getDevContent() {
        File file = new File("C:\\DEV");
        String pliki[] = file.list().clone();
        DEV=pliki.clone();
    }
    public void getTestContent() {
        File file = new File("C:\\TEST");
        String pliki[] = file.list().clone();
        TEST = pliki.clone();
    }

    public String[] getFiles() {
        return files;
    }

    public String[] getDEV() {
        return DEV;
    }

    public String[] getTEST() {
        return TEST;
    }

    public String[] getHOME() {
        return HOME;
    }
}
