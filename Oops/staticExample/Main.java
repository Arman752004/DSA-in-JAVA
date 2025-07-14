package Oops.staticExample;

public class Main {
    public static void main(String[] args) {
        Human arman = new Human(22, "Arman Panda",22000, false);
        Human kunal = new Human(34, "Kunal Kushwaha",34000, true);
        Human arpit = new Human(26, "Arpit Saha",20000, true);

        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
