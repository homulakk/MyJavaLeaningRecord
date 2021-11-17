package demo02_info;

public class Information {
    String name; //姓名
    char gender; //‘m’，‘f’
    String company;
    String level = "";
    String idNumber;
    String phone;
    int workAge;
    byte[] photos;

    public Information(String n,char g,String c,String id,String p, int w){
        name = n;
        gender = g;
        company = c;
        idNumber = id;
        phone = p;
        workAge =w;
    }
}
