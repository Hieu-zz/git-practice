package RestaurantManagement.utils;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileUtils {
    public static <T extends Serializable> void writeObjectToFile(ObjectOutputStream objOut, T object)
            throws IOException {
        objOut.writeObject(object);
    }

    public static <T extends Serializable> T readObjectFromFile(ObjectInputStream objIn, Class<T> clazz)
            throws ClassNotFoundException, IOException {
        Object obj = objIn.readObject();
        if (clazz.isInstance(obj)) {
            return clazz.cast(obj);
        } else {
            throw new ClassCastException("Can not cast the object to " + clazz.getName());
        }
    }
}
