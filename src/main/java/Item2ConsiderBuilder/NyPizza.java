package Item2ConsiderBuilder;

import java.util.Objects;

/**
 * Created by wangcheng  on 2018/3/1.
 */
public class NyPizza extends Pizza{
    public enum Size{SMALL,MEDIUM,LARGE}
    private final Size size;
    public static class Builder extends Pizza.Builder<Builder>{
        private final Size size;
        public Builder(Size size){
            this.size = Objects.requireNonNull(size);
        }
        @Override
        public NyPizza build(){
            return new NyPizza(this);
        }
        @Override
        protected Builder self(){
            return this;
        }
    }
    private NyPizza(Builder builder){
        super(builder);
        size = builder.size;
    }
    public static void main(String[] args){
        NyPizza nyPizza = new NyPizza.Builder(Size.SMALL).addTopping(Topping.ONION).build();
    }
}
