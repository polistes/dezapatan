package commandPaTan.kuidaoring;

class Main{
    public static void main(String[] args){
        Ramen ramen = new Ramen("小");
        new MashiCommand(new NinnikuCommand(ramen)).execute();
        new YasaiCommand(ramen).execute();

        System.out.println(ramen.getResult());

        Ramen myRamen = new Ramen("大");
        JorenCommand myOrder = new JorenCommand();
        myOrder.addCommand(new NinnikuCommand(myRamen));
        myOrder.addCommand(new YasaiCommand(myRamen));
        myOrder.addCommand(new KarameCommand(myRamen));
        myOrder.addCommand(new KarameCommand(myRamen));
        myOrder.addCommand(new AburaCommand(myRamen));

        myOrder.execute();

        System.out.println(myRamen.getResult());

    }
}
