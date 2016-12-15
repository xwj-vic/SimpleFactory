/**
 * Created by xuweijie on 2016/10/18.
 */
public class PizzaMain {
    public static void main(String[] args){
        SimplePizzaFactory factory=new SimplePizzaFactory();
        PizzaStore store=new PizzaStore(factory);
        store.orderPizza("Chinese");
    }
}
