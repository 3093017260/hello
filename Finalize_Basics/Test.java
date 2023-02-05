package Finalize_Basics;


import java.util.*;

//库存管理系统
public class Test{
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        //使用此集合列表进行存储
        ArrayList list = new ArrayList();

        //创建系统首页对象
        System_Homepage system_homepage = new System_Homepage();

        //创建用户添加商品对象
        User_Add_Shopping user_option = new User_Add_Shopping();

        //添加用户删除对象
        User_Remove user_remove = new User_Remove();



        //调用系统首页方法
        system_homepage.Home_page();

        //调用添加商品方法
        Home(user_option,list,system_homepage);

        //调用删除元素方法
        user_remove.remove(list);
    }



    public static void Home(User_Add_Shopping userAddShopping,ArrayList list,System_Homepage system_homepage){
        //创建用户输入对象
        Scanner scanner = new Scanner(System.in);

        //用户输入数字对系统首页方法进行操作
        int output = scanner.nextInt();//系统首页方法，用户输入

        if (output < 1 || output > 3){
            throw new UserDontNum("您数字输入错误,请填写1-3的数字");
        }

        if (output == 1){
            userAddShopping.add(list);

            System.out.println("您是否重新执行此添加程序？");
            System.out.println("1：重新执行完整程序，0:退出程序）");

            //用户输入决定是否执行此程序
            int User_Execute_Again = scanner.nextInt();
            //执行此添加程序
            if (User_Execute_Again == 1){
                system_homepage.Home_page();
                //53行开始重新执行
                int RE = scanner.nextInt();  //RE = 重新执行的意思
                if (RE == 1){
                    userAddShopping.add(list);
                } else if (RE == 2) {

                } else if (RE == 3) {
                    userAddShopping.print(list);
                }
            } else {
                return;
            }
        } else if (output == 3) {
            userAddShopping.print(list);
        }
    }



    //自定义异常
    static class UserDontNum extends RuntimeException{
        public UserDontNum(String message) {
            super(message);
        }
    }

}

