package com.example.android.yourprogressreport;

/**
 * Created by ravi on 6/17/2017.
 */

public class ReportCard {

    //declaring the students info and mark of those specific subjects
    private String mStudentName;

    private int mRollNumber;

    private int mMathsMark;

    private int mPhysicsMark;

    private int mChemistryMark;

    private int mComputerMark;

    private int mLanguageMarks;

    private int sum;

    private double percentage;

    public ReportCard(String studentName, int rollNumber, int mathsMark, int physicsMark, int chemistryMark, int computerMark, int languageMarks) {
        this.mStudentName = studentName;
        this.mRollNumber = rollNumber;
        this.mMathsMark = mathsMark;
        this.mPhysicsMark = physicsMark;
        this.mChemistryMark = chemistryMark;
        this.mComputerMark = computerMark;
        this.mLanguageMarks = languageMarks;
    }

    /**
     * setter method is used to set the name
     *
     * @param studentName
     */
    public void setStudentName(String studentName) {
        this.mStudentName = studentName;
    }

    /**
     * getter method is used to retrieve the name
     *
     * @return
     */
    public String getStudentName() {
        return mStudentName;
    }

    /**
     * setter method is used to set the rollnumber
     *
     * @param rollNumber
     */
    public void setRollNumber(int rollNumber) {
        this.mRollNumber = rollNumber;
    }

    /**
     * getter method is used to retrieve the rollnumber
     *
     * @return
     */
    public int getRollNumber() {
        return mRollNumber;
    }

    /**
     * setter method is used to set the mathsmark
     *
     * @param mathsMark
     */
    public void setMathsMark(int mathsMark) {
        this.mMathsMark = mathsMark;
    }

    /**
     * getter method is used to retrieve the mathsmark
     *
     * @return
     */
    public int getMathsMark() {
        return mMathsMark;
    }

    /**
     * setter method is used to set the physicsmark
     *
     * @param physicsMark
     */
    public void setPhysicsMark(int physicsMark) {
        this.mPhysicsMark = physicsMark;
    }

    /**
     * getter method is used to retrieve the physicsmark
     *
     * @return
     */
    public int getPhysicsMark() {
        return mPhysicsMark;
    }

    /**
     * setter method is used to set the chemistrymark
     *
     * @param chemistryMark
     */
    public void setChemistryMark(int chemistryMark) {
        this.mChemistryMark = chemistryMark;
    }

    /**
     * getter method is used to retrieve the chemistrymark
     *
     * @return
     */
    public int getChemistryMark() {
        return mChemistryMark;
    }

    /**
     * setter method is used to set the computermark
     *
     * @param computerMark
     */
    public void setComputerMark(int computerMark) {
        this.mComputerMark = computerMark;
    }

    /**
     * getter method is used to retrieve the computermark
     *
     * @return
     */
    public int getComputerMark() {
        return mComputerMark;
    }

    /**
     * setter method is used to set the language marks
     *
     * @param languageMarks
     */
    public void setLanguageMarks(int languageMarks) {
        this.mLanguageMarks = languageMarks;
    }

    /**
     * getter method is used to retrieve the languagemarks
     *
     * @return
     */
    public int getLanguageMarks() {
        return mLanguageMarks;
    }

    //grade can be calculated by students mark by adding their sum and dividing to obtain percentage
    //by using percentage spec grade can be calculated
    private String getGrade(int mMathsMark, int mPhysicsMark, int mChemistryMark, int mComputerMark, int mLanguageMarks) {
        String yourRank;
        sum = mMathsMark + mPhysicsMark + mChemistryMark + mComputerMark + mLanguageMarks;
        percentage = sum / 10;

        if (percentage >= 90) {
            yourRank = "GOOD";
        } else if (percentage < 90 && percentage >= 80) {
            yourRank = "SUPERB";
        } else if (percentage < 80 && percentage >= 60) {
            yourRank = "ROCKS";
        } else if (percentage < 60 && percentage >= 40) {
            yourRank = "BETTER";
        } else {
            yourRank = "fail";
        }
        return yourRank;
    }

    //to string method() is called to retrieve the student info and marks
    @Override
    public String toString() {
        return "StudentName: " + getStudentName() +
                "\n RollNumber: " + getRollNumber() +
                "\n mathsmarks: " + getMathsMark() +
                "\n physicsmarks:" + getPhysicsMark() +
                "\n computermarks:" + getComputerMark() +
                "\n chemistrymarks:" + getChemistryMark() +
                "\n languagemarks:" + getLanguageMarks() +
                "\n Grade:" + getGrade(mMathsMark, mPhysicsMark, mChemistryMark, mComputerMark, mLanguageMarks);
    }
}