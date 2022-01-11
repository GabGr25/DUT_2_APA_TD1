public class TestTemps {
    public static void main(String[]args){
        Tempss t1 = new Tempss(9,45);
        System.out.println(t1);
        t1.ajouterMinutes(30);
        System.out.println(t1);
        Tempss t2 = new Tempss(10);
        Tempss t3 = t2;
        t1.ajouterSecondes(7300);
        System.out.println(t2);

    }
}
