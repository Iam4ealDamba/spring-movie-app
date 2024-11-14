package fr.iamdamba.movie_back.enums;

public enum RoleEnum {
    MANAGER("manager"),
    COLLAB("collaborator");

    private final String name;

    private RoleEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
