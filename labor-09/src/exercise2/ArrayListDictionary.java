package exercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.awt.AWTEventMulticaster.add;

public class ArrayListDictionary implements IDictionary {
    private ArrayList<String> words=new ArrayList<>();
    private static ArrayListDictionary instance;
    private ArrayListDictionary(){
        try (Scanner scanner = new Scanner(new File(IDictionary.DICTIONARY_FILE))) {
            while (scanner.hasNextLine()) {
                String word = scanner.nextLine().trim();
                if (word.isEmpty()) {
                    continue;
                }
                add(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static IDictionary newInstance() {
        if (instance == null) {
            instance = new ArrayListDictionary();
        }
        return instance;
    }
    public boolean add(String word) {
        return words.add(word);
    }
    public int size(){
        return words.size();
    }
    public boolean find(String item){
        return Collections.binarySearch(words,item)>=0;
    }
}
