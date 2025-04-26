public class evennumberchecker {
    public static void checknumber(int n) throws Exception{
        if (n%2==0){
            throw new Exception (" even not alllowed");
        }
        else {
            System.out.println("it is an odd number");

        }

        }
        public static void main(String[]Tej){
            
        try{
            checknumber(6);
        }   
        catch(Exception e){
            System.out.println("Exception caught "+ e.getMessage());
        }
        }
    }
    

