public class Student extends  Person{
    private String registration=null;
    private String email=null;
    private Number totalMarks=null;
    private  Number obtainedMarks=null;

    public Student(){
        super();
        this.email="waqas@gmail.com";
        this.registration="ABCD-XYZ-099";
        this.totalMarks=1100;
        this.obtainedMarks=991;
    }
    public Student(String fName,String lName, String CNIC, Number age,String email, String registration,Number tMarks, Number oMarks){
        super(fName,lName,CNIC,age);
        this.email=email;
        this.registration=registration;
        this.totalMarks=tMarks;
        this.obtainedMarks=oMarks;
    }
    public Number getTotalMarks(){
        return totalMarks;
    }
    public Number getObtainedMarks() {
        return obtainedMarks;
    }
    public String getEmail() {
        return email;
    }
    public String getRegistration() {
        return registration;
    }

    public String isPassed(Student std){
        String  remarks="";
        double percentage = (std.obtainedMarks.doubleValue() / std.totalMarks.doubleValue()) * 100;
        if(percentage<40){
            remarks="Fail";
        }
        else {
            remarks="Pass";
        }
        return remarks;
    }
}
