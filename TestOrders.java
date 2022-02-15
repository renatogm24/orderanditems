public class TestOrders {
  public static void main(String args[]) {
    // Elementos del menú
    Item item1 = new Item();
    Item item2 = new Item();
    Item item3 = new Item();
    Item item4 = new Item();

    item1.nombre = "moka";
    item1.precio = 11.5;

    item2.nombre = "latte";
    item2.precio = 13.5;

    item3.nombre = "café de goteo";
    item3.precio = 15.5;

    item4.nombre = "capuchino";
    item4.precio = 17.5;

    Order order1 = new Order();
    Order order2 = new Order();
    Order order3 = new Order();
    Order order4 = new Order();

    order1.nombre = "Cindhuri";
    order2.nombre = "Jimmy";
    order3.nombre = "Noah";
    order4.nombre = "Sam";

    System.out.println(order1);

    order2.items.add(item1);
    order2.total = order2.total + item1.precio;
    
    order3.items.add(item4);
    order3.total = order3.total + item4.precio;
    
    order4.items.add(item2);
    order4.total = order4.total + item2.precio;

    order1.listo = true;

    order4.items.add(item2);
    order4.items.add(item2);

    order2.listo = true;
    //Ordenar variables -- orden1, orden2, etc.
    
        // Simulaciones de aplicaciones
        // Utiliza este código de ejemplo para probar las actualizaciones de varios pedidos
       /* System.out.printf("Nombre: %s\n", pedido1.nombre);
        System.out.printf("Total: %s\n", pedido1.total);
        System.out.printf("Listo: %s\n", pedido1.listo);*/
  }
}
