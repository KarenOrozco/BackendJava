package practicaHarry;

public class Personaje {
    private String name;
    private String nationality;
    private String gender;
    private String house;
    private String boggart;
    private String patronus;


    public Personaje(){ }

    public Personaje(String name, String nationality, String gender, String house, String boggart, String patronus){
        this.name = name;
        this.nationality = nationality;
        this.gender = gender;
        this. house = house;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public String getName(){  return name;  }
    public String getNationality(){  return nationality;  }
    public String getGender(){  return gender;  }
    public String getHouse(){  return house;  }
    public String getBoggart(){  return boggart; }
    public String getPatronus(){  return patronus;  }

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setNationality(String nationality){
        if(!nationality.isEmpty()){
            this.nationality = nationality;
            return true;
        }else
            return false;
    }

    public boolean setGender(String gender){
        if(!gender.isEmpty()){
            this.gender = gender;
            return true;
        }else
            return false;
    }

    public boolean setHouse(String house){
        if(!house.isEmpty()){
            this.house = house;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return
                "Name: "+name+"\n"+
                        "Nationality: "+nationality+"\n"+
                        "Gender: "+gender+"\n"+
                        "House: "+house+"\n"+
                        "Boggart: "+boggart+"\n"+
                        "Patronus: "+patronus+"\n";
    }
}
