package com.springRESTAPI.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRESTAPI.dao.CourseDao;
import com.springRESTAPI.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;

	//List<Course> list;
	
	public CourseServiceImpl()
	{
		/*
		 * list=new ArrayList<>(); list.add(new
		 * Course(200,"Java Spring Boot Course","This is master course by Bisoyi"));
		 * list.add(new Course(201,"Python Course","This is by python Developer"));
		 */
		
		
		
		
	}


	@Override
	public List<Course> getCourses() {

		return courseDao.findAll();
		
	}


	@Override
	public Course getCourse(long courseId) {
		
		/*
		 * Course c=null; for(Course course:list) { if(course.getId()==courseId) {
		 * c=course; break; } }
		 */

		
		return courseDao.getOne(courseId);
	}


	@Override
	public Course addCourse(Course course) {
		
		//list.add(course);
		courseDao.save(course);
		return course;
	}


	@Override
	public Course updateCourse(Course course) {
		
		/*
		 * list.forEach(e ->{ if(e.getId()==course.getId()) {
		 * 
		 * e.setTitle(course.getTitle()); e.setDescription(course.getDescription()); }
		 * });
		 */
		
		courseDao.save(course);
		
		return course;
	}
	
	public void deleteCourse(long courseId)
	{
		
		//list=this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
		
		Course entity=courseDao.getOne(courseId);
		courseDao.delete(entity);
		
	}

}
