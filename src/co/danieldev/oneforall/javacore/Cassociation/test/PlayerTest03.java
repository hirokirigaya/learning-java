package co.danieldev.oneforall.javacore.Cassociation.test;

import co.danieldev.oneforall.javacore.Cassociation.domain.Player;
import co.danieldev.oneforall.javacore.Cassociation.domain.Team;

public class PlayerTest03 {

    public static void main(String[] args) {
        Player player1 = new Player("Condoriano");
        Player player2 = new Player("Juliano");
        Player[] players = { player1, player2};

        Team team = new Team("Brazil", players);

        player1.setTeam(team);
        player2.setTeam(team);

        team.print();
    }
}
