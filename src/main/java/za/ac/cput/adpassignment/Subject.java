package za.ac.cput.adpassignment;
/**
 * Na'eem Mahoney - 218190751
 *
 */
public class Subject {
    private String subjectId, subjectName, subjectYear;

    //Getter and Setter for SubjectID
    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    //Getter and Setter for subjectName
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    //Getter and Setter for subjectYear
    public String getSubjectYear() {
        return subjectYear;
    }

    public void setSubjectYear(String subjectYear) {
        this.subjectYear = subjectYear;
    }

    //to String
    @Override
    public String toString() {
        return "Subject{" + "subjectId=" + subjectId + ", subjectName=" + subjectName + ", subjectYear=" + subjectYear + '}';
    }
}

