package Lesson_1;

import java.util.*;

public class Team {

    private String nameTeam = "TeamHuman";
    Human[] people = {new Boy1("Boris"), new Boy2("Nikolay"), new Girl1("Olga"), new Girl2("Nadia")};
    public Human[] teamHuman = new Human[4];
    Random random = new Random();

    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
        for(int i = 0; i < 4; i++){
            int run = random.nextInt(3);
            teamHuman[i] = people[run];
        }
    }
    public void printInformationAboutTheTeam() {
        System.out.println("Team: " + nameTeam);
        for(Human a : teamHuman) {
            System.out.println(a);
            System.out.println("Run limit: " + a.run_limit);
            if (a instanceof Swimable)
                System.out.println("Swim limit: " + ((Swimable) a).getSwimLimit());
            if (a instanceof Jumpable)
                System.out.println("Jump limit: " + ((Jumpable) a).getJumpLimit());
        }
        System.out.println();
    }
    public void passedTheDistance(){
        System.out.println(nameTeam + "\n");
        for (Human a : teamHuman){
            if(a.passing){
                System.out.println(a + " successfully passed the distance.\n");
            } else {
                System.out.println(a + " did not pass the distance.\n");
            }
        }
        System.out.println();
    }
}

