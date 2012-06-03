import java.util.List;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("item1");
        list.add("item2");
        list.add("item3");

        Module listModule = new ListModule(list);
        Module adModule = new ADAdapter(new TextAD());

        Module textAdModule = new TextADAdapter();
        Module bannerAdModule = new BannerADAdapter();

        listModule.display();
        adModule.display();

        textAdModule.display();
        bannerAdModule.display();
    }
}
