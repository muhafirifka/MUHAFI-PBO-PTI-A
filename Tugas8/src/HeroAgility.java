// public class HeroAgility extends Hero {
//     String type;

//     public HeroAgility(String name, double health){
//         super(name, health);
//         this.type = "Agility";
//     }
//     public void display(){
//     System.out.println(this.getName() + " is a " +
//         this.type + " Hero.");
//     }
//     }

// no 4
public class HeroAgility extends Hero {
    public String type; // Ubah modifier menjadi public

    public HeroAgility(String name, double health){
        super(name, health);
        this.type = "Agility";
    }

    public void display(){
        System.out.println(this.getName() + " is a " +
        this.type + " Hero.");
    }
}