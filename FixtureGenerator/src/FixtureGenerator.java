import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FixtureGenerator{
    List<String> teams = new LinkedList<>();

    public FixtureGenerator() {

    }

    public void generateFixture(){
        Collections.shuffle(teams);

        if (getTeams().size()% 2 == 1){
            teams.add("bay");
        }
        int teamSize = getTeams().size();

        for (int i = 0; i < ((teamSize-1) * 2); i++) {
            System.out.println("Round " + (i+1));
            for (int j = 0; j < getTeams().size(); j+=2) {
                if (i % 2 == 0){
                    System.out.println(teams.get(j) + " vs " + teams.get(j+1));
                }else {
                    System.out.println(teams.get(j+1) + " vs " + teams.get(j));
                }

            }
            teams.add(1,teams.get(teamSize-1));
            teams.remove(teamSize);
        }

        if (getTeams().size() % 2 == 1){
            teams.remove(getTeams().size()-1);
        }

    }

    public List<String> getTeams() {
        return teams;
    }
}
