package Oops.Collections.enumExample;

public class Basic{
    enum Week implements A{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //These are enum constant
        //public, static and final
        //since its final you can create child enums
        //type is Week

        //abstract are not allowed method body is required
        void hi(){
            System.out.println("this body is required and we simply cant write 'void hi();' ");
        }

        Week(){
            System.out.println("Constructor called for " + this);
        }
        //this is not public or protected, only private or default
        //why? we dont want to create new objects
        //because this is not the enum concept, thats why

        //internally: public static final week Monday = new Week();

        @Override
        public void hello(){
            System.out.println("hey hello how are you");
        }
    }
    public static void main(String[] args) {
        Week week;
        week = Week.Friday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));

        // for(Week day : Week.values()){
        //     System.out.println(day);
        // }

        System.out.println(week);
        System.out.println(week.ordinal());             //position of the given day
    }
}
