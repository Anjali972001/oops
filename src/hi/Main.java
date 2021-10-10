
	/* array is a data structure that is used to store multiple values in a single variable.
        so we do not need to declare separate variable for each value.
         declaration of array:

        dataType[] arrayName;
        arrayName[] = new dataType[n];
         Here [] means that it's an array.

               or
        dataType[] arrayName = new dataType [size];

         *** new keywords basically means it used to create an object in heap memory.
        n=== no of values stored in a array. or length of that array
        if this n is declared once's then we cannot exceed the value of n.


        1. all the types of the in the array should be same.
        2. [] means arrayName which is a reference variable is pointing to an array object contains type integer
           elements.
        3. dataType [] arrayName = new dataType[size]
              this right side thing is actually an array and arrayName is reference variable.
        4. int roll_no;  : is declaration . roll_no is getting defined in stack
        5. roll_no= new int [5] : is initialisation . Actual object is created in the memory (heap).
        6. dataType reference_variable = creating the object in the heap memory.
        7. declaration happens at compile time.(means int roll_no)
        8. initialisation happens at run time.(means new dataType [size])
        9. this is known as dynamic memory allocation .
           at run time memory is allocated is known as dynamic memory allocation.
       10. arrayName is reference variable stored in stack memory( where all the function calls and
           reference variable is stored.
       11. And the actual array object is stored in heap memory. example- {1, 2,3,4,5} and  the reference variable
           pointing to this object.
       12. In case of java there is no concept of pointers so we cannot get address and all.So it totally
           depends on jvm whether this array is going to be continuous or not.
           Reasons are :
           A) we know that array objects( and all other objects ) are in heap.
           B) java language specification (jls) - it is mentioned that heap objects are not continuous.
              ( continuous means that in C++ array is made of different memory blocks is stored continuously in
              c and c++)
          C) hence array objects in java may not be continuous.( and it depends on jvm)

       13. For all the integer array by default it is going to give zero(0).
          example -- int [] arrayName = new int[5];  -- means that by default {0,0,0,0,0}.

       14. String [] arr = new String [5]
           System.out.println(arr[0]);

           Output is: null

       15. null is not like a keyword ,it is like a  special literal like null type and we can caste it to any
           reference type but we can't create any nullType.

           ** null can be assigned to non primitives . example--     String str = null;
                                                       but not in--  int a = null;
             Any reference variable we have will have null value.
             int[] ros ; then it will have null value.(By default)
             *** null is special value which is by default a value of what  reference variable point to .
        16. primitive data types (int , bool, double , float  ) and references   will be stored in stack memory
            and all the objects and classes will be stored in the heap memory.


            *** int[] arr = new int[];
            so, arr will be stored in stack memory as we know that it is a reference
            but the object of arr will be stored in heap memory and {-,-,-,-}
            AND EACH particular  ELEMENT WILL BE




         */

