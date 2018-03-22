class Person {

   // Properties of the class...
   private String name;
   private int    age;
   private String gender;

   // Constructor of the class...
   public Person(String aName, int anAge, String agender) {
      name = aName;
      age  = anAge;
      gender = agender;
   }

   // Methods of the class...
   public void talk() {
      System.out.println("Hi, my name's " + name);
      System.out.println("and my age is " + age);
      System.out.println("and my gender is " + gender);
      System.out.println();

      commentAboutAge();
   }
   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      if (age == 5) {
         System.out.println("time to start school");
      }
      if (age > 60) {
         System.out.println("old person");
      }
   }
   public void growOlder() {
       age += 1;
   }
   public void giveKnighthood() {
       name = "Sir " + name;
   }
   public void growOlderBy(int years) {
       age += years;
   }

}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Person ls = new Person("Luke Skywalker",34,"male");
      Person wp = new Person("Winston Peters",48,"male");

      ls.talk();
      wp.talk();

      wp.growOlder();
      wp.giveKnighthood();

      ls.growOlderBy(10);
      ls.talk();

   }

}
