package xyz.dey.deybox.mustache;

import lombok.Data;

@Data
public class Feature {
    private String description;
    public Feature(String string){
        this.description = string;
    }
}
