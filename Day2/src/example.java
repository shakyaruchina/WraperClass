public class example {
    private String first;
    private String last;
    //static= every object shares the same variable
    //static variables
    private static int members = 0;
    
    
    //static block
    //first priority while executing
    //do not need to call by main method to execute static block
    static{
        System.out.println("Static Block");
    }

    //constructor
    public example(String fn, String ln){
        first = fn;
        last =ln;
        //number of members
        members++;

        System.out.printf("Constructor for %s %s, members in the club: %d\n", first,last,members);
    }

    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
    public static int getMembers(){
        return members;
    }

    
    
    
}