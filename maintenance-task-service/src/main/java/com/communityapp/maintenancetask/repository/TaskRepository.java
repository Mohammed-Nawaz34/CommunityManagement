package com.communityapp.maintenancetask.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.communityapp.maintenancetask.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
		
	
	List<Task> findByStatus(String status);
}
