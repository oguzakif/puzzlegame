
public class Word {
    private String origin;
    private String translated;
    private boolean completed = false;

    public Word(String origin, String translated) {
        this.origin = origin;
        this.translated = translated;
    }
    
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTranslated() {
        return translated;
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }

    

    

}