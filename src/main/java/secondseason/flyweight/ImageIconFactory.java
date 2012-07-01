import javax.swing.ImageIcon;
import java.net.URL;
import java.util.Map;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class ImageIconFactory {

    private static Map<Character, ImageIcon> map = new HashMap<Character, ImageIcon>();
    private static final String BASE_URL = "http://kuidaoring.appspot.com/images/number5_";
    private static final String SUFFIX = ".gif";

    public static ImageIcon getImageIcon(char c) throws java.net.MalformedURLException {

        if (c < '0' || c > '9') {
            throw new IllegalArgumentException();
        }

        if (!map.containsKey(c)) {
            map.put(c, new ImageIcon(new URL(BASE_URL + c + SUFFIX)));
            System.out.println("cache no hit: " + c);
        } else {
            System.out.println("cache hit: " + c);
        }
        return map.get(c);
    }

}
