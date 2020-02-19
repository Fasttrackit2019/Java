package lab7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        List<String> myList = new ArrayList<>();
//        myList.add("Hello");
//        myList.add("Everybody");
//        myList.add("Hey");
//        myList.get(0); //get prin index
//        myList.remove(1); //remove index
//        myList.remove("Hello");

        LogicalOp logicalOp = new LogicalOp();

        List<Integer> list2 = new ArrayList<>();
        list2.add(50);
        list2.add(25);
        list2.add(1);
        list2.add(75);
        list2.add(100);
        list2.add(125);

//        logicalOp.addValue(list2, 10);
//        logicalOp.addValue(list2, 20);

        logicalOp.printElements(list2, 3);

//        logicalOp.reverseList(list2);


    }

}
