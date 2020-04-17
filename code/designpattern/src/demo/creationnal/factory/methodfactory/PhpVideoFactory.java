package demo.creationnal.factory.methodfactory;

public class PhpVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PhpVideo();
    }
}
