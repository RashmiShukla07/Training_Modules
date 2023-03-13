package student;

public class Student {
    private int rollno;
    private String name, course;
    private float[] marks;

    public void setName(String n){
        this.name = n;
    }

    public void setCourse(String cr){
        this.course = cr;
    }

    public void setRollno(int rn){
        this.rollno = rn;
    }

    public void setMarks(float[] m){
        this.marks = m;
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

    public float[] getMarks(){
        return marks;
    }

    public float calculateTotal(){
        float total = marks[0]+marks[1]+marks[2];
        return total;
    }

    public float calculateAverage(){
        float avg = (marks[0]+marks[1]+marks[2])/3;
        return avg;
    }
    public String calculateGrade(){
        float per = ((marks[0]+marks[1]+marks[2])/300)*100;
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

    public String toString(){//overriding the toString() method  
        return "Rollno "+rollno+", "+name+", "+"course "+course;  
    } 

}
