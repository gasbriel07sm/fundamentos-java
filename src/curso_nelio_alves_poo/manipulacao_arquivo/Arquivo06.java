package curso_nelio_alves_poo.manipulacao_arquivo;

import java.io.File;
import java.util.Scanner;

public class Arquivo06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName()); // somente o nome do arquivo
        System.out.println("getParent: " + path.getParent()); // somente o nome do caminho do arquivo
        System.out.println("getPath: " + path.getPath()); // nome do caminho completo


        sc.close();
    }
}
