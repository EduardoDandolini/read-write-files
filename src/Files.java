import java.io.*;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.util.Scanner;

public class Files extends SimpleFileVisitor<Path> {

    public static void readFile(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new FileReader(path));
        String line = bufferedReader.readLine();
        while (true){
            if (line != null) {
                System.out.println(line);
            } else
                break;
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
    }

    public static void writeFile(String path) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));
             Scanner sc = new Scanner(System.in)) {
            String line;
            System.out.println("Write (type 'exit' to finish):");
            while (!(line = sc.nextLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.append(line).append("\n");
            }
        }
    }


    public static void findFiles(String path) {
        File directory = new File(path);

        if (!directory.exists()) {
            System.out.println("The specified path does not exist.");
            return;
        }

        if (!directory.isDirectory()) {
            System.out.println("The specified path is not a directory.");
            return;
        }

        File[] files = directory.listFiles();
        if (files == null) {
            System.out.println("Failed to list files in the directory.");
            return;
        }

        StringBuilder output = new StringBuilder();
        for (File file : files) {
            output.append(file.getName()).append("\n\n");
        }
        System.out.print(output.toString());
    }

}
