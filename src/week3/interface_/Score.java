package week3.interface_;

public class Score {
    private int studentNumber;
    private Subject subject;
    private int score;

    public Score(int studentNumber, Subject subject, int score) {
        this.studentNumber = studentNumber;
        this.subject = subject;
        this.score = score;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "studentNumber=" + studentNumber +
                ", subject=" + subject +
                ", score=" + score +
                '}';
    }
}
