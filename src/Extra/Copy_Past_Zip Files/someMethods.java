import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class someMethods {

    void nonn(){
//        Path path_1 = Paths.get("C:\\DummyFolder_1");
//        System.out.println(path_1);
//
//        Path path_2 = Paths.get("C:\\DummyFolder_1");
//        System.out.println(path_2.resolve("readme.txt"));
//
//        FileTime lastModifiedTime = Files.getLastModifiedTime(path_2);
//        System.out.println(lastModifiedTime);
//
//        Path tempFile2 = Files.createTempFile(path_2.getParent(), "somePrefixOrNull", ".jpg");
//        System.out.println("tempFile2 = " + tempFile2);

//
//        Path utfFile = Files.createTempFile("some", ".txt");
//
//        try {
//            Files.move(utfFile, Paths.get("C:\\DummyFolder_2").resolve(utfFile.getFileName().toString()));
//        } catch (FileAlreadyExistsException e) {
//            // help, that didn't work!
//        }
//
    }

    void listOfFile(){
        File folder = new File("C:\\DummyFolder_1");
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }

    void createNewDirectory() throws IOException {
        Path path = Paths.get("C:\\DummyFolder_1");
        Path newDirectory = Files.createDirectories(path.getParent().resolve("some/new/dir")); // delete .getParent
        System.out.println("newDirectory = " + newDirectory);
    }

    void getLastModifiedTime() throws IOException {

    }

    void moveFile() throws IOException {
        Path path = Paths.get("C:\\DummyFolder_2").resolve("pdf.pdf");
        Path targetPath = Paths.get("C:\\DummyFolder_1").resolve(path.getFileName().toString());
        Files.move(path, targetPath);
    }
}
