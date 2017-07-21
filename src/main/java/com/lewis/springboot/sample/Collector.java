package com.lewis.springboot.sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by zcy on 2017/7/20.
 */
public class Collector {
    private String name;

    private Set<CollectionNote> collectionNotes = new HashSet<>(60);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<CollectionNote> getCollectionNotes() {
        return collectionNotes;
    }

    public void setCollectionNotes(Set<CollectionNote> collectionNotes) {
        this.collectionNotes = collectionNotes;
    }

    public Collector(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Collector{" +
                "name='" + name + '\'' +
                ", collectionNotes=" + collectionNotes +
                '}';
    }
}
