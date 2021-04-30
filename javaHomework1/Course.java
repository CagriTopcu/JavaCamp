public class Course {
    int id;
    int categoryId;
    String courseName;

    public Course(){

    }

    public Course(int id, String courseName, int categoryId){
        this.id = id;
        this.courseName = courseName;
        this.categoryId = categoryId;
    }
}
