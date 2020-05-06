import java.util.ArrayList;
public class result{
    public static void main(final String[] args) {
        // primitives for loops

        // static method executing in main without creating an object

        show();

        final int i = 2;

        // primitives to objects
        // boxing
        // Integer intobj = new Integer(2)
        // autoboxing
        final Integer intobj = i;

        // prinitng the objects
        System.out.println("Int object value" + intobj);

        // unboxing
        // objects to primitive
        // int intv = intobj.intValue();
        // autounboxing
        final int intvalue = intobj;
        // printing the primitives
        System.out.println("int value " + intvalue);

        // used in collections

        final ArrayList<Integer> values = new ArrayList<Integer>();
        // autoboxing
        values.add(6);
        values.add(89);
        values.add(99);

        System.out.println("Autoboxing array list" + values);

        // new object
        final example member1 = new example("Jeniffer", "Aniston");
        final example member2 = new example("Jeniffer", "Lawrence");

        System.out.println(member1.getFirst());
        System.out.println(member1.getLast());
        System.out.println(member2.getFirst());
        System.out.println(member2.getLast());
        // prints number of members
        System.out.println(example.getMembers());
        // System.out.println(member2.getMembers());

       pyramid();
    }


        
    

    //static method
    //static can be accessed without object
    private static void show() {
        System.out.println("Static method");
    }

    

     
 

    



    
    public static void pyramid(){
        for(int i=0;i<5;i++){
            for(int j=0; j<5-i;j++){
                System.out.println(" ");
            }
            for(int k=0;k<=1;k++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
