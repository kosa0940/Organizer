package stream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateFolders {

    boolean createHome = true;
    boolean createDev = true;
    boolean createTest = true;

    public CreateFolders() throws IOException {
        String path ="C:/";

        GetFileContent gf = new GetFileContent();

        for(int i =0;i<gf.files.length;i++){

            if(gf.files[i].equals("HOME")){createHome=false;}
            if(gf.files[i].equals("DEV")){createDev=false;}
            if(gf.files[i].equals("TEST")){createTest=false;}

        }
        if(createHome){
        createHome();
        }
        if(createDev) {
            createDev();
        }
        if(createTest) {
            createTest();
        }

    }

    public void createHome()throws IOException{
        Files.createDirectory(Paths.get("C:/HOME"));
    }
    public void createDev()throws IOException{
        Files.createDirectory(Paths.get("C:/DEV"));
    }
    public void createTest()throws IOException{
        Files.createDirectory(Paths.get("C:/TEST"));
    }
}
