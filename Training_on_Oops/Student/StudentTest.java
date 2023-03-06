package Student;

class Student{
    private int rollno;
    private String name, course;
    private double[] marks;

    public void setName(String n){
        name = n;
    }

    public void setCourse(String cr){
        course = cr;
    }

    public void setRollno(int rn){
        rollno = rn;
    }

    public void setMarks(double[] m){
        marks = m;
    }

    public String getName(){
        return name;
    }

    public String getCourse(){
        return course;
    }

    public int getRollno(){
        return rollno;
    }

    public double[] getMarks(){
        return marks;
    }

    public double calculateTotal(){
        double total = marks[0]+marks[1]+marks[2];
        return total;
    }

    public double calculateAverage(){
        double avg = (marks[0]+marks[1]+marks[2])/3;
        return avg;
    }
    public String calculateGrade(){
        double per = ((marks[0]+marks[1]+marks[2])/300)*100;
        if(per>=91){
            return "A+";
        }
        else if(per>=81){
            return "A";
        }
        else if(per>=71){
            return "B+";
        }
        else if (per>=61){
            return "B";
        }
        else if(per>=51){
            return "C+";
        }
        else if(per>=41){
            return "C";
        }
        else{
            return "Failed";
        }
    }

}

public class StudentTest{
    public static void main(String[] args){
        

        Student s1 = new Student();
        s1.setName("Rashmi");
        s1.setCourse("CSE");
        s1.setRollno(1);
        double[] m1 = {92,85,90};
        s1.setMarks(m1);
        System.out.println("The total of marks= "+s1.getName()+" rollno= "+s1.getRollno()+" is= "+s1.calculateTotal());
        System.out.println("The average of marks= "+s1.getName()+" rollno= "+s1.getRollno()+" is= "+s1.calculateAverage());
        System.out.println("The grade accumulates to= "+s1.getName()+" rollno= "+s1.getRollno()+" is= "+s1.calculateGrade());


        Student s2 = new Student();
        s2.setName("Roshan");
        s2.setCourse("IT");
        s2.setRollno(2);
        double[] m2 = {70,65,80};
        s1.setMarks(m2);
        System.out.println("The total of marks= "+s2.getName()+" rollno= "+s2.getRollno()+" is= "+s2.calculateTotal());
        System.out.println("The average of marks= "+s2.getName()+" rollno= "+s2.getRollno()+" is= "+s2.calculateAverage());
        System.out.println("The grade accumulates to= "+s2.getName()+" rollno= "+s2.getRollno()+" is= "+s2.calculateGrade());

        Student s3 = new Student();
        s1.setName("Sonia");
        s1.setCourse("EEE");
        s1.setRollno(3);
        double[] m3 = {77,79,85};
        s1.setMarks(m3);
        System.out.println("The total of marks= "+s3.getName()+" rollno= "+s3.getRollno()+" is= "+s3.calculateTotal());
        System.out.println("The average of marks= "+s3.getName()+" rollno= "+s3.getRollno()+" is= "+s3.calculateAverage());
        System.out.println("The grade accumulates to= "+s3.getName()+" rollno= "+s3.getRollno()+" is= "+s3.calculateGrade());

        Student s4 = new Student();
        s1.setName("Tanya");
        s1.setCourse("ETC");
        s1.setRollno(4);
        double[] m4 = {78,63,80};
        s1.setMarks(m4);
        System.out.println("The total of marks= "+s4.getName()+" rollno= "+s4.getRollno()+" is= "+s4.calculateTotal());
        System.out.println("The average of marks= "+s4.getName()+" rollno= "+s4.getRollno()+" is= "+s4.calculateAverage());
        System.out.println("The grade accumulates to= "+s4.getName()+" rollno= "+s4.getRollno()+" is= "+s4.calculateGrade());

        Student s5 = new Student();
        s1.setName("Yasmine");
        s1.setCourse("Mech");
        s1.setRollno(5);
        double[] m5 = {81,89,90};
        s1.setMarks(m5);
        System.out.println("The total of marks= "+s5.getName()+" rollno= "+s5.getRollno()+" is= "+s5.calculateTotal());
        System.out.println("The average of marks= "+s5.getName()+" rollno= "+s5.getRollno()+" is= "+s5.calculateAverage());
        System.out.println("The grade accumulates to= "+s5.getName()+" rollno= "+s5.getRollno()+" is= "+s5.calculateGrade());

    }
    
}