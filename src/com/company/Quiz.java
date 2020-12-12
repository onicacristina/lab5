package com.company;

public enum Quiz {

    QUESTION_1("Warm colors are usually associated with what kind of emotion?",
            "Peace","Passiveness","Laziness","Aggression",
            false,false,false,true),

    QUESTION_2("What colors are warm?","Red","Orange", "Yellow","Pink",
            true,true,true,true),

    QUESTION_3("What are primary colors?",
            "Red","Purple","Blue","Yellow",
            true,false,true,true),

    QUESTION_4("What is complementary to green?",
            "Red","Blue","Periwinkle","Red California Sunset shade #55",
            true,false,false,false),

    QUESTION_5("Which colors are secondary(colors)?",
            "Orange","Purple","Green","White",
            true,true,true,false);


    private final String question;
    private final String answer_1;
    private final String answer_2;
    private final String answer_3;
    private final String answer_4;
    private final boolean isCorrectAnswer_1;
    private final boolean isCorrectAnswer_2;
    private final boolean isCorrectAnswer_3;
    private final boolean isCorrectAnswer_4;

    Quiz(String question, String answer_1, String answer_2, String answer_3, String answer_4,
         boolean isCorrectAnswer_1, boolean isCorrectAnswer_2, boolean isCorrectAnswer_3, boolean isCorrectAnswer_4)
    {
        this.question = question;
        this.answer_1 = answer_1;
        this.answer_2 = answer_2;
        this.answer_3 = answer_3;
        this.answer_4 = answer_4;
        this.isCorrectAnswer_1 = isCorrectAnswer_1;
        this.isCorrectAnswer_2 = isCorrectAnswer_2;
        this.isCorrectAnswer_3 = isCorrectAnswer_3;
        this.isCorrectAnswer_4 = isCorrectAnswer_4;
    }


    public String getQuestion() {
        return question;
    }

    public String getAnswer_1() {
        return answer_1;
    }

    public String getAnswer_2() {
        return answer_2;
    }

    public String getAnswer_3() {
        return answer_3;
    }

    public String getAnswer_4() {
        return answer_4;
    }

    public boolean isCorrectAnswer_1() {
        return isCorrectAnswer_1;
    }

    public boolean isCorrectAnswer_2() {
        return isCorrectAnswer_2;
    }

    public boolean isCorrectAnswer_3() {
        return isCorrectAnswer_3;
    }

    public boolean isCorrectAnswer_4() {
        return isCorrectAnswer_4;
    }
}
