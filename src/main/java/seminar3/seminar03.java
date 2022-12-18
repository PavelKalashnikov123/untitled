package seminar3;

import java.util.*;

public class seminar03 {
    public static void main(String[] args) {
        //arraySort();
        //arraySort2();
        Planets();
        Planets2();
    }

    private static void Planets2() {
//                planets.stream().distinct()
//                        .forEach(planet -> System.out.printf("%s\t-\t%s раз%n", planet,
//                                planets.stream().filter(planet::equals).count()));
//            }
//
//            private static void ex2_3() {
//                Map<String, Integer> frequencyByPlanet = new HashMap<>();
//                for (String planet : planets) {
//                    Integer frequency = frequencyByPlanet.getOrDefault(planet, 0);
///*            if (frequency == null) {
//                frequency = 0;
//            }*/
//
//                    frequencyByPlanet.put(planet, ++frequency);
//                }
//
//                frequencyByPlanet.forEach((planet, frequency) -> System.out.printf("%s\t-\t%s раз%n", planet, frequency));
//            }

        }

    private static void Planets() {
//        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//                Вывести название каждой планеты и количество его повторений в списке.

        List<String> v = Arrays.asList("Mercury", "Jupiter", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",
                "Neptune", "Pluto", "Jupiter", "Uranus", "Venus", "Mars", "Mercury", "Pluto");
        //ArrayList<String> List = new ArrayList<String>();
        System.out.println(v);
        List<String> b = new ArrayList<>();
        for (int i = 0; i < v.size()-1; i++) {
            int counter = 1;
            for (int j = 1; j < v.size(); j++) {
                if (v.get(i)==v.get(j)) {counter+=1;}
            }
            if (b.contains(v.get(i)) == false){
                b.add(v.get(i));
                System.out.printf("%s,%s\n",v.get(i),counter);
                }
                counter = 1;

            }


        }
    }


//    private static void arraySort2() {
//        //            Заполнить список десятью случайными числами.
////                    Отсортировать список методом sort() и вывести его на экран.
//            ArrayList<Integer> List = new ArrayList<Integer>();
//            Random random = new Random();
//            for (int i = 0; i < 100; i++) {
//                List.add(random.nextInt(100));
//            }
//            List.sort(Comparator.naturalOrder());
//            System.out.println(List);
//    }
//
//    private static void arraySort() {
//        //            Заполнить список десятью случайными числами.
////                    Отсортировать список методом sort() и вывести его на экран.
//            ArrayList<Integer> newList = new ArrayList<Integer>();
//            Random random = new Random();
//            for (int i = 0; i < 11; i++) {
//                newList.add(random.nextInt(20));
//            }
//            newList.sort(Comparator.naturalOrder());
//            System.out.println(newList);
//        }
//    }
