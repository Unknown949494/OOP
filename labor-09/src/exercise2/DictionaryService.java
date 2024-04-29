package exercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryService  {
    private IDictionary dictionary;
    public DictionaryService(DictionaryType type) {
        dictionary = DictionaryProvider.createDictionary(type);

    }
    public boolean findWord(String word){
        return dictionary.find(word);
    }

    public ArrayList<String> findWordsFile(String filename){
        ArrayList<String> foundWords=new ArrayList<>();
        try (Scanner scanner=new Scanner(new File(filename))){
            while (scanner.hasNext()){
                String word=scanner.next();
                if (!(dictionary.find(word)) && !(foundWords.contains(word))){
                    foundWords.add(word);
                }
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return foundWords;
    }
}