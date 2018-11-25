package com.example.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Carshow {
    @NotNull
    @Size(min=3, max=20)
    private String car;
    @NotNull
    @Size(min=3, max=20)
    private String name;
    @NotNull
    @Size(min=3, max=20)
    private String type;
    @NotNull
    @Size(min=10, max=30)
    private String description;
}
