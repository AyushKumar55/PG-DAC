package utils;

import static core.Status.COMPLETED;
import static core.Status.IN_PROGRESS;
import static core.Status.PENDING;
import static java.time.LocalDate.parse;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

import core.Task;
import custom_exception.MyException;

public class TaskUtils {

	public static void populateMap(Map<Integer, Task> TaskMap) {
		TaskMap.put(1, new Task("Presentation", "Presentation on Real Estates and Investments", parse("2024-04-20"),
				PENDING, true));
		TaskMap.put(2, new Task("Java Assignments", "Assignments on I/O, Serialization & Deserialization",
				parse("2024-04-23"), PENDING, true));
		TaskMap.put(3, new Task("Java Lab Exam", "Prepare for the exam by Solving Practice Ques.", parse("2024-04-29"),
				IN_PROGRESS, true));
		TaskMap.put(4, new Task("CPP Lab Exam", "Appear for the exam", parse("2024-04-21"), COMPLETED, false));
		TaskMap.put(5, new Task("EC PPT Presentation", "Deliver the Presentation on Real Estates and Investments",
				parse("2024-04-30"), PENDING, true));
		TaskMap.put(6, new Task("StyleWithPen", "Complete this project", parse("2024-04-25"), PENDING, true));
		TaskMap.put(7, new Task("Task Manager", "Complete this project", parse("2024-04-25"), PENDING, true));
	}

	public static void addTask(Map<Integer, Task> TaskMap, Scanner sc) {
		sc.nextLine();
		System.out.println("Enter Task Name");
		String name = sc.nextLine();
		System.out.println("Enter Task Description");
		String desc = sc.nextLine();
		System.out.println("Enter Task Date(yyyy-mm-dd)");
		String date = sc.nextLine();

		Task newTask = new Task(name, desc, LocalDate.parse(date), PENDING, true);
		TaskMap.put(newTask.getTaskId(), newTask);

	}

	public static void deleteTask(Map<Integer, Task> TaskMap, Scanner sc) throws MyException {
		System.out.println("All Tasks");
		TaskMap.values().stream().forEach(t -> System.out.println(t));
		System.out.println("Enter Task Id to be Deleted");
		int id = sc.nextInt();
		if (TaskMap.containsKey(id)) {
			Task t1 = TaskMap.get(id);
			t1.setActive(false);
			System.out.println("After Updation: " + t1);
		} else
			throw new MyException("Task Id not found");
	}

	public static void updateTask(Map<Integer, Task> TaskMap, Scanner sc) throws MyException {
		System.out.println("All Tasks");
		TaskMap.values().stream().forEach(t -> System.out.println(t));
		System.out.println("Enter Task Id to be Deleted");
		int id = sc.nextInt();
		if (TaskMap.containsKey(id)) {
			Task t1 = TaskMap.get(id);
			t1.setStatus(COMPLETED);
			System.out.println("After Updation: " + t1);
		} else
			throw new MyException("Task Id not found");
	}

	public static void viewAllPending(Map<Integer, Task> TaskMap) {
		System.out.println("All PENDING Tasks");
		TaskMap.values().stream()
		.filter(m -> m.getStatus() == PENDING)
		.forEach(m -> System.out.println(m));
	}

	public static void viewTodayPending(Map<Integer, Task> TaskMap) {
		System.out.println("ALL PENDING Tasks for TODAY");
		TaskMap.values().stream()
		.filter(m -> m.getStatus() == PENDING)
		.filter(m -> m.getTaskDate().equals(LocalDate.now()))
		.forEach(m ->System.out.println(m));
	}

	public static void sortedByTaskDate(Map<Integer,Task> TaskMap) {
		System.out.println("ALL tasks SORTED by TASK DATE");
		Comparator<Task> comp =  (p1,p2) -> p1.getTaskDate().compareTo(p2.getTaskDate());
		TaskMap.values().stream()
		.sorted(comp)
		.forEach(m->System.out.println(m));
	}
	
	public static void storeData(Map<Integer,Task> TaskMap, String fileName) throws FileNotFoundException, IOException {
		try(PrintWriter pw = new PrintWriter(new FileWriter(fileName, true))) {
			for(Task t : TaskMap.values())
				pw.println(t);
		}
	}
	
	public static void readFromFile(String fileName) throws FileNotFoundException, IOException {
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			while(br.ready())
				System.out.println(br.readLine()); 
		}
	}

}
