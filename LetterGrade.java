public class LetterGrade {


    public LetterGrade() { }
 
 
    public String gradeV1(int score) {
        String grade = "";
        if (score >= 90) {
            grade = "A";
        }
        else if (score >= 80) {
            grade = "B";
        }
        else if (score >= 70) {
            grade = "C";
        }
        else if (score >= 60) {
            grade = "D";
        }
        else if (score < 60) {
            grade = "F";
        }
        return grade;
    }
 
 
    public String gradeV2(int score) {
        String grade = "";
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else if (score < 60) {
            grade = "F";
        }
        return grade;

        }
         

        public String gradeV3(int score) {
             if (score >= 90) {
                return "A";
            }
            else if (score >= 80) {
                return "B";
            }
            else if (score >= 70) {
                return "C";
            }
            else if (score >= 60) {
                return "D";
            }
            else {
                return "F";
            }
        }
        
            public String gradeV4(int score) {
                if (score >= 90) {
                    return "A";
                } else if (score >= 80) {
                    return "B";
                } else if (score >= 70) {
                    return "C";
                } else if (score >= 60) {
                    return "D";
                } else {
                    return "F";
                }
             }
    }
