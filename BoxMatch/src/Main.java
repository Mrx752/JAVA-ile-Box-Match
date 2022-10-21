public class Main {
    public static void main(String[] args) {

        Fighter s1 = new Fighter("Yadigar",25,100,80,50);
        Fighter s2= new Fighter("Kerem",25,100,80,50);
        s1.print();
        s2.print();

        Match match = new Match(s1,s2,80,100);
        match.run();

    }
}