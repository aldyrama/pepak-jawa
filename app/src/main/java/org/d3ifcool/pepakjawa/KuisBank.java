package org.d3ifcool.pepakjawa;

public class KuisBank {

    private String textQuestions [] = {
            "1. Dalam bahasa Jawa sebutan anak kerbau adalah ...",
            "2. Dalam bahasa Jawa sebutan anak anjing adalah ...",
            "3. Apa nama senjata kerbau dalam bahasa Jawa?",
            "4. Apa nama senjata lebah dalam bahasa Jawa?",
            "5. Apa arti piwulang dalam bahasa Indonesia?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Kirik", "Gudel", "Piyik", "Gembluk"},
            {"Piyik", "Tiok", "Kirik", "Gembluk"},
            {"Sungu", "Entup", "Patil", "Piyik"},
            {"Entup", "Gudel", "Piyik", "Patil"},
            {"Tempat", "Pelajaran", "Tulisan", "Rumahnya"}
    };

    private String mCorrectAnswers[] =
            {"Gudel", "Kirik", "Sungu", "Entup", "Pelajaran"};

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
