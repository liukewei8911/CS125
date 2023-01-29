import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SpoonacularAPI {
    public static void main(String[] args) throws IOException {
        String apiKey = "03ddc246f52b4243ab132773e2452ef2";
        String query = "chicken";
        int number = 10;
        String urlString = "https://api.spoonacular.com/recipes/complexSearch?apiKey=" + apiKey + "&query=" + query + "&number=" + number;
        URL url = new URL(urlString);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        con.disconnect();
        System.out.println(content.toString());
    }
}
