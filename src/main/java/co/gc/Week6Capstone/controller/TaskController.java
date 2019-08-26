package co.gc.Week6Capstone.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.gc.Week6Capstone.dao.TaskListRepository;
import co.gc.Week6Capstone.dao.TaskRepository;
import co.gc.Week6Capstone.dao.UserRepository;
import co.gc.Week6Capstone.entity.Task;
import co.gc.Week6Capstone.entity.TaskList;
import co.gc.Week6Capstone.entity.User;

@Controller
public class TaskController {

	@Autowired
	TaskRepository taskDao;
	
	@Autowired
	TaskListRepository listDao;
	
	@RequestMapping("deleteTask")
	public ModelAndView deleteTask(@RequestParam("taskid") Integer id) {
		Task task = taskDao.getOne(id);
		int listId = task.getList().getId();
		taskDao.delete(task);
		return new ModelAndView("redirect:show-list", "toShow", listId);
	}
	
	@RequestMapping("add-task")
	public ModelAndView addTask(Task task, @RequestParam("taskListId") int listId) {
		Optional<TaskList> list = listDao.findById(listId);
		if (list.isPresent()) {
			TaskList realList = list.get();
			task.setList(realList);
		}
		taskDao.save(task);
		return new ModelAndView("redirect:show-list", "toShow", listId);
	}
	
	@RequestMapping("completeTask")
	public ModelAndView completeTask(@RequestParam("taskid") Integer id) {
		Task task = taskDao.getOne(id);
		int listId = task.getList().getId();
		task.setCompleted(true);
		taskDao.save(task);
		return new ModelAndView("redirect:show-list", "toShow", listId);
	}
	
	@RequestMapping("goToUpdateTask")
	public ModelAndView goToUpdateTask(@RequestParam("task-id") Integer id) {
		return new ModelAndView("update-page", "task-id", id);
	}
	
	@RequestMapping("update-task")
	public ModelAndView UpdateTask(Task task, @RequestParam("taskid") int id) {
		taskDao.delete(taskDao.getOne(id));
		task.setId(id);
		taskDao.save(task);
		int listId = task.getList().getId();
		return new ModelAndView("redirect:show-list", "toShow", listId);
	}
}
