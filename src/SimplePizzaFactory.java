/**
 * Created by xuweijie on 2016/10/18.
 */
public class SimplePizzaFactory {

    public Pizza CreatePizza(String type){
        Pizza pizza=null;
        if(type.equals("Chinese")){
            pizza=new ChinesePizza();
        }else if(type.equals("Zhbit")){
            pizza=new ZhbitPizza();
        }
        return pizza;
    }
}
