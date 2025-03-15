import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String message = "Строка для разделения";
        int partSize = 5;

        String[] parts = splitString(message, partSize);
        for (String part : parts) {
            System.out.println(part);

        }

    }

    private static String[] splitString(String message, int partSize) {
        String regex = ".{1," + partSize + "}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);

        List<String> partList = new ArrayList<>();
        while (matcher.find()) {
            partList.add(matcher.group());

        }
        return partList.toArray(new String[0]);
    }
}




