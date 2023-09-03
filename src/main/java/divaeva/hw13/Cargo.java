package divaeva.hw13;

import com.google.gson.annotations.SerializedName;

public class Cargo {
    private String name;

    @SerializedName(value = "class")
    private String clazz;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}

