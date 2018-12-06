package BookChapter;

public class Chapter {
    private String name;
    private String number;

    public Chapter(String name, String number) {
        if (name == "" || !number.matches("^\\d+(\\.\\d+)?$")){
            throw new IllegalArgumentException("Name or number argument is illegal.");
        }

        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
