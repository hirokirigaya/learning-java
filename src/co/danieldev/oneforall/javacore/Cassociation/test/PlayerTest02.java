package co.danieldev.oneforall.javacore.Cassociation.test;

import co.danieldev.oneforall.javacore.Cassociation.domain.Player;
import co.danieldev.oneforall.javacore.Cassociation.domain.Team;

public class PlayerTest02 {

    public static void main(String[] args) {
        Player p1 = new Player("Carlos");

        Team team = new Team("Brazil");

        p1.print();

        p1.setTeam(team);
        System.out.println("-----------");

        p1.print();


    }
}
