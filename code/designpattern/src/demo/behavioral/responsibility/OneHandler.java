package demo.behavioral.responsibility;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class OneHandler extends Handler {

    @Override
    public void handlerRequest(int num) {
        if (num == 1){
            System.out.println("oneHandler 处理了请求");
        } else {
            if (getNext() != null){
                getNext().handlerRequest(num);
            } else {
                System.out.println(" 没有人处理该请求 ");
            }
        }
    }
}
