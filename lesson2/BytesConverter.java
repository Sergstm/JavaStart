package homework.les2;

public class BytesConverter {

    public static void main(String[] args) {

        long totalBytes = 3181608; // Input: any valid number of bytes

        long gigaBytes = (totalBytes / (1024 * 1024 * 1024)) % 1024 ;
        long megaBytes = (totalBytes / (1024 * 1024)) % 1024;
        long kiloBytes = (totalBytes / 1024) % 1024;
        long bytes = totalBytes % 1024;

        System.out.println(gigaBytes + " GB, " + megaBytes + " MB, "
                + kiloBytes + " KB, " + bytes + " B");
    }
}
