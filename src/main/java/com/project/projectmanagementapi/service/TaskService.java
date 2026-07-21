package com.project.projectmanagementapi.service;

import com.project.projectmanagementapi.domain.TaskDomain;
import java.util.List;
import java.util.Optional;

public interface TaskService {
    TaskDomain createTask(Integer projectId, TaskDomain taskDomain);
    Optional<TaskDomain> findTaskById(Integer id);
    List<TaskDomain> findTasksByProjectId(Integer projectId);
    TaskDomain updateTaskStatus(Integer id, String status);
}