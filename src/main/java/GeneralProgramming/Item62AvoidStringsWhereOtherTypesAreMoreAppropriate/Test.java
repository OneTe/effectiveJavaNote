package GeneralProgramming.Item62AvoidStringsWhereOtherTypesAreMoreAppropriate;

/**
 * Created by wangcheng  on 2018/4/13.
 */
public class Test {
    //A few things that you shouldn’t do with strings
    /*
       1.Strings are poor substitutes for other value types
         When a piece of data comes into a program from a file, from the network,
         or from keyboard input, it should be translated into the appropriate type
         (int, float, boolean)
       2.Strings are poor substitutes for enum types
       3.Strings are poor substitutes for aggregate types
           Inappropriate use of string as aggregate type:
           String compoundKey = className + "#" + i.next();
           //To access individual fields, you have to parse the string, which is slow,
           tedious, and error-prone
       4.Strings are poor substitutes for capabilities
     */
}
