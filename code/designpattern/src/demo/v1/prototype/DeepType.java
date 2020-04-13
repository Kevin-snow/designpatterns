package demo.v1.prototype;

import java.io.*;

/**
 * 深拷贝
 */
public class DeepType implements Serializable {


    private String name;

    private String niceName;

    public DeepType(String name, String niceName) {
        this.name = name;
        this.niceName = niceName;
    }

    @Override
    public String toString() {
        return "DeepType{" +
                "name='" + name + '\'' +
                ", niceName='" + niceName + '\'' +
                '}';
    }

    public DeepType deepClone(){

        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            DeepType obj = (DeepType) ois.readObject();
            return obj;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
