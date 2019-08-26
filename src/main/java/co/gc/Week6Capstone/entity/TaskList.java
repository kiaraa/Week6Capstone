package co.gc.Week6Capstone.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class TaskList {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	String listName;
	
	@OneToMany(mappedBy="taskList", cascade=CascadeType.ALL, orphanRemoval=true)
	List<Task> tasks = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="userId_fk", insertable=false, updatable=false) //These false values are because this data should only 
	//be managed from the team table
	private User user;

	public TaskList(Integer id, String listName, List<Task> tasks) {
		super();
		this.id = id;
		this.listName = listName;
		this.tasks = tasks;
	}

	public TaskList(String listName, List<Task> tasks) {
		super();
		this.listName = listName;
		this.tasks = tasks;
	}

	public TaskList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	@Override
	public String toString() {
		return "TaskList [id=" + id + ", listName=" + listName + ", tasks=" + tasks + "]";
	}
	
	
}
