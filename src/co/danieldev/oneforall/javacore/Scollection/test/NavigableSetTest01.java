package co.danieldev.oneforall.javacore.Scollection.test;

import co.danieldev.oneforall.javacore.Scollection.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneNameComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneNameComparator());

        set.add(new Smartphone("123ASD", "Nokia"));
        set.add(new Smartphone("12A3SD", "Iphone"));

        for (Smartphone smartphone : set) {
            System.out.println(smartphone);
        }
    }
}
