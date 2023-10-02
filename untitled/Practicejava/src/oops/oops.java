package oops;

import java.util.Arrays;

public class oops {
    public static void main(String[] args) {
        //store 5 roll nos
        int [] num=new int[5];
        //store 5 names
        String [] names=new String[5];
        // create a data type to store data of 5 students?
        //include roll no, marks, name

        //data of 5 students: { roll no,name, marks}
        int[] rno=new int[5];
        String[] name=new String[5];
        float[] marks=new float[5];
        //I want all of these to be in one line
        //I guess like Structure in C
      Student[] students=new Student[5];
      Student kunal;
      Student rahul=new Student(14,"Rahul",21.2f);
      kunal=new Student(13,"Rishit",85.4f);
//Student() is a constructor
        //special function !!
        //constructor defines what will happen when object is
        // created
       // kunal=new Student(13,"Kunal",64.3);
        //constructor works like this !
        //sutdent() is a special function it is generated automatically
        //Constructor is a special func that runs when you create an object
        // and it allocates some variable

//      kunal.rno=13;
//      kunal.name="kunal";
//      kunal.marks=67.2f;


        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
//        kunal.changeName("Shoe lover");
//        kunal.greeting();


    }

    // create a class
   static  class Student {
        int rno;
        String name;
        float marks=20;


     //we need a way to add the values of the above properties
     // object by object

     // we need to one word to access every object
     // 'this' keyboard basically means this will use every object
        Student(int rno,String name,float marks){
            this.rno=rno;
            this.name=name;
            this.marks=marks;

        }
        Student(){
           // this is how you call a constructor from another
            // constructor
            // using this keyword only

            // internally: new Student();
            this(13,"default person",10f);
        }

void changeName(String newName){
            name=newName;
}
        void greeting(){
            System.out.println("hello my name is "+this.name);
        }
    }
}
