public class Super_class {
    int num = 20;

    //Display the method of the superclass
    public void display(){

        System.out.println("This is the display method of the SUPER class");
    }
}

    class Sub_class extends Super_class{

    int num =10;

    //Display the method of the subclass
        public void display(){
            System.out.println("This is the display method of the SUB class");
        }

        public void myMethod(){
            //Instantiating the subClass
            Sub_class sub = new Sub_class();

            //Invoking the display() method of the the SUB class
            sub.display();

            //Invoking the display() method of the SUPER class
            super.display();

            //Printing the value of variable num from the subclass
            System.out.println("Value of the num variable from the subclass is: " + sub.num);

            //Printing the value of variable num from the superclass
            System.out.println("Value of the num variable from the super class is: " +super.num );

        }

        public static void main(String[] args) {

            Sub_class obj = new Sub_class();
            obj.myMethod();

        }



    }