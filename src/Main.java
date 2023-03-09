import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        extracted(getFileWriter());






    }

    private static FileWriter getFileWriter() throws IOException {
        Song song=new Song("Iz kaltyr","Mirbek atabekov"," ");
        System.out.println(song);
        FileWriter fileWriter = new FileWriter("songFile.txt");
        fileWriter.write("\nИз калтар." +

                "\nБул жашоодо таза жолду танда" +
                "\nМумкунчулук келет ар бир жанга." +
                "\nОзум дебей бул омурдо куйуп" +
                "\nЭмгегинди элин учун арна." );
        return fileWriter;

    }

    private static void extracted(FileWriter fileWriter) throws IOException {
        FileReader fileReader = new FileReader("songFile.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        fileWriter.close();
    }
}
