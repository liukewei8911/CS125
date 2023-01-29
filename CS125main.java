import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CS125main {
    public static void main(String[] args) throws IOException {
        String foodName = "apple";
        String apiKey = "f5C78tVw0JXYoE3I4mhFiP4q6ofAyjtb9TbeX0CG";
        String urlString = "https://api.nal.usda.gov/fdc/v1/foods/search?query=apple&pageSize=2&api_key=f5C78tVw0JXYoE3I4mhFiP4q6ofAyjtb9TbeX0CG";
        String urlString1 = "https://api.nal.usda.gov/fdc/v1/food/" + foodName + "?api_key=" + apiKey;

        URL url = new URL(urlString);
        URLConnection connection = url.openConnection();
        InputStream inputStream = connection.getInputStream();
        Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name());
        String response = scanner.useDelimiter("\\A").next();
        System.out.println(response);
    }
}
