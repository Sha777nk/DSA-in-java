package TCP;
import java.io.*;
import java.net.*;

public class TcpEchoServer {

    private final static int PORT= 8080;

    public static void main(String[] args) throws IOException {
        ServerSocket Ss =new ServerSocket(PORT);
        System.out.println("Server running on port "+ PORT);

        while (true) {
            try(Socket sc =Ss.accept();
                InputStreamReader isr =new InputStreamReader(sc.getInputStream());
                BufferedReader in=new BufferedReader(isr);
                PrintWriter out =new PrintWriter(sc.getOutputStream(),true);
            ){
                System.out.println("connection accepted");

                String line;
                while ((line=in.readLine())!=null) {
                    System.out.println("Server received:"+line);

                    if (line.equals("Bye")) {
                        System.out.println("Connection closed");
                        break;
                    }
                }
            }
            Ss.close();
        }
    }
}

