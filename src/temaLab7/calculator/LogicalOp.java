package temaLab7.calculator;

import java.util.List;

public class LogicalOp {

//    Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand,
//    toate valorile din lista, fiecare pe rand nou.

    public void printList(List<String> gameList) {
        for (int i = 0; i < gameList.size(); i++) {
            System.out.println(gameList.get(i));
        }
    }

//    Scrieti o metoda Java, care sa primeasca doi parametrii:
//    un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg).
//    Metoda sa adauge numarul primit ca si parametru la final de lista.

    public void addValue(List<Integer> list, int number) {
        list.add(number);
        System.out.println(list);
    }

//    Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista,
//    iar celalalt un numar intreg. Sa se parcurga lista si sa afiseze, pe rand,
//    toate valorile din lista, fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.

    public void printElements(List<Integer> list, int number) {
        for (int i = number; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

//    Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze,
//    pe rand, toate valorile din lista, dar invers (de la capat la inceput).

    public void reverseList(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

//    Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri,
//    unul de tip intreg, si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita,
//    iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.

    public void listEx(List<String> gameList, String addGame, int number) {
        gameList.add(number, addGame);
        System.out.println(gameList);
    }

//    Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista,
//    iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.

    public void listLastNumber(List<Integer> list, int number) {
        list.add(0, number);
        System.out.println(list);
    }

//    Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista,
//    si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).

    public void showItemPostion(List<String> gameList) {
        for (int i = 0; i < gameList.size(); i++) {
            System.out.println("Pozitia " + i + " este " + gameList.get(i));
        }
    }

//    Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

    public int findMaxValue(List<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}









