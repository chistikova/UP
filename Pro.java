public class Pro

{
    String full_name;
    String tele;


    Pro(){}
    Pro(String full_name, String tele)
    {
        this.full_name = full_name;
        this.tele = tele;
    }

    public String get_full_name()
    {return full_name;}

    public String get_tele()
    {return tele;}

    public void output()
    {
        System.out.println("Продавец: " + full_name);
        System.out.println("Контактный номер телефона: " + tele);
    }

}
