import shop.Articolo;
import shop.Carrello;
import shop.Cliente;

public class Exercise3 {
    public static void main(String[] args) {
        Articolo item1 = new Articolo("stura lavandini", 15.99, 4);
        Articolo item2 = new Articolo("piede di porco", 7.49, 3);
        System.out.println(item1);

        Articolo[] myArr = {item1, item2};


        Cliente user1 = new Cliente("Andrea", "De Masi", "prova@email.it", "2/10/2023");
        System.out.println(user1);

        Carrello cart = new Carrello(user1);
        cart.setMyArr(myArr);
        System.out.println(cart);

    }
}
