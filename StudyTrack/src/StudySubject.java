public class StudySubject {
    private String name;
    private double studyHours;

    public StudySubject(String name) {
        this.name = name;
        this.studyHours = 0; // Initialize with 0 study hours
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStudyHours() {
        return studyHours;
    }

    public void addStudyHours(double hours) {
        this.studyHours += hours;
    }
}
