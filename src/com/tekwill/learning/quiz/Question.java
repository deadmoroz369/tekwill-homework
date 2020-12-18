package com.learning.tekwill.quiz;


import java.util.Scanner;

public class Question {

    public static final String TOPIC_1 = "Biology Quiz";
//    public static final String TOPIC_2 = "Physics Quiz";
//    public static final String TOPIC_3 = "Literature Quiz";

    public static final String LEVEL_1_QUESTION_1_TOPIC_1 = "What does ventral mean?"; // Biology Quiz
//    public static final String LEVEL_1_QUESTION_2_TOPIC_1 = "What distinguishes high blood pressure from conditions such as arteriosclerosis and atherosclerosis?";
//    public static final String LEVEL_1_QUESTION_3_TOPIC_1 = "What percent of the population of the United States is obese?";

//    public static final String LEVEL_2_QUESTION_1_TOPIC_1 = "What is angioplasty?";
//    public static final String LEVEL_2_QUESTION_2_TOPIC_1 = "What is appendectomy?";
//    public static final String LEVEL_2_QUESTION_3_TOPIC_1 = "What is cholecystectomy?";
//
//    public static final String LEVEL_3_QUESTION_1_TOPIC_1 = "What is Bell's Palsy?";
//    public static final String LEVEL_3_QUESTION_2_TOPIC_1 = "What is a complex partial seizure?";
//    public static final String LEVEL_3_QUESTION_3_TOPIC_1 = "What is an axon?";

    public static final String LEVEL_1_Q1_ANSWER_1_TOPIC_1 = "Spinal";
    public static final String LEVEL_1_Q1_ANSWER_2_TOPIC_1 = "Cerebral";
    public static final String LEVEL_1_Q1_ANSWER_3_TOPIC_1 = "Cranial";
    public static final String LEVEL_1_Q1_CORRECT_ANSWER_TOPIC_1 = "Abdominal";
    public static final String LEVEL_1_Q1_SHORT_ANSWER_A_TOPIC_1 = "a";
    public static final String LEVEL_1_Q1_SHORT_ANSWER_B_TOPIC_1 = "b";
    public static final String LEVEL_1_Q1_SHORT_ANSWER_C_TOPIC_1 = "c";
    public static final String LEVEL_1_Q1_SHORT_ANSWER_D_TOPIC_1 = "d";

//
//    public static final String LEVEL_1_Q2_ANSWER_1_TOPIC_1 = "High blood pressure symptom is hypothermia";
//    public static final String LEVEL_1_Q2_ANSWER_2_TOPIC_1 = "High blood pressure symptom is shortness of breath";
//    public static final String LEVEL_1_Q2_ANSWER_3_TOPIC_1 = "High blood pressure symptom is fever";
//    public static final String LEVEL_1_Q2_CORRECT_ANSWER_TOPIC_1 = "High blood pressure has no symptoms";
//
//    public static final String LEVEL_1_Q3_ANSWER_1_TOPIC_1 = "50%";
//    public static final String LEVEL_1_Q3_ANSWER_2_TOPIC_1 = "99%";
//    public static final String LEVEL_1_Q3_ANSWER_3_TOPIC_1 = "15%";
//    public static final String LEVEL_3_Q3_CORRECT_ANSWER_TOPIC_1 = "33%";

    public static void main(String[] args) {
        System.out.println("Let's do a " + TOPIC_1 + "\nPress Enter to Continue!");
        Scanner scanner = new Scanner(System.in);
        String enterFromKeyboard = scanner.nextLine();
        System.out.println("Question #1:\n" + LEVEL_1_QUESTION_1_TOPIC_1);
        System.out.println("a)" + LEVEL_1_Q1_ANSWER_1_TOPIC_1 + "\n" + "b)" + LEVEL_1_Q1_ANSWER_2_TOPIC_1 + "\n" + "c)" + LEVEL_1_Q1_ANSWER_3_TOPIC_1 + "\n" + "d)" + LEVEL_1_Q1_CORRECT_ANSWER_TOPIC_1);
        String stringYourAnswer = scanner.nextLine();
        if (stringYourAnswer.equals(LEVEL_1_Q1_SHORT_ANSWER_D_TOPIC_1)) {
            System.out.println("Correct!");


        } else {
            System.out.println("Incorrect! The correct answer was:\t" + LEVEL_1_Q1_CORRECT_ANSWER_TOPIC_1);
        }

    }

//    public static final String LEVEL_1_QUESTION_1_TOPIC_2 = ""; // Physics Quiz
//    public static final String LEVEL_1_QUESTION_2_TOPIC_2 = "";
//    public static final String LEVEL_1_QUESTION_3_TOPIC_2 = "";
//
//    public static final String LEVEL_2_QUESTION_1_TOPIC_2 = "";
//    public static final String LEVEL_2_QUESTION_2_TOPIC_2 = "";
//    public static final String LEVEL_2_QUESTION_3_TOPIC_2 = "";
//
//    public static final String LEVEL_3_QUESTION_1_TOPIC_2 = "";
//    public static final String LEVEL_3_QUESTION_2_TOPIC_2 = "";
//    public static final String LEVEL_3_QUESTION_3_TOPIC_2 = "";
//
//    public static final String LEVEL_1_ANSWER_1_TOPIC_2 = "";
//    public static final String LEVEL_1_ANSWER_2_TOPIC_2 = "";
//    public static final String LEVEL_1_ANSWER_3_TOPIC_2 = "";
//    public static final String LEVEL_1_CORRECT_ANSWER_TOPIC_2 = "";
//
//    public static final String LEVEL_2_ANSWER_1_TOPIC_2 = "";
//    public static final String LEVEL_2_ANSWER_2_TOPIC_2 = "";
//    public static final String LEVEL_2_ANSWER_3_TOPIC_2 = "";
//    public static final String LEVEL_2_CORRECT_ANSWER_TOPIC_2 = "";
//
//    public static final String LEVEL_3_ANSWER_1_TOPIC_2 = "";
//    public static final String LEVEL_3_ANSWER_2_TOPIC_2 = "";
//    public static final String LEVEL_3_ANSWER_3_TOPIC_2 = "";
//    public static final String LEVEL_3_CORRECT_ANSWER_TOPIC_2 = "";
//
//
//    public static final String LEVEL_1_QUESTION_1_TOPIC_3 = ""; // Literature Quiz
//    public static final String LEVEL_1_QUESTION_2_TOPIC_3 = "";
//    public static final String LEVEL_1_QUESTION_3_TOPIC_3 = "";
//
//    public static final String LEVEL_2_QUESTION_1_TOPIC_3 = "";
//    public static final String LEVEL_2_QUESTION_2_TOPIC_3 = "";
//    public static final String LEVEL_2_QUESTION_3_TOPIC_3 = "";
//
//    public static final String LEVEL_3_QUESTION_1_TOPIC_3 = "";
//    public static final String LEVEL_3_QUESTION_2_TOPIC_3 = "";
//    public static final String LEVEL_3_QUESTION_3_TOPIC_3 = "";
//
//    public static final String LEVEL_1_ANSWER_1_TOPIC_3 = "";
//    public static final String LEVEL_1_ANSWER_2_TOPIC_3 = "";
//    public static final String LEVEL_1_ANSWER_3_TOPIC_3 = "";
//
//    public static final String LEVEL_2_ANSWER_1_TOPIC_3 = "";
//    public static final String LEVEL_2_ANSWER_2_TOPIC_3 = "";
//    public static final String LEVEL_2_ANSWER_3_TOPIC_3 = "";
//
//    public static final String LEVEL_3_ANSWER_1_TOPIC_3 = "";
//    public static final String LEVEL_3_ANSWER_2_TOPIC_3 = "";
//    public static final String LEVEL_3_ANSWER_3_TOPIC_3 = "";
//

}

