
import com.kevinbooms.ClassesAndObjects.NPC;

public class PolymorphProgram {
    // This program will test the output of the NPC Object with the DoAction Interface implemented
    public static void main(String[] args){

        // Make a bunch of new NPC Objects
        NPC npcGeorge = new NPC("George");
        NPC npcDubs = new NPC("Dubs");
        NPC npcCarol = new NPC("Carol");
        NPC npcKaput = new NPC("Kaput");
        NPC npcRicka = new NPC("Ricka");

        // Make them do some actions
        npcGeorge.sayHello();
        npcRicka.sayHello();
        npcCarol.currentStatus();
        npcKaput.currentStatus();
        npcDubs.goesUpInFlames();
    }
}
