public class Main {

    public static void main(String[] args) {

        Fighter fighterOne = new Fighter("Tim",100,15);
        Fighter fighterTwo = new Fighter("Max",100,25);

        BoxingMatch match = new BoxingMatch(fighterOne,fighterTwo);
        System.out.println("THE WINNER IS " + match.fight(fighterOne,fighterTwo) + " !");
    }
}
