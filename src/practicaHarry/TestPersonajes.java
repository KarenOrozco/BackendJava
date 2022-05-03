package practicaHarry;

public class TestPersonajes {
    public static void main(String[] args) {
        Harry();
        Ron();
        Ginny();
        Severus();
        Dumbledore();
    }

    public static void Harry(){
        Personaje Harry = new Personaje("Harry Potter", "English", "Male", "Gryffindor", "Dementor","Stag");
        System.out.println(Harry.showMessage());
    }

    public static void Ron(){
        Personaje Ron = new Personaje();
        Ron.setName("Ronald Weasley");
        Ron.setNationality("English");
        Ron.setGender("Male");
        Ron.setHouse("Gryffindor");
        Ron.setBoggart("Aragog");
        Ron.setPatronus("Jack Russell Terrier");
        System.out.println(Ron.showMessage());
    }

    public static void Severus(){
        Personaje Severus = new Personaje();
        Severus.setName("Severus Snape");
        Severus.setNationality("English");
        Severus.setGender("Male");
        Severus.setHouse("Slytherin");
        Severus.setBoggart("Lord Voldemort");
        Severus.setPatronus("Doe");
        System.out.println(Severus.showMessage());
    }

    public static void Dumbledore(){
        Personaje Dumbledore = new Personaje("Albus Percival Wulfric Brian Dumbledore", "English", "Male", "Gryffindor", "The corpse of his sister","phoenix");
        System.out.println(Dumbledore.showMessage());
    }

    public static void Ginny(){
        Personaje Ginny = new Personaje("Ginny Weasley", "English", "Female", "Gryffindor", "Lord Voldemort","Horse");
        System.out.println(Ginny.showMessage());
    }
}
