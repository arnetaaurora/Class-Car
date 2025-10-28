public class CarTest {
    public static void main(String[] args) {
        // Membuat objek car 
        Car car1 = new Car (4, true);
        Car car2 = new Car(2, false);


        // Menampilkan informasi mobil
        System.out.println("=== Mobil 1 ===");
        car1.displayInfo();


        System.out.println("\n=== Mobil 2 ===");
        car2.displayInfo();

    }    


    
    
    
}
