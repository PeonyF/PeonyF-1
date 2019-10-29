package com.company.monster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Gyes extends Monster {
    public Gyes()
    {
        super("기에스",10);
        final ConcurrentMap<String,Integer> skills = new ConcurrentHashMap<>();
        skills.put(" ",2);
        skills.put(" ",4);
        skills.put(" ",6);
        skills.put(" ",8);
        setSkills(skills);
    }

    @Override
    public String toString() {
        String str="";
        return super.toString();
    }
}
