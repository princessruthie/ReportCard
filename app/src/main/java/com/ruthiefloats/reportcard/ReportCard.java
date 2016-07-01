package com.ruthiefloats.reportcard;

import java.util.ArrayList;


/*
The ReportCard class contains a Grade class.  The Grade class
  contains Subject-Score pairs.  The ReportCard contains an ArrayList
  of these Grades.  Grades can be added, altered or removed.
 */
public class ReportCard {
    /*
    To localize Report Card toString, alter this String:
     */
    private static final String REPORT_CARD_STRING = "Report Card";

    /*
    an ArrayList to hold the grades
     */
    ArrayList<Grade> mGradeArrayList;

    /*
    the constructor takes in an ArrayList of grades and sets the
    instance variable.
     */
    public ReportCard(ArrayList<Grade> gradeArrayList) {
        mGradeArrayList = gradeArrayList;
    }

    @Override
    public String toString() {
        return REPORT_CARD_STRING + ": {" +
                mGradeArrayList +
                '}';
    }

    /*
    to add a grade to the report card, pass in a grade object
    */
    public void addGrade(Grade g) {
        mGradeArrayList.add(g);
    }

    /*
    to remove a grade, pass in the position in the ArrayList
    */

    public void removeGrade(int position) {
        mGradeArrayList.remove(position);
    }

    /*
    to find get the Grade at any
    */
    public Grade getGrade(int position) {
        return mGradeArrayList.get(position);
    }

    /*
    to change a grade at any position, pass in the position and
    the new Grade object.
    */
    public void changeGrade(int position, Grade g) {
        mGradeArrayList.set(position, g);
    }


    /*
    a Grade class to hold pairs of Subject-Score.  Ex/ History-82.5
    */
    public static class Grade {
        /*
        to localize grade report, change these two strings:
         */
        private static final String SUBJECT_STRING = "Subject";
        private static final String SCORE_STRING = "Score";

        private String mSubject;
        private double mScore;

        @Override
        public String toString() {
            return "{" +
                    SUBJECT_STRING+"='" + mSubject + '\'' +
                    ", "+ SCORE_STRING+"=" + mScore +
                    '}';
        }

        /*
        The Grade constructor takes in a string and double and sets the instance
        variables of subject and score.
        */
        public Grade(String subject, double score) {
            mSubject = subject;
            mScore = score;
        }


        /*
        the typical getters and setters for the mSubject and mScore variables
        */
        public String getSubject() {
            return mSubject;
        }

        public void setSubject(String subject) {
            mSubject = subject;
        }

        public double getScore() {
            return mScore;
        }

        public void setScore(double score) {
            mScore = score;
        }
    }
}
