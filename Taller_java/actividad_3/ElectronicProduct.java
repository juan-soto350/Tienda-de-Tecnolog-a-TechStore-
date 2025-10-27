// Clase principal para el producto electrónico
public class ElectronicProduct {
    // Atributos
    String brand;
    String model;
    double price;
    int stock;
    String warranty;

    // Constructor
    public ElectronicProduct(String brand, String model, double price, int stock, String warranty) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.stock = stock;
        this.warranty = warranty;
    }


    // Método para mostrar información
    public void showinfo() {
        System.out.println("=== Producto Electrónico ===");
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Precio: $" + price);
        System.out.println("Stock: " + stock);
        System.out.println("Garantía: " + warranty);
        System.out.println("========================");
    }
}

// Clase principal con método main para las pruebas echas
class Main {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido a TechStore! Aquí encontrarás los mejores productos electrónicos del mercado.\n");
        System.out.println("Te presentamos algunos de nuestros productos destacados:\n");

        // los precios son inventados y no representan precios reales de mercado
        ElectronicProduct Samsung = new ElectronicProduct("Samsung", "Galaxy S26 Ultra", 3000000, 10, "1 año");
        ElectronicProduct Xiaomi = new ElectronicProduct("Xiaomi", "17 Pro max", 3000000, 5, "1 año");
        ElectronicProduct Levono = new ElectronicProduct("Lenovo", "Tab P11", 1800000, 15, "1 año");
        ElectronicProduct Sony = new ElectronicProduct("Sony", "Bravia X90", 3000000, 8, "1 año");
        ElectronicProduct Iphone = new ElectronicProduct("Apple", "AirPods Pro Generacion 3", 800000, 20, "1 año");

        // Mostrar información de los productos
        Samsung.showinfo();
        Xiaomi.showinfo();
        Levono.showinfo();
        Sony.showinfo();
        Iphone.showinfo();

        // Probar algunos métodos
        System.out.println("\nAplicando descuento del 10% al nuevo Samsung:");
        Samsung.price = Samsung.price * 0.9; // Aplicar descuento del 10%
        Samsung.showinfo();

        System.out.println("\nVerificando en el almacen la disponibilidad del ultimo Xiaomi: ");
        System.out.println("¿Hay stock disponible? " );
        if (Xiaomi.stock > 0) {
            System.out.println("¡Sí, el Xiaomi 17 Pro max está disponible para la venta!");
        } else {
            System.out.println("Lo sentimos, el Xiaomi 17 Pro max está agotado.");
        }
        System.out.println("\nEncuéntranos en Bogotá, Centro Comercial Unicentro en el local 23. ¡Te esperamos!");
    }
}
