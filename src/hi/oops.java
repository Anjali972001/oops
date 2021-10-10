/*
*** Object-oriented programming is a methodology or a paradigm to design a program using a classes and objects.
 1. Object is a real world entity that we can touch , feel. Example - Laptop,mobile,table.
     Every object will have some state and behaviour.
     object is a container that contains behavior and properties.
 2. Class is basically is a blueprint or a drawing of an object.
     ** Properties are referred as attributes . Breed , size , colour ,age of a dog is attribute or the properties.
     ** behaviour is eat, sleep, run.

                 Difference between the object-oriented programming and procedural programming:

       * Object-oriented programming:

       * this follow the bottom up approach.(means that first think of the object first and start coding)
       * in this we modularize our program into object.
       * Here we have the access modifier (private,protected,public) for good security purpose.
       * Due to having access modifier it is more secure .
       * Supports overloading.

       * procedural programming:

       * This follow the top-down approach.
       *  in this we divide the program into function.
       * Here we do not have the access modifier.
       * Less secure.
       * Do not support the overloading.


                                           object-orientated programming concept::

       1. polymorphism
       2. Encapsulation
       3. Abstraction
       4. Inheritance

                                                    Inheritance

         * Inheritance is a property of an object to acquire all the property and behavior of its parent class.
         * Inheritance follows is - a relationship which is a parent child relationship.
         * Example - animal is a super/parent class and mammals , reptiles are the sub-class of the parent class
                     animal.
         * Extension is called inheritance.
         * with no extension we need to write all the attribute of the parent class in child class again and again.
         * Syntax : class subclass extends superclass
          {
            // method / fields
          }
         * Advantages are : code re- usability , data hiding , overriding , extensibility .
         * Types of inheritance : single level , multilevel ,hierarchical level
         * Single level is one parent and one child
         * multilevel: parent to child to grandchild
         * hierarchical level : one parent with more than one child.

                                                        Polymorphism

          * Polymorphism is a property of an object which allows it to take multiple forms
          * Types of polymorphism are: run time and compile time polymorphism.

          * compile time polymorphism / static polymorphism : this is resolved during compile time.
          * over loading is an example of compile time polymorphism.
              1. overloading methods have different argument list
              2. It must have different return type if it has different argument list.
              3.  it throws different method
              4.  it has different access modifier.

          Abstraction is the methodology of hiding the implementation details from user and only providing
          functionality to them.
          * Ways to achieve the abstraction is
           1) Abstract class
           2) interface

          Encapsulation is a mechanism of wrapping up of data and code acting on method together as a single unit
          * It is achieved by declaring the variable of the class private and then providing public
           getter and setter method to modify and view the variable value.

 */