package exercise2;

public interface IDictionary {

    String DICTIONARY_FILE= ".idea/text_to_find.txt";
    boolean add(String word);
    boolean find(String target);
    int size();



}