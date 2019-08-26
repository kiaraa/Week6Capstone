package co.gc.Week6Capstone.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.gc.Week6Capstone.dao.UserRepository;
import co.gc.Week6Capstone.entity.Task;
import co.gc.Week6Capstone.entity.TaskList;
import co.gc.Week6Capstone.entity.User;

@Controller
public class HomeController {

	
	@Autowired
	UserRepository userDao;
	
	@RequestMapping("sign-up")
	public ModelAndView successSignUp(@RequestParam("email") String email, @RequestParam("password") String password) {
		ArrayList<Task> list = new ArrayList<>();
		User user = new User(email, password, (List) list);
		userDao.save(user);
		return new ModelAndView("list-page", "user", user);
	}
	
	@RequestMapping("sign-in")
	public ModelAndView successReturningUser(@RequestParam("old-email") String email, @RequestParam("old-password") String password){
		User user = userDao.findByEmail(email, password);
		return new ModelAndView("list-page", "user", user);
	}

}
