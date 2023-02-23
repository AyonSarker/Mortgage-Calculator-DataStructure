package edu.citytech.cst.finance.util;

public class PairString {

    private  String key;
    private  String value;

    public PairString(String key, String value){

        this.key = key;
        this.value = value;

    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "PairString{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
