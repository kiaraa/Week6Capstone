package co.gc.Week6Capstone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.gc.Week6Capstone.dao.TaskListRepository;
import co.gc.Week6Capstone.entity.TaskList;

@Controller
public class ListController {

	@Autowired
	TaskListRepository listDao;
	
	@RequestMapping("show-list")
	public ModelAndView showList(@RequestParam("toShow") int id) {
		TaskList list = listDao.getOne(id);
		return new ModelAndView("show-list", "list", list);
	}
	
	
}
