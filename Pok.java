public class Pok
{
    String full_name;
    String tele;
    String card;
    String adr;

    Pok(){}
    Pok(String full_name, String tele, String card, String adr)
    {
        this.full_name = full_name;
        this.tele = tele;
        this.card = card;
        this.adr = adr;
    }

    public String get_full_name()
    {return full_name;}

    public String get_tele()
    {return tele;}

    public String get_card()
    {return card;}

    public String get_adr()
    {return adr;}

    public void output()
    {
        System.out.println("Полное имя: " + full_name);
        System.out.println("Номер телефона: " + tele);
        System.out.println("Номер карты: " + card);
        System.out.println("Адрес: " + adr);
    }

}
