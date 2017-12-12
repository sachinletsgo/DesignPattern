package Adapter;

public class AndroidDeveloper {


    JavaDeveloper j;

    public JavaDeveloper getJ() {
        return j;
    }

    public void setJ(JavaDeveloper j) {
        this.j = j;
    }

    public void androidProgrammer(String draw) {

        j.javaDeveloper(draw);
    }
}
