import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        String originDirectory = "C:\\DummyFolder_3";  // For the code to work, there must be a relevant folder in the directory.
        // Get all names of files from origin Directory
        File originDir = new File(originDirectory);
        File[] listOfFiles = originDir.listFiles();
        // get the latest created file time
        // initialize a time
        LocalDateTime lastFileCreateTime = LocalDateTime.of(2000,01,01, 00,00,00);
        for (File file : listOfFiles) {
            if (file.isFile()){
                // path of file
                Path pathOfFile = Paths.get(originDir.getPath()).resolve(file.getName());
                // get last modified time of file
                FileTime lastModifiedTime = Files.getLastModifiedTime(pathOfFile);
                //Convert FileTime into LocalDateTime
                LocalDateTime convertedFileTime = LocalDateTime.ofInstant(lastModifiedTime.toInstant(), ZoneId.systemDefault());
                //find last modified time
                if(convertedFileTime.isAfter(lastFileCreateTime)){
                    lastFileCreateTime = convertedFileTime;
                }
            }
        }
        //convert last modified time into string in yyyy_MM_dd format
        String stringLastFileCreateTime =lastFileCreateTime.format(DateTimeFormatter.ofPattern("yyyy_MM_dd")).toString();

        // create target directory with time prefix
        String newName = "TargetFolder";
        String newFolderName = stringLastFileCreateTime + "-" +newName;
        //create new directory
        Path newDirectory = Files.createDirectories(Paths.get("C:\\"+newFolderName));

        // Move all files from originDir to targetDir
        for (File file : listOfFiles) {
            if (file.isFile()) {
                // path of a file in origin Directory
                Path path = Paths.get(originDir.getPath()).resolve(file.getName());
                // create target path for file
                Path targetPath = Paths.get(newDirectory.toString()).resolve(file.getName());
                // move file into new directory
                Files.move(path, targetPath);
            }
        }


    }

    public static String getLastModificationTime(){




        return "";
    }



}
