package co.gc.Week6Capstone.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	
	String email;
	String password;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL, orphanRemoval=true)
	List<TaskList> taskLists = new ArrayList<>();

	public User(Integer id, String email, String password, List<TaskList> taskLists) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.taskLists = taskLists;
	}

	public User(String email, String password, List<TaskList> taskLists) {
		super();
		this.email = email;
		this.password = password;
		this.taskLists = taskLists;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<TaskList> getTaskLists() {
		return taskLists;
	}

	public void setTaskLists(List<TaskList> taskLists) {
		this.taskLists = taskLists;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", taskLists=" + taskLists + "]";
	}
	
	
}
