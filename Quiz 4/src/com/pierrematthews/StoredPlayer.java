package com.pierrematthews;

public class StoredPlayer {
    public String key;
    public Player value;

    public StoredPlayer(String key, Player value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        if (value != null){
            return  value.toString();
        }
        else {
            return  null;
        }
    }
}