package week4;

public class demo5 {
}

class People{
    String id;//身份证号
    String name;//姓名
    char sex;//性别

    public void eat(){
        System.out.println("在吃饭");
    }
    public void sleep(){
        System.out.println("在睡觉");
    }
    public void walk(){
        System.out.println("在走路");
    }
}
class Student extends People{
    String studyid; //学号
    String classes; //班级
    String grade; //成绩

    public void gotoclass(){
        System.out.println("去上课");
    }

    public void test(){
        System.out.println("去考试");
    }
}

class teacher extends People{
    String teaid;
    String x;
    String salarycode;

    public void teach(){
        System.out.println("在讲课");
    }

    public void examine(){
        System.out.println("在阅卷");
    }
}
class police extends People{
    String policeid;
    String department;
    String x;
    public void work(){
        System.out.println("在办案");
    }
    public void practice(){
        System.out.println("正在训练");
    }
}
