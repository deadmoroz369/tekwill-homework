package com.tekwill.learning.basics.display_a_pattern.world_population;

//display a pattern
public class Population {
    long current = 7831436009L;
    double rate = 1.05;
    final String world = "World Population Prospect the 2019 Revision - United Nations,\nDepartment of Economic and Social Affairs, Population Division\n(June 2019)";
    final String census = "International Programs Center at the U.S. Census Bureau,\nPopulation Division";


    public static void main(String[] args) {
        Population population = new Population();
        System.out.println(population.current);
        System.out.println(population.rate + "%");
        System.out.println(population.world);
        System.out.println(population.census);

    }


}
