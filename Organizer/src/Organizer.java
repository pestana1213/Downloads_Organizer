import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class Organizer {

    File folder = new File("C:\\Users\\Pestana\\Downloads");
    File f1 = new File("C:\\Users\\Pestana\\Downloads\\imagens");
    boolean bool = f1.mkdir();
    File f2 = new File("C:\\Users\\Pestana\\Downloads\\rar");
    boolean bool2 = f2.mkdir();
    File f3 = new File("C:\\Users\\Pestana\\Downloads\\pdf");
    boolean bool3 = f3.mkdir();
    File f4 = new File("C:\\Users\\Pestana\\Downloads\\txt");
    boolean bool4 = f4.mkdir();
    File f5 = new File("C:\\Users\\Pestana\\Downloads\\html");
    boolean bool5 = f5.mkdir();
    File f6 = new File("C:\\Users\\Pestana\\Downloads\\python");
    boolean bool6 = f6.mkdir();
    File f7 = new File("C:\\Users\\Pestana\\Downloads\\jupyter");
    boolean bool7 = f7.mkdir();
    File f8 = new File("C:\\Users\\Pestana\\Downloads\\OtherStuff");
    boolean bool8 = f8.mkdir();


    public void organizer() throws IOException {

        for (File file : Objects.requireNonNull(folder.listFiles()))
        {
            if (!file.isDirectory()) {
                if(file.getName().contains((".png")) || file.getName().contains((".jpeg")) || file.getName().contains((".jpg")) ){
                    Path temp = Files.move
                            (Paths.get((folder.getPath()) + '\\' +file.getName()),
                                    Paths.get(f1.getPath() + '\\' +file.getName()));
                    System.out.println(temp);

                }
               else if(file.getName().contains((".rar")) ||  file.getName().contains((".zip")) ){
                    Path temp = Files.move
                            (Paths.get((folder.getPath()) + '\\' +file.getName()),
                                    Paths.get(f2.getPath() + '\\' +file.getName()));
                }
               else if(file.getName().contains((".pdf"))){
                    Path temp = Files.move
                            (Paths.get((folder.getPath()) + '\\' +file.getName()),
                                    Paths.get(f3.getPath() + '\\' +file.getName()));
                }
               else if(file.getName().contains((".txt"))){
                    Path temp = Files.move
                            (Paths.get((folder.getPath()) + '\\' +file.getName()),
                                    Paths.get(f4.getPath() + '\\' +file.getName()));
                }
               else if(file.getName().contains((".html"))){
                    Path temp = Files.move
                            (Paths.get((folder.getPath()) + '\\' +file.getName()),
                                    Paths.get(f5.getPath() + '\\' +file.getName()));
                }

               else if(file.getName().contains((".py"))){
                    Path temp = Files.move
                            (Paths.get((folder.getPath()) + '\\' +file.getName()),
                                    Paths.get(f6.getPath() + '\\' +file.getName()));
                }
               else if(file.getName().contains((".ipynb")) || file.getName().contains((".tex")) ){
                    Path temp = Files.move
                            (Paths.get((folder.getPath()) + '\\' +file.getName()),
                                    Paths.get(f7.getPath() + '\\' +file.getName()));
                }

               else{
                    Path temp = Files.move
                            (Paths.get((folder.getPath()) + '\\' +file.getName()),
                                    Paths.get(f8.getPath() + '\\' +file.getName()));
                }
            }
        }
    }
}
class Main{
    public static void main(String[] args) throws IOException {
        Organizer org = new Organizer();
        org.organizer();
    }
}
