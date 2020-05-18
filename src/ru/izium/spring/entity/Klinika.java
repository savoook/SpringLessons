package ru.izium.spring.entity;

import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Properties;
import java.util.Set;

public class Klinika {
    private Properties contacts;
    private List<Dog> dogList;
    private Set<Master> masterSet;

    public Properties getContacts() {
        return contacts;
    }

    public void setContacts(Properties contacts) {
        this.contacts = contacts;
    }

    public List<Dog> getDogList() {
        return dogList;
    }

    public void setDogList(List<Dog> dogList) {
        this.dogList = dogList;
    }

    public Set<Master> getMasterSet() {
        return masterSet;
    }

    public void setMasterSet(Set<Master> masterSet) {
        this.masterSet = masterSet;
    }


    @Override
    public String toString() {
        return "Klinika{" +
                "contacts=" + contacts +
                ", dogList=" + dogList +
                ", masterSet=" + masterSet +
                '}';
    }
}
