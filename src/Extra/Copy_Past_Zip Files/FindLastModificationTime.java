import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FindLastModificationTime {
    public static void main(String[] args) throws IOException {
        String originDirectory = "C:\\DummyFolder_1";  // For the code to work, there must be a relevant folder in the directory.
        // initialize a time
        LocalDateTime startTime = LocalDateTime.of(2000,01,01, 00,00,00);

        LocalDateTime stringLastFileCreateTime = getLastModificationTime(originDirectory, startTime);

        //        //convert last modified time into string in yyyy_MM_dd format
//        String time = startTime.format(DateTimeFormatter.ofPattern("yyyy_MM_dd"));

        System.out.println(stringLastFileCreateTime);

    }

    private static LocalDateTime getLastModificationTime(String originDirectory, LocalDateTime startTime) throws IOException {
        // Get all names of files from origin Directory
        File originDir = new File(originDirectory);
        File[] listOfFiles = originDir.listFiles();
        // get the latest created file time
        for (File file : listOfFiles) {
            if (file.isFile()){
                // path of file
                Path pathOfFile = Paths.get(originDir.getPath()).resolve(file.getName());
                // get last modified time of file
                FileTime lastModifiedTime = Files.getLastModifiedTime(pathOfFile);
                //Convert FileTime into LocalDateTime
                LocalDateTime convertedFileTime = LocalDateTime.ofInstant(lastModifiedTime.toInstant(), ZoneId.systemDefault());
                //find last modified time
                if(convertedFileTime.isAfter(startTime)){
                    startTime = convertedFileTime;
                }
            } else {
                if(getLastModificationTime(file.toString(),startTime).isAfter(startTime)){
                    startTime = getLastModificationTime(file.toString(),startTime);
                }
            }
        }

        return startTime;
    }
}
