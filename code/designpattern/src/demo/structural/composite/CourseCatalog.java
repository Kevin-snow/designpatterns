package demo.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * create by kevin.
 *
 * @Date 2020/4/18
 */
public class CourseCatalog extends MenuComponent {

    List<MenuComponent> items = new ArrayList<>();

    private String name;

    public CourseCatalog(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent component) {
        items.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        items.remove(component);
    }

    @Override
    public MenuComponent getMenuComponent(int i) {
        return items.get(i);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println("目录" + this.name);
        for (MenuComponent component : items){
            component.print();
        }
    }
}
