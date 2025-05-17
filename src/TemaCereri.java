import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TemaCereri {
    public static void main(String[] args) {
        try {
            //Creaza clientul HTTP
            HttpClient client = HttpClient.newHttpClient();

            //Creaza request-ul GET
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://jsonplaceholder.typicode.com/posts"))
                    .GET()
                    .build();

            //Trimite request-ul si primeste raspunsul
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

            //Afisam raspunsul
            System.out.println("Status: " + response.statusCode());
            System.out.println("Body: "   + response.body());
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}