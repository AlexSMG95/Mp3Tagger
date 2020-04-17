import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GetFileList getFile = new GetFileList(scanner.nextLine());

        System.out.println(getFile.getArtistName(0));
    }
}
