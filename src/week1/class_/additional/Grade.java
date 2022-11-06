package week1.class_.additional;

public class Grade {
    private int mathScore;
    private int scienceScore;
    private int englishScore;

    public Grade(int mathScore, int scienceScore, int englishScore) {
        this.mathScore = mathScore;
        this.scienceScore = scienceScore;
        this.englishScore = englishScore;
    }

    public  int scoreAverage(){
        return (mathScore+scienceScore+englishScore)/3;
    }
}
