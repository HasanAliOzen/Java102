import java.util.ArrayList;
import java.util.List;

public class FixtureGenerator{
    List<String> teams = new ArrayList<>();

    public FixtureGenerator() {
    }

    public void generateFixture(){
        System.out.println(teams.get(0) + " vs " + teams.get(1));
    }

    public List<String> getTeams() {
        return teams;
    }
}
