public class Car {
        private int numDoors;
        private boolean isElectric;

        //Constructor
        public Car (int numDoors, boolean isElectric) {
             this.numDoors = numDoors;
             this.isElectric = isElectric;

    }
    
    // Getter dan setter 
    public int getNumDoors() {
        return numDoors;

    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;

    }
    
    public boolean isElectric() {
        return isElectric;

    }

    public void setElectric(boolean electric) {
        isElectric = electric;


    }

    // Method untuk menampilkan info mobil 
    public void displayInfo() {
        System.out.println("Jumlah pintu: " + numDoors);
        System.out.println("Apakah mobil listrik? " + (isElectric ? "Ya" : "Tidak")) ;
    
    }
    

    



    }
  
    


