package Adapter;

public class DeveloperAdapter implements JavaDeveloper {

    XMLDeveloper xmlDeveloper;

    public DeveloperAdapter() {
        xmlDeveloper = new XMLDeveloper();
    }

    @Override
    public void javaDeveloper(String s) {
        xmlDeveloper.makeDesign(s);
    }
}
