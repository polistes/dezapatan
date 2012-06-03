import java.util.List;

class ListModule implements Module {
    private List<String> list;
    public ListModule(List<String> list) {
        this.list = list;
    }

    public void display() {
        System.out.println("<ul>\n");
        for (String item : list) {
            System.out.println("<li>" + item + "</li>\n");
        }
        System.out.println("</ul>\n");
    }
}
