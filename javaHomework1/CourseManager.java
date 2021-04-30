public class CourseManager {
    public void addCourse(Course course){
        System.out.println(course.courseName + " eklendi");
    }

    public void getCourseDetails(Course course){
        System.out.println("Id: " + course.id + " Course name: " + course.courseName + " Category: " + course.categoryId);
    }
}
