package demo.behavioral.responsibility;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class TwoHandler extends Handler {

    @Override
    public void handlerRequest(int num) {
        if (num == 2){
            System.out.println(" twoHandler 处理了该请求");
        } else {
            if (getNext() != null){
                getNext().handlerRequest(num);
            } else {
                System.out.println("没有人处理该请求");
            }
        }
    }
}
