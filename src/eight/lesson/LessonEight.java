package eight.lesson;

import org.apache.commons.lang3.ArrayUtils;
import seven.lesson.MonsterTwo;


public class LessonEight {

    public static void main(String[] args){

        MonsterTwo.buildBattleBoard();

        char[][] tempBattleBoard = new char[10][10];

        MonsterTwo[] Monsters = new MonsterTwo[4];

        Monsters[0] = new MonsterTwo(1000, 20, 1, "Frank");
        Monsters[1] = new MonsterTwo(500, 40, 2, "Dracula");
        Monsters[2] = new MonsterTwo(1000, 20, 1, "Albert");
        Monsters[3] = new MonsterTwo(1000, 20, 1, "Boris");

        MonsterTwo.redrawBoard();

    for (MonsterTwo m : Monsters){
        if(m.getAlive()){
            int arrayItemIndex = ArrayUtils.indexOf(Monsters, m);
            m.moveMonster(Monsters, arrayItemIndex);
        }
    }

    MonsterTwo.redrawBoard();
}

}
