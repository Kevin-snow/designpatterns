package demo.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class ConcreteQQ extends QQ {

    private List<Player> players = new ArrayList<>();

    @Override
    public void register(Player player) {
        if (!players.contains(player)){
            players.add(player);
            player.setQQ(this);
        }

    }

    @Override
    public void relay(Player player) {
        for (Player item : players){
            if (!item.equals(player)){
                item.receive();
            }
        }
    }
}
