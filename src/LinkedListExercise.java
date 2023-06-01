import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExercise {
    //This Class contains methods for LinkedList Implementations
    public static void main(String[] args) {

        LinkedList<String> statesInNigeria = new LinkedList<>();

        statesInNigeria.add("Ondo");
        statesInNigeria.add("Lagos");
        statesInNigeria.add("Oyo");
        statesInNigeria.add("Kwara");

        insertElementAtSpecifiedPosition(statesInNigeria,0,"Abia"); //Q1
        LinkedList<String> otherState = new LinkedList<>();
        otherState.add("Plateau");
        otherState.add("Katsina");
        otherState.add("Kano");

        otherState.addFirst("Enugu");
        otherState.addLast("Bayelsa");

        System.out.println("Add first method "+otherState);
//        insertCollectionElementsToAnotherList(statesInNigeria,2,otherState); //Q2

        LinkedList<String> states =new LinkedList<>();
        states.add("Yobe");
        states.add("Yola");

//        insertElementToFirstAndLastPosition(statesInNigeria,states);

        String state = "Bauchi";

//        insertElementToTheEndOfAList(statesInNigeria, "Borno");
//        insertElementToTheEndOfAList(statesInNigeria, state);

        String newState = "Markurdi";
        String lastState ="Tobi";
        insertElementAtTheFrontOfAList(statesInNigeria,newState);

        iterateThroughAllElementsInAList(statesInNigeria);

//        getFirstAndLastOccurrenceOfAnElement(statesInNigeria,newState,lastState);
//        getFirstAndLastOccurrenceOfAnElement(statesInNigeria,lastState);

        insertElementAtTheEndOfAList(statesInNigeria,newState);

//        iterateLinkedListInReverseOrder(statesInNigeria);

        iterateAtSpecifiedIndex(statesInNigeria,2);
    }
    public static void printElement(String element){
        System.out.println(element+", ");
    }

   //1. Write a Java Program to Insert the Specified Element at the Specified Position in
    //    the LinkedList

    public static void insertElementAtSpecifiedPosition(LinkedList<String> linkedList, int position, String element){
//        linkedList.add("Abuja");
        if (position<0 || position> linkedList.size()){
            printElement("Invalid Input");

        }else {
        linkedList.add(position, element);
        printElement(linkedList.toString());
        }
    }

    // 2. Write a Java Program to Insert some Elements at the Specified Position into a
    //LinkedList

    public static void insertCollectionElementsToAnotherList(LinkedList<String>list1, int position, LinkedList<String>list2){
        if (position<0 || position> list1.size()){
            printElement("Invalid Input");
        }else {
            for (String element : list2){
                list1.add(position,element);
                position++;
            }
        }
        printElement(list1.toString());
    }

    // 3. Write a Java Program to Insert Elements into the LinkedList at the First and Last
    //position
    public static void insertElementToFirstAndLastPosition(LinkedList<String> list1, LinkedList<String> list2){
//            for (String element : list2){
//                list1.addFirst(element);
//                list1.addLast(element);
//            }

        if (list2.size() == 0 || list2.size()>2) {
            printElement("Invalid Input");
        }else {
            list1.addFirst(list2.get(0));
            list1.addLast(list2.get(1));
        }
        printElement(list1.toString());
    }

    // 4. Write a Java Program to Append the Specified Element to the end of a LinkedList

    public static void insertElementToTheEndOfAList(LinkedList<String> firstList, String element){
        firstList.add(element);
        printElement(firstList.toString());
    }

    //5. Write a Java Program to Insert the Specified Element at the Front of a LinkedList

    public static void insertElementAtTheFrontOfAList(LinkedList<String> list, String element){
        list.add(0,element);
        printElement(list.toString());
    }

    //6. Write a Java Program to Iterate through all Elements in a LinkedList

    public static void iterateThroughAllElementsInAList(LinkedList<String>list){

//        for (String elements: list){
////            System.out.print(elements+", ");
//            printElement(elements);
//        }
        list.listIterator(0);
        printElement(list.toString());
    }

    //7. Write a Java Program to Get the First and Last Occurrence of the Specified
    //Elements in a LinkedList
    public static void getFirstAndLastOccurrenceOfAnElement(LinkedList<String> list, String element1, String element2){
        if (!list.contains(element1)|| !list.contains(element2)){
            printElement("Invalid Input");
        }else {

            printElement("First Occurrence of "+element1+  " is: ");
            printElement(String.valueOf(list.indexOf(element1)));
            printElement("Last Occurrence of "+element1+  " is: ");
            printElement(String.valueOf(list.lastIndexOf(element1)));

            printElement("First Occurrence of "+element2+  " is: ");
            printElement(String.valueOf(list.indexOf(element2)));
            printElement("Last Occurrence of "+element2+  " is: ");
            printElement(String.valueOf(list.lastIndexOf(element2)));
        }
    }

    //8. Write a Java Program to Insert the Specified Element at the end of a LinkedList

    public static void insertElementAtTheEndOfAList(LinkedList<String> list, String element){
        list.offerLast(element);
        printElement(list.toString());
    }

    //9. Write a Java Program to Iterate a LinkedList in Reverse Order
    public static void iterateLinkedListInReverseOrder(LinkedList<String> list){

        Iterator<String> iterator =  list.descendingIterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            printElement(element);
        }

    }

    //10. Write a Java Program to Iterate through all Elements in a LinkedList starting at
    //the specified position

    public static void iterateAtSpecifiedIndex(LinkedList<String> list, int index){
        list.listIterator(index);
        printElement(list.listIterator(index).toString());
        Iterator<String> iterator = list.listIterator(index);

        while (iterator.hasNext()){
            String element = iterator.next();
            printElement(element);
        }
    }



}


