/*File : ExceptionOnArray.java 
 * Deskripsi : Program penggunaan eksepsi menggunakan class library Java
 * Nama : Amara Putri Soniaji / 2406012310004
 * Tanggal : 6 Maret 2025
*/

public class ExceptionOnArray {
    public static void main(String[] args) {
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[4] = 11;
            arrayInteger[2] = 10;
        } catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}
