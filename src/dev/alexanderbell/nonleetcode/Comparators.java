package dev.alexanderbell.nonleetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparators {
    public static void main(String[] args) {
        Interval one = new Interval(5, 7);
        Interval two = new Interval(3, 8);
        List<Interval> list = Arrays.asList(
                one,
                two,
                new Interval(4, 6)
        );

        System.out.println(list.toString());
        System.out.println(one.compareTo(two));
        Collections.sort(list);
        System.out.println(list.toString());
    }
}



class Interval implements Comparable<Interval> {
    int from, to; // note: you should generally make these private :)
    public Interval(int from, int to) {
        this.from = from;
        this.to = to;
    }
    @Override
    public String toString() {
        return "[" + Integer.toString(from) + "," + Integer.toString(to) + "]";
    }

    @Override
    public int compareTo(Interval o) {
        return this.from - o.from;
    }
}