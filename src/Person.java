public  class Person {
    private  String firstName=null;
    private  String lastName=null;
    private  String cnic=null;
    private  Number age=null;

    public  Person (){
        this.firstName="Waqas";
        this.lastName="Ahmad";
        this.cnic="82203-2574109-3";
        this.age=25;
    }
    public  Person(String fName,String lName, String CNIC, Number age){
        this.firstName=fName;
        this.lastName=lName;
        this.cnic=CNIC;
        this.age=age;
    }
    public  String getFirstName(){
        return  firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getCnic(){
        return cnic;
    }
    public  Number getAge(){
        return age;
    }
}