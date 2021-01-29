public class Student extends Teacher {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);


        public class Student extends Person {

            String year;
            String startingDay;
            String programm;

            public String getYear() {
                return year;
            }

            public String getStartingDay() {
                return startingDay;
            }

            public String getProgramm() {
                return programm;
            }

            public void setYear(String year) {
                this.year = year;
            }

            public void setStartingDay(String startingDay) {
                this.startingDay = startingDay;
            }

            public void setProgramm(String programm) {
                this.programm = programm;
            }

            //behavior: registerForLecture,getGrade


            @Override
            public void attendUniversity() {
                System.out.println("Student attends university, name: " + name);
            }
        }