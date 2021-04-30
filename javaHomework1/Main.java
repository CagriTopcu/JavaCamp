public class Main {

    public static void main(String[] args) {
        Category category1 = new Category(1, "Category 1");
        Course course1 = new Course(1, "Course 1", 1);
        Course course2 = new Course(2,"Course 2", 1);

        Course[] courses = { course1, course2 };
        Category[] categories = { category1 };

        for(Category category : categories){
            System.out.println("Id: " + category.id);
            System.out.println("Category name: " + category.categoryName);
        }

        for(Course course : courses){
            System.out.println("Id: " + course.id);
            System.out.println("Course name: " + course.courseName);
            System.out.println("Category: " + course.categoryId);
        }

        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course1);
        courseManager.getCourseDetails(course2);
    }
}
