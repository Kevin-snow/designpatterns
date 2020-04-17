package demo.creationnal.factory.methodfactory;

public class Client {

    public static void main(String[] args) {


        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.play();


    }
}
