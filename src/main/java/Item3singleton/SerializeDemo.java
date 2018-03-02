package Item3singleton;

import java.io.*;
//All of the  methods work fine until you are not doing serialization and deserialization with a singleton class
/**
 * Created by wangcheng  on 2018/3/2.
 */
public class SerializeDemo implements Serializable {
    public static void main(String[] args){
        Singleton1 singleton1 = Singleton1.getInstance();
        singleton1.setValue(1);
        //Serialize
        try{
            FileOutputStream fileOut = new FileOutputStream("src/main/java/Item3singleton/out");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(singleton1);
            out.close();
            fileOut.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        singleton1.setValue(2);
        //Deserialize
        Singleton1 singleton2 = null;
        try{
            FileInputStream fileIn = new FileInputStream("src/main/java/Item3singleton/out");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            singleton2 = (Singleton1)in.readObject();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException c){
            System.out.println("class not found");
            c.printStackTrace();
        }
        //Here, evil1 and evil2 are two different instances having
        // two different values as their field variables. This violates the
        // evil property. The solution is that we have to implement the
        // readResolve method, which is called when preparing the deserialized
        // object before returning it to the caller


        if(singleton1 == singleton2){
            System.out.println("Two objects are same");
        } else {
            System.out.println("Two objects are not same");
        }
        System.out.println(singleton1.getValue());
        System.out.println(singleton2.getValue());
    }
}
