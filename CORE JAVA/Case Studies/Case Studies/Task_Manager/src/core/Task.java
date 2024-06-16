package core;

import java.time.LocalDate;

public class Task {
	private static int auto;
	private int taskId;
	private String taskName;
	private String taskDesc;
	private LocalDate taskDate;
	private Status status;
	private boolean active;
	
	public Task(String taskName, String taskDesc, LocalDate taskDate, Status status, boolean active) {
		super();
		this.taskId = ++auto;
		this.taskName = taskName;
		this.taskDesc = taskDesc;
		this.taskDate = taskDate;
		this.status = status;
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "Id:" + taskId + ", Name:" + taskName + ", Description:" + taskDesc + ", Date:" + taskDate
				+ ", Status:" + status + ", Is_Active: " + active;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
