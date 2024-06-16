package tester;

import static utils.TaskUtils.addTask;
import static utils.TaskUtils.deleteTask;
import static utils.TaskUtils.populateMap;
import static utils.TaskUtils.sortedByTaskDate;
import static utils.TaskUtils.updateTask;
import static utils.TaskUtils.viewAllPending;
import static utils.TaskUtils.viewTodayPending;
import static utils.TaskUtils.storeData;
import static utils.TaskUtils.readFromFile;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import core.Task;

public class TaskManagerUI {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			
			Map<Integer,Task> TaskMap = new HashMap<>();
			populateMap(TaskMap);
			
			boolean exit = false;
			while(!exit) {
				System.out.println("Options:\n"
						+ "1. Add New Task\n"
						+ "2. Delete a Task\n"
						+ "3. Update Task Status\n"
						+ "4. Display all Pending Tasks\n"
						+ "5. Display all Pending Tasks for Today\n"
						+ "6. Display all tasks sorted by taskDate\n"
						+ "7. Display all Tasks on Console\n"
						+ "0. Exit");
				try {
					switch(sc.nextInt()) {
					case 1:
						addTask(TaskMap, sc);
						break;
						
					case 2:
						deleteTask(TaskMap,sc);
						break;
						
					case 3:
						updateTask(TaskMap, sc);
						break;
						
					case 4:
						viewAllPending(TaskMap);
						break;
						
					case  5:
						viewTodayPending(TaskMap);
						break;
						
					case 6:
						sortedByTaskDate(TaskMap);
						break;
						
					case 7:
						System.out.println("Enter File Name");
						readFromFile(sc.next());
						break;
						
					case 0:
						System.out.println("Enter File Name");
						storeData(TaskMap, sc.next());
						exit=true;
						break;
						
					default:
						System.out.println("Invalid Choice");
					}
				}
				catch(Exception e) {
					sc.nextLine();
					System.out.println("Error: "+e);
					System.out.println("Please Retry");
				}
			}
		}
	}
}
