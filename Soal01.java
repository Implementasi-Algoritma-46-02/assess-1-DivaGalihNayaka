import java.util.Scanner;
public class Soal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("");
            if (scanner.hasNextInt()) {  
                int nomor = scanner.nextInt();

				System.out.println("");
                System.out.println("123 " + (123 > nomor ? "valid" : "tidak valid"));
                System.out.println("456 " + (456 < nomor ? "valid" : "tidak valid"));
                System.out.println("789 " + (789 > nomor ? "valid" : "tidak valid"));
                System.out.println("101 " + (101 > nomor ? "valid" : "tidak valid"));
                System.out.println("135 " + (135 > nomor ? "valid" : "tidak valid"));
            } else {
                System.out.println("Error: Input harus berupa angka.");
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
;
            scanner.close();
        }
    }
}