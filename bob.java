
import java.util.Date;
import java.util.UUID;

public class bob
{
    public static void main(String[] args)
    {
        Pro pro1 = new Pro("Евгений Артём Олегович", "88005553535");

        System.out.println("Заказ №1: " );
        System.out.println();
        System.out.println("       Информация о продавце: ");
        pro1.output();
        System.out.println();

        System.out.println("       Информация о покупателе: ");
        Pok pok1 = new Pok("Александр Александрович Иванов", "89403874898", "1234 1234 1234 1234", "г. Белгород, Садовая 38, кв.84");
        pok1.output();
        System.out.println();
        System.out.println("       Информация о товаре: ");
        Tov tov1 = new Tov("Принтер", 256, 2500, 100);
        Tov tov2 = new Tov("Ноутбук", 145, 12000, 50);

        tov1.output();

        System.out.println("Стоимость:" + tov1.stoimost());
        System.out.println(" ");
        tov2.output();
        System.out.println("Стоимость купленного товара:" + tov2.stoimost());
        System.out.println(" ");

        System.out.println("Стоимость всего заказа:" + (tov1.stoimost() + tov2.stoimost()));


        System.out.println(" ");
        Date date = new Date(); //Дата
        String uniqueID = UUID.randomUUID().toString(); //id заказа
        System.out.println(date.toString());
        System.out.print("id заказа: " );
        System.out.print(uniqueID);
        System.out.println(" ");




        System.out.println("--------------------------------------------------------------------");


        System.out.println("Заказ №2: " );
        System.out.println();
        System.out.println("       Информация о продавце: ");
        pro1.output();
        System.out.println();

        System.out.println("       Информация о покупателе: ");
        Pok pok2 = new Pok("Иван Иванович Иванов", "8910555777222", "4321 4321 4321 4321", "г. Орёл, Мичурина 20, кв.92" );
        pok2.output();
        System.out.println();
        System.out.println("       Информация о товаре: ");
        Tov tov3 = new Tov("Утюг", 876, 1000, 250);
        tov3.output();
        System.out.println("Стоимость купленного товара:" + tov3.stoimost());
        System.out.println(" ");
        System.out.println("Стоимость всего заказа:" + tov3.stoimost());

        System.out.println(" ");
        Date date1 = new Date(); //Дата
        String uniqueID1 = UUID.randomUUID().toString(); //id заказа

        System.out.println(date1.toString());
        System.out.print("id заказа: " );
        System.out.print(uniqueID1);
        System.out.println(" ");
    }
}
