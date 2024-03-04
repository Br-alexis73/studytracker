package studytracker;
public class StudyTracker {
    public static void main(String[] args) {
        System.out.println("Welcome bro");
        javax.swing.SwingUtilities.invokeLater(
                new Runnable() {
                    public void run () {createAndShowGUI();}
                }
        );
    }

    public static void createAndShowGUI() {
        STModel model = new STModel();
        STController controller = new STController(model);
        STView view = new STView(model, controller);

    }

}
