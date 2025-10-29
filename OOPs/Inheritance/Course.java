class Course {
    String courseName;
    int duration;
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    void showDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    OnlineCourse(String name, int duration, String platform, boolean isRecorded) {
        super(name, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    void showDetails() {
        super.showDetails();
        System.out.println("Platform: " + platform + ", Recorded: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee, discount;
    PaidOnlineCourse(String name, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(name, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    void showDetails() {
        super.showDetails();
        System.out.println("Fee: " + fee + ", Discount: " + discount + "%");
    }
}

public class CourseApp {
    public static void main(String[] args) {
        PaidOnlineCourse p = new PaidOnlineCourse("Java Programming", 8, "Udemy", true, 2000, 10);
        p.showDetails();
    }
}
