package demo.v1.factory.simplefactory;

public class Client {

    public static void main(String[] args) {

//        Video video = VideoFactory.getVideo("python");
//        video.play();

        Video video = VideoFactory.getVideo(PhpVideo.class);
        video.play();

    }

}
