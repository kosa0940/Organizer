package stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class CheckContent {

    GetFileContent gf = new GetFileContent();

    StringTokenizer st,st2;
    public  void moveFile() throws Exception {


        gf.getHomeContent();

        for(int i =0 ;i<gf.HOME.length;i++) {
            String fileName = gf.getHOME()[i].toString();


            String path = "C:/HOME/" + fileName;

            Path file = Paths.get(path);
            Path destinationDev = Paths.get("C:/DEV/" + fileName);
            Path destinationTest = Paths.get("C:/TEST/" + fileName);


            BasicFileAttributes attr =
                    Files.readAttributes(file, BasicFileAttributes.class);
            System.out.println("Godzine:" + attr.creationTime());
            st = new StringTokenizer(attr.creationTime().toString(), "T");
            st.nextToken();
            st2 = new StringTokenizer(st.nextToken(), ":");
            String hour = st2.nextToken();

            if (fileName.contains(".jar")) {

                if (Integer.parseInt(hour) % 2 == 0) {
                    Files.move(file, destinationDev);
                }
                if (Integer.parseInt(hour) % 2 != 0) {
                    Files.move(file, destinationTest);
                }
            }
            if (fileName.contains(".xml")) {
                Files.move(file, destinationDev);
            }
            if (fileName.contains(".jar") == false && fileName.contains(".xml") == false) {
                Files.delete(file);
            }
            System.out.println(hour);
        }
    }

    }

