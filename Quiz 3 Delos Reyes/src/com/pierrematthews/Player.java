package com.pierrematthews;

import java.util.Objects;

public class Player {
    private String name;
    private int level;

    public Player(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return level == player.level && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level);
    }

    @Override
    public String toString() {
        return "Level " + level + " " + name;
    }
}
