package org.aoc.y2015;

import java.util.ArrayList;
import java.util.List;

// Challenge implementation: https://adventofcode.com/2015/day/10
// https://en.wikipedia.org/wiki/Look-and-say_sequence
public class Advent2015Day10 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        List<Integer> initList = List.of(
                1, 3, 2, 1, 1, 3, 1, 1, 1, 2
        );
        System.out.println("init[0]: " + initList);
        System.out.println("init[0].size(): " + initList.size());

        List<Integer> next = initList;
        int i = 1;
        for (; i <= 39; ++i) {
            long startTimeIteration = System.currentTimeMillis();
            next = getLookAndSaySequence(next);
            long totalTimeIteration = System.currentTimeMillis() - startTimeIteration;

            System.out.println("next[" + i + "].size(): " + next.size());
            System.out.println("next[" + i + "] time ms: " + totalTimeIteration);
        }

        long startTimeIteration = System.currentTimeMillis();
        List<Integer> lookAndSaySequence40 = getLookAndSaySequence(next);
        long totalTimeIteration = System.currentTimeMillis() - startTimeIteration;
//        System.out.println("final[" + i + "]: " + lookAndSaySequence40);
        System.out.println("final[" + i + "].size(): " + lookAndSaySequence40.size());
        System.out.println("final[" + i + "] time ms: " + totalTimeIteration);

        System.out.println("TIME TAKEN TOTAL ms: " + (System.currentTimeMillis() - startTime));
    }

    static List<Integer> getLookAndSaySequence(List<Integer> input) {
        List<Integer> next = new ArrayList<>();

        List<Integer> workOn = new ArrayList<>(input);
        while (workOn.size() > 0) {
            int firstNum = workOn.get(0);
            int howManySameAsFirstNum = 0;
            int actIndex = 0;
            int foundNum = firstNum;

            while (foundNum == firstNum) {
                howManySameAsFirstNum++;
                if (workOn.size() == howManySameAsFirstNum) {
                    break;
                }
                actIndex++;
                foundNum = workOn.get(actIndex);
            }

            next.add(howManySameAsFirstNum);
            next.add(firstNum);

            for (int toDelete = 0; toDelete < howManySameAsFirstNum; toDelete++) {
                workOn.remove(0);
            }
        }

        return next;
    }
}
