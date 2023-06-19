package src.ProtoTypeRegistry;

public class Student {
    String name;
    String email;
    long phoneNo;
    String batchName;
    String InstructorName;
    String CurrentModule;
    String MonthofEnrollment;

    public  Student(){

    }
//    public Student(String name, String email, long phoneNo, String batchName, String instructorName, String currentModule, String monthofEnrollment) {
//        this.name = name;
//        this.email = email;
//        this.phoneNo = phoneNo;
//        this.batchName = batchName;
//        this.InstructorName = instructorName;
//        this.CurrentModule = currentModule;
//        this.MonthofEnrollment = monthofEnrollment;
//    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo=" + phoneNo +
                ", batchName='" + batchName + '\'' +
                ", InstructorName='" + InstructorName + '\'' +
                ", CurrentModule='" + CurrentModule + '\'' +
                ", MonthofEnrollment='" + MonthofEnrollment + '\'' +
                '}';
    }

    public Student copy(){
        Student s=new Student();
        s.batchName=this.batchName;
        s.CurrentModule=this.CurrentModule;
        s.InstructorName=this.InstructorName;
        s.MonthofEnrollment=this.MonthofEnrollment;

        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getInstructorName() {
        return InstructorName;
    }

    public void setInstructorName(String instructorName) {
        InstructorName = instructorName;
    }

    public String getCurrentModule() {
        return CurrentModule;
    }

    public void setCurrentModule(String currentModule) {
        CurrentModule = currentModule;
    }

    public String getMonthofEnrollment() {
        return MonthofEnrollment;
    }

    public void setMonthofEnrollment(String monthofEnrollment) {
        MonthofEnrollment = monthofEnrollment;
    }
}
