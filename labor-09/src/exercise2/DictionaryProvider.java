package exercise2;

public class DictionaryProvider {
    public static IDictionary createDictionary(DictionaryType dtype) {
        IDictionary dictionary = null;
        switch( dtype ){
            case ARRAY_LIST: dictionary= ArrayListDictionary.newInstance(); break;
        }
        return dictionary;
    }
}