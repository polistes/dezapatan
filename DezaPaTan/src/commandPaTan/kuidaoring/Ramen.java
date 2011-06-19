package commandPaTan.kuidaoring;

class Ramen{
    private String menu;
    private String topping = "";

    public Ramen(String menu){
        this.menu = menu;
    }

    public void addTopping(String topping){
        this.topping += topping;
    }

    public String getResult(){
        return this.topping + menu;
    }
}
