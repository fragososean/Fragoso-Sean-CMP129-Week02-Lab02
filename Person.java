public class Person {
    //Person

    //String Name
    //int Age
    //String Email

    //setName (String), getName()
    //setAge (int), getAge()
    //setEmail (String), getEmail()

    //displayinfo()

    private String Name;
    private int Age;
    private String Email;

    public void setName(String n){
        Name = n;
    }

    public String getName(){
        return Name;
    }

    public void setAge(int a){
        Age = a;
    }

    public int getAge(){
        return Age;
    }

    public void setEmail(String e){
        Email = e;
    }

    public String getEmail(){
        return Email;
    }

    public void displayinfo(){
        System.out.print("Name: "+getName() + "\t Age: " + getAge() + "\t Email: " + getEmail());
    }
}
