import java.util.List;

public abstract class StudentCourse {
    public abstract string GetCourseDetails(int studentId) {
        return "Base course";
    }

    public abstract string GetProjectDetails(int studentId) {
        return "Base project";
    }
}

public class DataScienceStudent extends StudentCourse {
    public @Override string GetCourseDetails(int studentId) {
        return "Data science course details";
    }

    public @Override string GetProjectDetails(int studentId) {
        return "Data science project details";
    }
}

public class DataStructureStudent extends StudentCourse {
    public @Override string GetCourseDetails(int studentId) {
        return "Data structure course details";
    }

    public @Override string GetProjectDetails(int studentId) {
        return "Data structure project details";
    }
}

public class Liskov {
    public static void main(String[] args) {
        List studentList = new List();
        studentList.add(new DataScienceStudent(100));
        studentList.add(new DataStructureStudent(101));

        for (StudentCourse student : studentList) {
            System.out.println(student.GetProjectDetails());
        }
    }
}
