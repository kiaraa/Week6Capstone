package co.gc.Week6Capstone.entity;

import java.util.ArrayList;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private String description;
	private String dueDate;
	private boolean completed;
	
	@ManyToOne
	@JoinColumn(name="listid_fk", insertable=true, updatable=true) //These false values are because this data should only 
	//be managed from the team table
	private TaskList taskList;

	public Task(Integer id, String name, String description, String dueDate, boolean completed, TaskList taskList) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
		this.completed = completed;
		this.taskList = taskList;
	}

	public Task(String name, String description, String dueDate, boolean completed, TaskList taskList) {
		super();
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
		this.completed = completed;
		this.taskList = taskList;
	}
	
	
	
	public Task(String name, String description, String dueDate) {
		super();
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
		this.completed = false;
	}

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public TaskList getList() {
		return taskList;
	}

	public void setList (TaskList list) {
		this.taskList = list;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", description=" + description + ", dueDate=" + dueDate + ", completed=" + completed
				+ ", list=" + taskList + "]";
	}
		
	
	
	
}
