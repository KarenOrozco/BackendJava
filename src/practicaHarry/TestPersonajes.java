package practicaHarry;

public class TestPersonajes {
    public static void main(String[] args) {
        Harry();
        Ron();
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
}
