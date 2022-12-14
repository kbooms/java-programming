package com.kevinbooms.ClassesAndObjects;

import com.kevinbooms.Interfaces.DoAction;

/*
    This class makes use of Interfaces
 */

public class NPC implements DoAction {

    // Just giving them a name for now
    private String npcName;

    // Contructor, Getter, Setter
    public NPC(String npcName) {
        this.npcName = npcName;
    }

    public String getNpcName() {
        return npcName;
    }

    public void setNpcName(String npcName) {
        this.npcName = npcName;
    }

    // Implementing Interface methods. @Override annotation is needed for Interface
    // Hello method
    @Override
    public void sayHello() {
        System.out.println(getNpcName() + " says Hello");
    }
    // Let's say they have a "Status"
    @Override
    public void currentStatus() {
        System.out.println(getNpcName() + " looks OK!");
    }
    // And why not have them be on fire?
    @Override
    public void goesUpInFlames() {
        System.out.println(getNpcName() + " goes up in Flames!");
    }
}
