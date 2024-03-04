package studytracker;

import java.util.List;
import java.util.ArrayList;

public class StudyTrackerController {
    private List<StudySubject> subjects;

    public StudyTrackerController() {
        this.subjects = new ArrayList<>();
    }

    public void addSubject(String name) {
        StudySubject subject = new StudySubject(name);
        subjects.add(subject);
        // Update view or model as necessary
    }

    public void addStudyHours(String name, double hours) {
        for (StudySubject subject : subjects) {
            if (subject.getName().equals(name)) {
                subject.addStudyHours(hours);
                break;
            }
        }
        // Update view or model as necessary
    }
}
