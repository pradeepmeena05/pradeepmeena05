import java.util.Scanner;

class Vehical{
    Scanner a=new Scanner(System.in);
    
    int  mileage=a.nextInt();
    int  prize=a.nextInt();
    
}
class car extends Vehical{
    
   int  ownership_cost=a.nextInt();
   
   int warranty=a.nextInt();
   
   int seating_capacity=a.nextInt();
   
   String fuel_type=a.nextLine();
}
class Audi extends car{

String model=a.next();

void display(){

  System.out.println("model type is "+model);

  System.out.println("ownersip cost is "+ownership_cost);

  System.out.println("warranty is "+warranty);

  System.out.println("seating capacity is "+seating_capacity);

  System.out.println("fuel type is "+fuel_type);

  System.out.println("mileage is "+mileage);

  System.out.println("price is "+prize);

}

}
class Ford extends car{

String model=a.next();

void display(){

  System.out.println("model type is "+model);

  System.out.println("ownersip cost is "+ownership_cost);

  System.out.println("warranty is "+warranty);

  System.out.println("seating capacity is "+seating_capacity);

  System.out.println("fuel type is "+fuel_type);

  System.out.println("mileage is "+mileage);

  System.out.println("price is "+prize);

}

}

class Bike extends Vehical{

 

int cyclinders=a.nextInt();

String cooling_type=a.next();

int gears=a.nextInt();

String wheel_type=a.next();

int tank_size=a.nextInt();

}

class Bajaj extends Bike{

String type=a.next();

void display(){

System.out.println("Type is "+type);

 System.out.println("mileage is "+mileage);

  System.out.println("price is "+prize);

  System.out.println("no. of cyclinders "+cyclinders);

  System.out.println("no. of gears "+gears);

  System.out.println("cooling type is"+cooling_type);

  System.out.println("wheel type"+wheel_type);

  System.out.println("tank size "+tank_size);

}

}

class TVS extends Bike{

String type=a.next();

void display(){

System.out.println("Type is "+type);

 System.out.println("mileage is "+mileage);

  System.out.println("price is "+prize);

  System.out.println("no. of cyclinders "+cyclinders);

  System.out.println("no. of gears "+gears);

  System.out.println("cooling type is"+cooling_type);

  System.out.println("wheel type"+wheel_type);

  System.out.println("tank size "+tank_size);

}

}

public class Main{

public static void main(String args[]){

 Ford f=new Ford();

 Audi a=new Audi();

 Bajaj b=new Bajaj();

 TVS t=new TVS();

 f.display();

 a.display();

 b.display();

 t.display();

}

}
