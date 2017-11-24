import stream.CheckContent;
import stream.CreateFolders;
import stream.GetFileContent;

public class Main {

   static GetFileContent gf = new GetFileContent();
   static CheckContent cc = new CheckContent();
    public static void main(String[] args) throws Exception {

        int count=0;

        while(true) {
            CreateFolders cf = new CreateFolders();
            gf.getHomeContent();
            System.out.println("Obieg: "+count++);
            Thread.sleep(1000);
            if(gf.HOME.length<1)continue;
            cc.moveFile();


        }
    }

}
