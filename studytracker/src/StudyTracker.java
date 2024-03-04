package studytracker;

public class StudyTracker {
    public static void main(String[] args) {
        STModel model = new STModel();
        STView view = new STView();
        STController controller = new STController(model, view);
    }
}
