package br.edu.ifmg.escola.constants;

public enum ResourceType {

    LESSON_ONLY("LIÇÃO"),
    LESSON_TASK("TAREFA"),
    FORUM("FORUM"),
    EXTERNAL_LINK("LINK EXTERNO");

    private String description;

    ResourceType(String description) {
        this.description = description;
    }
}
