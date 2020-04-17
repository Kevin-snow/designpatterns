package demo.structural.face;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class LogisticsService {

    public String send(Goods goods){
        System.out.println(goods.getName() + " 商品已发货");
        return "物流单号：11231231";
    }

}
