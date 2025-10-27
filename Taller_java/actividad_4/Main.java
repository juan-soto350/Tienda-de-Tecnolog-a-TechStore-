public class Main {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido a TechStore! Aquí encontrarás los mejores productos electrónicos del mercado.\n");
        System.out.println("Te presentamos algunos de nuestros productos destacados:\n");

        // los precios son inventados y no representan precios reales de mercado 
        ElectronicProduct Samsung = new ElectronicProduct("Samsung", "Galaxy S26 Ultra", 3000000, 10, "1 año");
        ElectronicProduct Xiaomi = new ElectronicProduct("Xiaomi", "17 Pro max", 3000000, 5, "1 año");
        ElectronicProduct Levono = new ElectronicProduct("Lenovo", "Tab P11", 1800000, 15, "1 año");
        ElectronicProduct Sony = new ElectronicProduct("Sony", "Bravia X90", 3000000, 8, "1 año");
        ElectronicProduct Iphone = new ElectronicProduct("Apple", "AirPods Pro Generacion 3", 800000, 20, "1 año");

        // Aqui muestro la información de los productos con el metodoshowinfo
        Samsung.showinfo();
        Xiaomi.showinfo();
        Levono.showinfo();
        Sony.showinfo();
        Iphone.showinfo();

        // Aqui pruebo algunos métodos
        System.out.println("\nAplicando descuento del 10% al nuevo Samsung:");
        Samsung.price = Samsung.price * 0.9; // Formula para aplicar descuento del 10%
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
