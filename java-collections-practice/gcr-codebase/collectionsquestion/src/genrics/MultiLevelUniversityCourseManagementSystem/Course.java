package genrics.MultiLevelUniversityCourseManagementSystem;

public class Course<T extends CourseType> {

    private T courseType;
    private String department;

    public Course(T courseType, String department) {
        this.courseType = courseType;
        this.department = department;
    }

    public T getCourseType() {
        return courseType;
    }

    public String getDepartment() {
        return department;
    }
}