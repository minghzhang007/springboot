package com.lewis.springboot.sample;

import java.util.*;

/**
 * Created by zcy on 2017/7/20.
 */
public class Test {

    public static void main(String[] args) {
        CollectionNote[] collectionNotes = getSortedCollectionNotes();

        List<Collector> collectors = getCollectors();

        dispatcher(collectionNotes, collectors);

        test(collectors);
    }

    private static void test(List<Collector> collectors) {
        collectors.forEach(collector -> {
            Integer totalMoney =
                    collector.getCollectionNotes().stream().map(x -> x.getMoney()).reduce(0, (o1, o2) -> o1 + o2);
            System.out.println(collector.getName() + ",totalMoney:" + totalMoney + ",num:"
                    + collector.getCollectionNotes().size());

        });
    }

    private static CollectionNote[] getSortedCollectionNotes() {
        CollectionNote[] collectionNotes = generateRandom(1010, 100, 10000);
        Collections.sort(Arrays.asList(collectionNotes), Comparator.comparingInt(CollectionNote::getMoney));
        return collectionNotes;
    }

    private static List<Collector> getCollectors() {
        List<Collector> collectors = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            collectors.add(new Collector("name_" + (i + 1)));
        }
        return collectors;
    }

    private static void dispatcher(CollectionNote[] collectionNotes, List<Collector> collectors) {
        Integer l = 0;
        Integer r = collectionNotes.length;
        int round = collectionNotes.length / (collectors.size() * 2) + 1;
        while (round > 0) {
            for (Collector collector : collectors) {
                while (hasNext(l, r)) {
                    List<CollectionNote> nextCouple = getNextCouple(collectionNotes, l, r);
                    l++;
                    r--;
                    collector.getCollectionNotes().addAll(nextCouple);
                    break;
                }
                continue;
            }
            round--;
        }
    }

    private static boolean hasNext(int l, int r) {
        return l < r;
    }

    private static List<CollectionNote> getNextCouple(CollectionNote[] collectionNotes, Integer l, Integer r) {
        List<CollectionNote> retList = new ArrayList<>();
        retList.add(collectionNotes[l]);
        retList.add(collectionNotes[r - 1]);
        return retList;
    }

    public static CollectionNote[] generateRandom(int count, int lowIndex, int upIndex) {
        CollectionNote[] ret = new CollectionNote[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            CollectionNote note = new CollectionNote(i + 1, random.nextInt(upIndex) % (upIndex - lowIndex) + lowIndex);
            ret[i] = note;
        }

        return ret;
    }

}
