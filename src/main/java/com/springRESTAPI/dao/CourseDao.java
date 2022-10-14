package com.springRESTAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springRESTAPI.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
