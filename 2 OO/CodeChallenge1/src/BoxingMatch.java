public class BoxingMatch {

    public BoxingMatch(Fighter fighterOne, Fighter fighterTwo) {

        System.out.println("Boxing match starting...");
        System.out.println("Opponents : " + fighterOne.getName() + " and " + fighterTwo.getName());
    }

    public String fight(Fighter fighterOne, Fighter fighterTwo) {
        while (fighterOne.getHealth() > 0 && fighterTwo.getHealth() > 0) {
            fighterOne.attack(fighterTwo);
            System.out.println(fighterOne.getName() + " punches.");
            fighterTwo.attack(fighterOne);
            System.out.println(fighterTwo.getName() + " punches.");
        }

        System.out.println("Match over by KO!");
        if (fighterOne.getHealth() > 0) {
            return fighterOne.getName();
        } else {
            return fighterTwo.getName();
        }
    }
}
