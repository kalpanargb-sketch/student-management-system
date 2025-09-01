public class student4 {
    void register(String name){
        System.out.println("studentregister with name"+name);
    }  
       void register(String name,int age){
        System.out.println("student registerwith name "+name+"and age"+age);

       }
         public static void main(String[] args) {
             student4 s=new student4();
             s.register("kalpu");
             s.register("bob",20);
         }

}
