package co.gc.Week6Capstone.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.gc.Week6Capstone.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
