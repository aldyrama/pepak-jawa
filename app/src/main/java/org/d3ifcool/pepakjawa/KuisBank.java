package org.d3ifcool.pepakjawa;

public class KuisBank {

    private String textQuestions [] = {
            "1. Apakah Torik ganteng ?",
            "2. siapa yang bukan teman kos toriq ?",
            "3. siapa klompok mobpro aldy yang cowok?",
            "4. tahun berapa torik lahir",
            "5. siapa orang paling ganteng di kls 40.04 ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"mungkin - bisa jadi", "sangat ganteng", "B aja", "Cukup ganteng"},
            {"Aldy", "Tiok", "Rozikin", "Dendy"},
            {"Ferdy", "Ucup", "Toriq", "Rozikin"},
            {"1999", "1998", "1995", "2000"},
            {"Toriq", "Aldy", "Rozikin", "Fersy"}
    };

    private String mCorrectAnswers[] =
            {"Cukup ganteng", "Tiok", "Rozikin", "1995", "Toriq"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
