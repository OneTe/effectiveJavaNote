package Item8avoidFinalizersAndCleaners;
//An autocloseable class using a cleaner as a safety net

//import java.lang.ref.Cleaner;  这个在jdk1.9里面
import sun.misc.Cleaner;

/**
 * Created by wangcheng  on 2018/3/6.
 */

//public class Room implements AutoCloseable{
//    private static final Cleaner cleaner =Cleaner.create();
//    //Resource that requires cleaning.Must not refer to Room!
//    private static class State implements Runnable{
//        int numJunkPiles;//Number of junk piles in this room
//        State(int numJunkPiles){
//            this.numJunkPiles = numJunkPiles;
//        }
//        //Invoked by close method or cleaner
//        @Override
//        public void run(){
//            System.out.println("Cleaning the room");
//            numJunkPiles = 0;
//        }
//    }
//    //The state of this room,shared with our cleanable
//    private final State state;
//
//    //Our cleanable.Cleans the room when it's eligible for gc
//    private final Cleaner.Cleanable cleanable;
//
//    public Room(int numJunkPiles){
//        state = new State(numJunkPiles);
//        cleanable = cleaner.register(this,state);
//    }
//
//    @Override
//    public void close(){
//        cleanable.clean();
//    }
//    public static void main(String[] args){
//        try(Room myRoom = new Room(7)){
//            System.out.println("GoodBye!");
//        }
//    }
//}
