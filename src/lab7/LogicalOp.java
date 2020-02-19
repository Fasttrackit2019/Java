package lab7;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class LogicalOp {

    public void addValue(List<Integer> list, int number) {
        list.add(number);
    }

    public void printList(List<String> myList) {
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//    }
        for (String element : myList) {    //for each method
            System.out.println(element);
        }
    }

    public void printElements(List<Integer> list2, int number) {
        for (int i = number; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }

    public void reverseList(List<Integer> list2) {
        for (int i = list2.size() - 1; i >= 0; i--) {
            System.out.println(list2.get(i));
        }
    }

}









