public class Member 
{
  String name;
  int age;
  String number;
  String address;
  int salary;
  
  public void printsalary()
  {
    System.out.println(salary); 
  }
}

class Employee extends Member
{
  String specialization;
}
class Manager extends Member
{
  String department;
}

class Ans 
{
  public static void main(String[] args)
  {
    Employee e= new Employee();
    e.name="predeep";
    e.age=18;
    e.number="76xxxxx";
    e.address="dig";
    e.salary=50000;
    e.specialization="suraj";
    
    Manager m=new Manager();
  m.name ="suraj";
   m.age=20;
    m.number="78xxx";
    m.address="karod";
    m.salary=5000;
    
    m.department="name";
   
    
    
 }
 }
