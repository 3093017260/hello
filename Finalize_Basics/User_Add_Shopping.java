package Finalize_Basics;


import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 王欣茜
 * @version 1.0
 */

public class User_Add_Shopping {

    //用户选项/用户添加商品输入
    Scanner scanner = new Scanner(System.in);

    //属性
    private final ArrayList Item_shopping = new ArrayList(10);
    private final ArrayList Item_Color = new ArrayList(10);
    private final ArrayList Item_num = new ArrayList(10);
    private final ArrayList Item_Price = new ArrayList(10);

    //用户添加数据方法
    @SuppressWarnings({"all"})
    public void add(ArrayList list) {  //Arraylist

        //当用户输入时调用这个循环,
        while (true) {
                System.out.println("请输入您要添加的商品");
                //String output_add = scanner.next();
                Item_shopping.add(scanner.next());//添加商品方法，用户输入商品

                //调用用户输入的选项的方法(颜色，数量，价格)
                option(list);

                System.out.println("===================================================");
                System.out.println("您是否要添加此商品？");
                System.out.println("您设置的颜色为" + Item_Color);
                System.out.println("您设置的数量为" + Item_num);
                System.out.println("您设置的价格为" + Item_Price);

            System.out.println("请填入1或0");
                System.out.println("（1为确定添加，0为取消添加）");
                System.out.println("===================================================");

                int UserOption = scanner.nextInt(); //用户选项

                if (UserOption == 1) {
                    //用户输入1进行添加数据
                    list.addAll(Item_shopping);
                    list.addAll(Item_Color);
                    list.addAll(Item_num);
                    list.addAll(Item_Price);

                } else if (UserOption == 0) {
                    //用户输入0则返回
                    return;
                } else {
                    throw new Test.UserDontNum("您输入的数字有异常,请输入0-1的数字");
                }
                //输出用户添加的数据
                System.out.println("添加成功");

                for (Object obj : list){
                    System.out.println("您输入的内容为" + obj);
                }

            System.out.println("===================================================");
            System.out.println("您是否要继续添加？"); //1 继续 0 退出
            System.out.println("（1为确定添加，0为取消添加）");

            int Continue_adding = scanner.nextInt();
            if (Continue_adding == 1){

            }else {
                return;
            }
        }
    }

    //用户添加商品的选项(颜色 价格 数量等)方法
    public void option(ArrayList list) {
        //用户输入数字进行操作
        System.out.println("请输入您要添加的颜色");
        //String output_add_Item_color = scanner.next();//添加商品方法，用户输入颜色
        Item_Color.add(scanner.next());

        System.out.println("请输入您要添加的数量");
        //int output_add_Item_num = scanner.nextInt();//添加商品方法，用户输入数量
        Item_num.add(scanner.nextInt());
        System.out.println("请输入您要添加的价格");
        //double output_add_Item_price = scanner.nextDouble();//添加商品方法，用户输入价格
        Item_Price.add(scanner.nextDouble());

    }

    public void print(ArrayList list){

        //System.out.println(list.get(0));

        for (Object obj : list){
            System.out.println("您添加的数据为" + obj.toString());

        }
    }

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

}
