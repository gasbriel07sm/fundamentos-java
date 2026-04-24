package curso_nelio_alves_poo.manipulacao_arquivo;

import java.io.File;
import java.util.Scanner;

public class Arquivo05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // listar pastas
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder: folders) {
            System.out.println(folder);
        }

        // listar arquivos
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file: files) {
            System.out.println(files);
        }

        // criar subpasta
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directoru created successful: " + success);
    }
}
