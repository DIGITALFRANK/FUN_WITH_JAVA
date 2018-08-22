import java.util.*;

public class colors {

	// question 1: starting small (+ part of question 8, 9, & 10)
	public static ArrayList<String> colorsList = new ArrayList<String>();
	public static ArrayList<String> newColorsList = new ArrayList<String>();
	
	// question 2: iterating
	public static void printColors() {
		for (String color :colorsList) {
			System.out.println("Today's Color is " + color);
		}
	}
	
	// question 3: updating
	public static void updateFifthElement(String newValue) {
		colorsList.set(4, newValue);
		System.out.println("3 - " + colorsList);
	}
	
	// question 4: deleting
	public static void removeThirdElement() {
		colorsList.remove(2);
		System.out.println("4 - " + colorsList);
	}
	
	// question 5: searching
	public static void searchColorsList(String color) {
		int index = colorsList.indexOf(color);
		if (index == -1) {
			System.out.println("5 - Sorry, your color is not inside the ArrayList");
		} else {
			colorsList.get(index);
			System.out.println("5 - " + color + " is found at index " + index);
		}
	}
	
	// question 6: sorting
	public static void sortColors() {
		colorsList.sort(String::compareToIgnoreCase);
		System.out.println("6 - " + colorsList);
	}
	
	// question 7: reversing
	public static void reverseOrder() {
		Collections.reverse(colorsList);
		System.out.println("7 - " + colorsList);
	}
	// question 8: copying
	public static void copyColors(ArrayList<String> yourList) {
		newColorsList = colorsList;
		System.out.println("8 - " + newColorsList);
	}
	
	// question 9: comparing
	public static void compareColorLists(ArrayList<String> list1, ArrayList<String> list2) {
		for (String color :list1) {
			if (list2.indexOf(color) != -1) {
				System.out.println(color);
			}
		}
	}
	
	// question 10: appending
	public static void appendColorList(ArrayList<String> list1, ArrayList<String> list2) {			
		list2.addAll(list1);
		System.out.println("10 - " + list2);
	}
	
	// question 11: looping
	public static void printColorList(ArrayList<String> yourList) {
		for (String color :yourList ) {
			System.out.println(color);
		}
	}
	
	// question 12: converting
	public static void convertArray(String[] yourArr) {
		ArrayList<String> arrList = new ArrayList<String>();
		for (int i = 0; i < yourArr.length; i++) {
			arrList.add(yourArr[i]);
		}
		System.out.println("12 - " + arrList);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// question 1: starting small
		colorsList.add("Blue");
		colorsList.add("Orange");
		colorsList.add("Brown");
		colorsList.add("Yellow");
		colorsList.add("Teal");
		colorsList.add("Red");
		
		System.out.println("1 -" + colorsList);
		System.out.println();
		// question 2: iterating
		System.out.println("*** start question 2 ****");
		printColors();
		System.out.println("*** end question 2 ****");
		System.out.println();
		// question 3: updating
		updateFifthElement("Magenta");
		System.out.println();
		// question 4: deleting
		removeThirdElement();
		System.out.println();
		// question 5: searching
		searchColorsList("Orange");
		System.out.println();
		// question 6: sorting
		sortColors();
		System.out.println();
		// question 7: reversing
		reverseOrder();
		System.out.println();
		// question 8: copying
		copyColors(colorsList);
		System.out.println();
		// question 9: comparing
		System.out.println("*** start question 9 ****");
		compareColorLists(colorsList, newColorsList);
		System.out.println("*** end question 9 ****");
		System.out.println();
		// question 10 appending
		appendColorList(newColorsList, colorsList);
		System.out.println();
		// question 11: looping
		System.out.println("*** start question 11 ****");
		printColorList(colorsList);
		System.out.println("*** end question 11 ****");
		System.out.println();
		// question 12: converting
		String[] myArr = {"a", "b", "c"};
		convertArray(myArr);
		
	}

}
