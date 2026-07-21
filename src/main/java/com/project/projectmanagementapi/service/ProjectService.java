package com.project.projectmanagementapi.service;

import com.project.projectmanagementapi.domain.ProjectDomain;
import java.util.List;
import java.util.Optional;

public interface ProjectService {
    ProjectDomain createProject(ProjectDomain projectDomain);
    Optional<ProjectDomain> findProjectById(Integer id);
    List<ProjectDomain> findAllProjects();
}