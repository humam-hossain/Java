import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;

public class NetSpeed {

    private static final int NUM_MEASUREMENTS = 12;
    private static final int INTERVAL = 15;

    private static double measureDownloadSpeed() throws IOException {
        // Select a file on a fast server with a lot of bandwidth
        URL url = new URL("http://speedtest.tele2.net/1GB.zip");
        URLConnection connection = url.openConnection();
        connection.setReadTimeout(5000);
        connection.setConnectTimeout(5000);

        long startTime = System.nanoTime();
        byte[] buffer = new byte[1024];
        int bytesRead;
        int totalBytesRead = 0;

        // Read the file for NUM_MEASUREMENTS * INTERVAL seconds
        for (int i = 0; i < NUM_MEASUREMENTS; i++) {
            long currentTime = System.nanoTime();
            while ((System.nanoTime() - currentTime) < TimeUnit.SECONDS.toNanos(INTERVAL)) {
                bytesRead = connection.getInputStream().read(buffer);
                if (bytesRead == -1) {
                    break;
                }
                totalBytesRead += bytesRead;
            }
        }
        long endTime = System.nanoTime();

        // Calculate the average download speed
        long elapsedTime = endTime - startTime;
        double elapsedTimeInSeconds = (double) elapsedTime / TimeUnit.SECONDS.toNanos(1);
        double downloadSpeed = (totalBytesRead / 1000000.0) / elapsedTimeInSeconds;
        return downloadSpeed;
    }

    private static double measureUploadSpeed() throws IOException {
        // Select a file to upload
        byte[] data = new byte[1024 * 1024]; // 1 MB

        // Connect to a server that can accept file uploads
        String host = "yourserver.com";
        int port = 21;
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress(host, port));

        long startTime = System.nanoTime();
        for (int i = 0; i < NUM_MEASUREMENTS; i++) {
            long currentTime = System.nanoTime();
            while ((System.nanoTime() - currentTime) < TimeUnit.SECONDS.toNanos(INTERVAL)) {
                socket.getOutputStream().write(data);
            }
        }

        socket.close();
        
        long endTime = System.nanoTime();
        // Calculate the average upload speed
        long elapsedTime = endTime - startTime;
        double elapsedTimeInSeconds = (double) elapsedTime / TimeUnit.SECONDS.toNanos(1);
        double uploadSpeed = (data.length * NUM_MEASUREMENTS / 1000000.0) / elapsedTimeInSeconds;
        return uploadSpeed;
    }

    private static double measureLatency() throws IOException {
        // Connect to a server
        String host = "google.com";
        int port = 80;
        long totalLatency = 0;
        for (int i = 0; i < NUM_MEASUREMENTS; i++) {
            long startTime = System.nanoTime();
            try (Socket socket = new Socket()) {
                socket.connect(new InetSocketAddress(host, port), 5000);
                long endTime = System.nanoTime();
                totalLatency += endTime - startTime;
            }
        }
        double averageLatency = totalLatency / (NUM_MEASUREMENTS * TimeUnit.SECONDS.toNanos(1));
        return averageLatency;
    }

    public static void main(String[] args) {
        try {
            // Measure download speed
            double downloadSpeed = measureDownloadSpeed();
            System.out.println("Download speed: " + downloadSpeed + " Mbps");

            // // Measure upload speed
            // double uploadSpeed = measureUploadSpeed();
            // System.out.println("Upload speed: " + uploadSpeed + " Mbps");

            // Measure latency
            double latency = measureLatency();
            System.out.println("Latency: " + latency + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
      

