package demo.creationnal.prototype;

public class Client {


    public static void main(String[] args) throws CloneNotSupportedException {

        ProtoType1 protoType1 = new ProtoType1("原型类", 1);

        ProtoType1 protoType2 = protoType1.clone();

        System.out.println(protoType1 == protoType2);


        System.out.println(protoType1.toString());
        System.out.println(protoType2.toString());


        DeepType deepType = new DeepType("李逵","黑旋风");

        System.out.println(deepType.toString() + "--" + deepType.hashCode());

        deepType = deepType.deepClone();

        System.out.println(deepType.toString() + "--" + deepType.hashCode());

    }
}
