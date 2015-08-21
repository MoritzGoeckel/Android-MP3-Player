package moritzgoeckel.com.mp3_player;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MediaFileFinder {

    private static List<String> output;

    public static List<String> getMediaFiles(String directory){
        output = new ArrayList<>();

        searchInDirectory(directory);

        return output;
    }

    private static void searchInDirectory(String directory)
    {
        File dir = new File(directory);
        String[] things = dir.list();

        for (String filePath:things) {
            File theFile = new File(filePath);

            if(theFile.isFile() && theFile.getPath().toLowerCase().endsWith(".mp3"))
                output.add(theFile.getAbsolutePath());

            if(theFile.isDirectory())
                searchInDirectory(filePath);
        }
    }

}
