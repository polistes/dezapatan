class FlyWeightPaTan {

    public static void main(String[] args) {
        Integer a = new Integer(127);
        Integer b = Integer.valueOf(127);
        Integer c = Integer.valueOf(127);

        System.out.println(a == b ? "a == b" : "a != b");
        System.out.println(a == c ? "a == c" : "a != c");
        System.out.println(b == c ? "b == c" : "b != c");

        System.out.println("----------");

        Integer aa = new Integer(128);
        Integer bb = Integer.valueOf(128);
        Integer cc = Integer.valueOf(128);

        System.out.println(aa == bb ? "aa == bb" : "aa != bb");
        System.out.println(aa == cc ? "aa == cc" : "aa != cc");
        System.out.println(bb == cc ? "bb == cc" : "bb != cc");

    }
}
