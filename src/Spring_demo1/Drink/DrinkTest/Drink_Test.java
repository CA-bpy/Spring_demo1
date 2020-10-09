package Spring_demo1.Drink.DrinkTest;

import Spring_demo1.Drink.DrinkMaker;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 加载spring配置文件，获取配置创建的对象
 * 测试订单是否成功完成
 */
public class Drink_Test {

    @Test
    public void TestDrinkMaker() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Drink_Bean.xml");
        DrinkMaker drinkMaker = (DrinkMaker)context.getBean("drinkMaker");
        System.out.println(drinkMaker.makeDrink());
    }
}
