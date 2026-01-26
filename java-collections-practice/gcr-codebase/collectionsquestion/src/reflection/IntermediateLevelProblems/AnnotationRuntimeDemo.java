package reflection.IntermediateLevelProblems;


import java.lang.annotation.*;

public class AnnotationRuntimeDemo {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface Author {
        String name();
    }
    @Author(name = "Himesh")
    static class Project {
    }
    public static void main(String[] args) {

        Class<Project> cls = Project.class;

        if (cls.isAnnotationPresent(Author.class)) {
            Author author = cls.getAnnotation(Author.class);
            System.out.println("Author Name: " + author.name());
        } else {
            System.out.println("No Author annotation found.");
        }
    }
}