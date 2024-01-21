
import java.util.Scanner;

public class CongestionControl {
    public static void main(String[] args) {
        int time = 0, remaining = 0, numPackets, bucketSize, outputRate;

        Scanner scanner = new Scanner(System.in);

        // Input: Number of packets, packet sizes, bucket size, and output rate
        System.out.println("Enter the number of packets:");
        numPackets = scanner.nextInt();

        int[] packetSizes = new int[numPackets];
        System.out.println("Enter packet sizes:");
        for (int i = 0; i < numPackets; i++)
            packetSizes[i] = scanner.nextInt();

        System.out.println("Enter the bucket size:");
        bucketSize = scanner.nextInt();

        System.out.println("Enter the output rate:");
        outputRate = scanner.nextInt();

        // Transmission simulation
        for (int i = 0; i < numPackets; i++) {
            System.out.println("\nTIME " + time);

            if (packetSizes[i] > bucketSize) {
                System.out.println("Dropped at time " + time);
            } else if ((packetSizes[i] + remaining) > bucketSize) {
                System.out.println("Dropped at time " + time);
            } else {
                remaining += packetSizes[i];
            }

            if (remaining < outputRate) {
                System.out.println("Bytes transmitted: " + remaining);
            } else {
                System.out.println("Bytes transmitted: " + outputRate);
            }

            remaining -= outputRate;
            if (remaining <= 0) {
                remaining = 0;
            } else {
                System.out.println("Bytes still to be transmitted: " + remaining);
            }

            time++;
        }

        // Transmission of remaining bytes
        while (remaining > 0) {
            System.out.println("\nTIME " + time);
            time++;

            if (remaining < outputRate) {
                System.out.println("Bytes transmitted: " + remaining);
                remaining = 0;
            } else {
                System.out.println("Bytes transmitted: " + outputRate);
                remaining -= outputRate;
                System.out.println("Bytes still to be transmitted: " + remaining);
            }
        }
        scanner.close();
    }
}