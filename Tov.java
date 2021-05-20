public class Tov

{
    String nazw;
    int number;
    double zena;
    int kolich;

    Tov(){}
    Tov(String nazw, int number, double zena, int kolich)
    {
        this.nazw = nazw;
        this.number = number;
        this.zena = zena;
        this.kolich = kolich;
    }

    public String get_nazw()
    {return nazw;}

    public int get_number()
    {return number;}

    public double get_zena()
    {return zena;}

    public int get_kolich()
    {return kolich;}

    public void output()
    {
        System.out.println("Название товара: " + nazw);
        System.out.println("Номер товара: " + number);
        System.out.println("Цена товара/за ед.: " + zena);
        System.out.println("Количество товара: " + kolich);
    }



    double stoimost()
    {
        double a = zena * kolich;
        return a;
    }


}
