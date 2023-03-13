import java.text.DecimalFormat;

import student.Student;

class StudentTest{
    public static void main(String[] args){

        DecimalFormat f = new DecimalFormat("##.##");

        Student s1 = new Student();
        s1.setName("Rashmi");
        s1.setCourse("CSE");
        s1.setRollno(1);
        float[] m1 = {92,85,90};
        s1.setMarks(m1);
        System.out.println(s1+": ");
        System.out.println("Total marks= "+s1.calculateTotal());
        System.out.println("Average marks= "+f.format(s1.calculateAverage()));
        System.out.println("The grade accumulates to= "+s1.calculateGrade()+"\n");


        Student s2 = new Student();
        s2.setName("Roshan");
        s2.setCourse("IT");
        s2.setRollno(2);
        float[] m2 = {70,65,80};
        s2.setMarks(m2);
        System.out.println(s2+": ");
        System.out.println("Total Marks= "+s2.calculateTotal());
        System.out.println("Average marks= "+f.format(s2.calculateAverage()));
        System.out.println("The grade accumulates to= "+s2.calculateGrade()+"\n");

        Student s3 = new Student();
        s3.setName("Sonia");
        s3.setCourse("EEE");
        s3.setRollno(3);
        float[] m3 = {77,79,85};
        s3.setMarks(m3);
        System.out.println(s3+": ");
        System.out.println("Total marks= "+s3.calculateTotal());
        System.out.println("Average marks= "+f.format(s3.calculateAverage()));
        System.out.println("The grade accumulates to= "+s3.calculateGrade()+"\n");

        Student s4 = new Student();
        s4.setName("Tanya");
        s4.setCourse("ETC");
        s4.setRollno(4);
        float[] m4 = {78,63,80};
        s4.setMarks(m4);
        System.out.println(s4+": ");
        System.out.println("Total marks= "+s4.calculateTotal());
        System.out.println("Average marks= "+f.format(s4.calculateAverage()));
        System.out.println("The grade accumulates to= "+s4.calculateGrade()+"\n");

        Student s5 = new Student();
        s5.setName("Yasmine");
        s5.setCourse("Mtech");
        s5.setRollno(5);
        float[] m5 = {81,89,90};
        s5.setMarks(m5);
        System.out.println(s5+": ");
        System.out.println("Total marks= "+s5.calculateTotal());
        System.out.println("Average marks= "+f.format(s5.calculateAverage()));
        System.out.println("The grade accumulates to= "+s5.calculateGrade());

    }
    
}