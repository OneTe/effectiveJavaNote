package GeneralProgramming.Item62AvoidStringsWhereOtherTypesAreMoreAppropriate;

/**
 * Created by wangcheng  on 2018/4/13.
 */
public class FixThreadLocal {
    private FixThreadLocal(){}//Non instantiable

    public static class Key{//(Capability)
        Key(){}
    }

    //Generates a unique,unforgeable key
    public static Key getKey(){
        return new Key();
    }

   // public static void set(Key key,Object value);
   // public static Object get(Key key);
}
