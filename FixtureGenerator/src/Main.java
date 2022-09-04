import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FixtureGenerator fixtureGenerator = new FixtureGenerator();
        List<String> teams = fixtureGenerator.getTeams();

        teams.add("Başakşehir");
        teams.add("Beşiktaş");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Galatasaray");
        teams.add("Trabzonspor");
        teams.add("Boluspor");


        fixtureGenerator.generateFixture();



    }
}
