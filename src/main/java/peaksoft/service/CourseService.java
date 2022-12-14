package peaksoft.service;

import peaksoft.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course>getAllCourse();
    void addCourse(Course course,Long companyId);
    Course getCourseById(Long id);
    void updateCourse(Course course);
    void deleteCourse(Course course);
}
