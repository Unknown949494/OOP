package exercise2;

public enum DictionaryType {
    ARRAY_LIST,
    TREE_SET,
    HASH_SET;

    public DictionaryType[] value(){
        return DictionaryType.values();
    }

    public DictionaryType valueof(String val){
        return DictionaryType.valueOf(val);
    }

}
