package rannver.designpattern.simpleFactoryPattern;

/**
 * Created by Rannver on 2018/3/15.
 */

public class ShapeFactory {

    public static <T> T getClass(Class<? extends T> c){
        T obj = null;

        try {
            obj = (T) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;
    }
}
