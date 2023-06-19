package src.ProtoTypeRegistry;

public class Client {



    public static void main(String[] args) {

        Student may22ProtoType= new Student();
        may22ProtoType.setBatchName("May22Beginner");
        may22ProtoType.setCurrentModule("LLD-2");
        may22ProtoType.setInstructorName("Sandeep");
        may22ProtoType.setMonthofEnrollment("May2022");


        Student jan23ProtoType=new Student();
        jan23ProtoType.setMonthofEnrollment("January2023");
        jan23ProtoType.setInstructorName("Deepak");
        jan23ProtoType.setCurrentModule("AdvanceDSA-4");
        jan23ProtoType.setBatchName("Jan23Intermediate");

        StudentRegistry studentRegistry=new StudentRegistry();

        studentRegistry.Register("May22",may22ProtoType);
        studentRegistry.Register("Jan23",jan23ProtoType);

        //coping prototype
        Student may22Sudent=studentRegistry.getStudentProtoType("May22").copy();
        may22Sudent.setName("Manoj");
        may22Sudent.setEmail("xyz@gmail.com");
        may22Sudent.setPhoneNo(123456789);

        Student jan23Student=studentRegistry.getStudentProtoType("Jan23").copy();
        jan23Student.setName("Vasu");
        jan23Student.setEmail("zyx@gmail.com");
        jan23Student.setPhoneNo(987654321);

        System.out.println(may22Sudent.toString());
        System.out.println(jan23Student.toString());


    }





}
