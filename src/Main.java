import Service.BanqueService;

import javax.xml.ws.Endpoint;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Endpoint.publish("http://localhost:5000/",new BanqueService());
    }
}