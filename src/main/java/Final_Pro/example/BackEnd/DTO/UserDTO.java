package Final_Pro.example.BackEnd.DTO;

public class UserDTO {

    private String emil;
    private String pasword;

    public UserDTO() {
    }


    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    @Override
    public String toString() {
        return "UserDTO{" +

                ", emil='" + emil + '\'' +
                ", pasword='" + pasword + '\'' +
                '}';
    }

    public UserDTO( String emil, String pasword) {

        this.emil = emil;
        this.pasword = pasword;
    }


}
