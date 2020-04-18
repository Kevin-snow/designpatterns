package demo.structural.composite;

/**
 * 组合模式，主要用于树形结构和文件、文件夹场景。
 * create by kevin.
 *
 * @Date 2020/4/18
 */
public class Client {
    public static void main(String[] args) {

        MenuComponent course1 = new Course("java课程", 11);
        MenuComponent course2 = new Course("高等数学", 34);
        MenuComponent course3 = new Course("初中语文", 56);


        MenuComponent courseCatalog = new CourseCatalog("计算机课程");
        MenuComponent courseCatalog2 = new CourseCatalog("九年义务教育课程");

        MenuComponent baseCatalog = new CourseCatalog("课程菜单");

        courseCatalog.add(course1);
        courseCatalog2.add(course2);
        courseCatalog2.add(course3);

        baseCatalog.add(courseCatalog);
        baseCatalog.add(courseCatalog2);

        baseCatalog.print();
    }
}
