package co.gc.Week6Capstone.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.gc.Week6Capstone.entity.TaskList;

public interface TaskListRepository extends JpaRepository<TaskList, Integer> {


}
