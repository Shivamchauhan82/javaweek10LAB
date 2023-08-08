import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;

public class APIUtility {
    private HttpClient httpClient;

    public APIUtility() {
        httpClient = HttpClients.createDefault();
    }

    public String callAPIAndGetResponse() {
        // Implement the code to make the API call and get the JSON response
        // Use the httpClient instance to make the HTTP request
        // Return the JSON response as a string
    }
}
