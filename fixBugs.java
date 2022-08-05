import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class fixBugs {
	static void display(String[] arr){
		System.out.print("\n");
		for(int i=0; i<arr.length;i++){
		System.out.println(arr[i]);
		// display the all the Strings mentioned in the String


		}
		}
		private static void options() {
		String[] arr = {"1. To review expenditure",
		"2. To add expenditure",
		"3. To delete expenditure",
		"4. To sort expenditures",
		"5. To search an expenditure",
		"6. exit"
		};
		int[] arr1 = {1,2,3,4,5,6};
		int slen = arr1.length;
		ArrayList<Integer> expenses = new ArrayList<Integer>();
		expenses.add(3000);
		expenses.add(5000);
		expenses.add(250);
		expenses.add(10000);
		expenses.add(50);
		Scanner sc = new Scanner(System.in);
		int options;
		while(true){
		display(arr);
		System.out.println("\nEnter the choice");
		options = sc.nextInt();
		switch (options){
		case 1:
		System.out.println("Your expenses are: \n");


		System.out.println(expenses+"\n");
		continue;
		case 2:
		System.out.println("Enter the value to add Expense: \n");


		int value = sc.nextInt();
		expenses.add(value);
		System.out.println("Value is updated\n");

		System.out.println(expenses+"\n");
		continue;
		case 3:
		System.out.println(" your expenses will be deleted ");
		int con_choice = sc.nextInt();
		if(con_choice==options){
		expenses.clear();
		System.out.println(expenses+"\n");
		System.out.println("All your expenses are erased!\n");

		} else {
		System.out.println("Oops... try again!");
		}
		continue;
		case 4:
		sortExpenses(expenses);
		continue;
		case 5:
		searchExpenses(expenses);
		continue;
		case 6:
		closeApp();
		break;
		default:
		System.out.println("You have made an invalid choice!");
		break;
		}
		}
		}
		
		private static void closeApp() {
		System.out.println("Closing your application... \nThank you!");
		System.exit(0);
		
		}

		private static void searchExpenses(ArrayList<Integer> arrayList) {
		int leng = arrayList.size();
		System.out.println("Enter the expense you need to search:\t");
		Scanner sc = new Scanner(System.in);
		System.out.println("You expense to search ?");
		int toSearch = sc.nextInt();
		//Complete the method
		//can use arrayList.contains(toSearch) method
		//use simple linear search as it not a sorted array we cant use

		//loop through each element and compare with toSearch element
		//if found set flag as 1 and display Yes and break from loop
		//else display NO at last
		int flag = 0;
		for(int x: arrayList){
		if(x == toSearch){
		flag = 1;
		System.out.println("Expense is present in the expense list");
		break;
		}
		}
		if(flag == 0)
		System.out.println("Expense is not present in the expenselist");


		}
		private static void sortExpenses(ArrayList<Integer> arrayList) {
		int arrlength = arrayList.size();
		//Complete the method. The expenses should be sorted in

		//To avoid changing elements in original arrayList, take copy
		//used insertion sort for sorting
		//start from index 1 and loop through end of list
		//for each element, compare with previous element
		//if previous element is smaller, continue, because upto that

		//else if previous element is larger, swap both and check upto

		//At the end, list will be sorted
		ArrayList tempArray = new ArrayList(arrayList);
		int temp;
		int j;
		for(int i=1;i<arrlength;i++){
		j = i;

		while(j>0 && (int)tempArray.get(j-
		1)>(int)tempArray.get(j)){

		temp = (int)tempArray.get(j);
		tempArray.set(j, tempArray.get(j-1));
		tempArray.set(j-1, temp);
		j--;
		}
		}
		Iterator itr = tempArray.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
		}
		public static void main(String[] args) {
		/*System.out.println("Hello World!");*/
		System.out.println("\n**************************************\n");
		System.out.println("\tWelcome to TheDesk \n");
		System.out.println("**************************************");
		options();
		}


}
