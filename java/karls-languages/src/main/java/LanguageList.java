import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
       languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        throw new UnsupportedOperationException("Please implement the count() method");
    }

    public boolean containsLanguage(String language) {
        throw new UnsupportedOperationException("Please implement the containsLanguage() method");
    }

    public boolean isExciting() {
        throw new UnsupportedOperationException("Please implement the isExciting() method");
    }
}
