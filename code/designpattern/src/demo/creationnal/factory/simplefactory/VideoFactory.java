package demo.creationnal.factory.simplefactory;

public class VideoFactory {

    //常规写法。这种写法不支持扩展。如果想要扩展就得修改方法。违背了ocp原则。
//    public static Video getVideo(String type){
//        if ("java".equalsIgnoreCase(type)){
//            return new JavaVideo();
//        } else if ("python".equalsIgnoreCase(type)){
//            return new PythonVideo();
//        }
//
//        return null;
//    }


    /**
     * 利用反射的写法，进行了抽象。
     * @param s
     * @return
     */
    public static Video getVideo(Class s){

        try {
            Video video = (Video) Class.forName(s.getName()).newInstance();
            return video;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}
