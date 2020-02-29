package com.creaza.conferencevoting.model.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

public class QuestionCreationDto {

    @NotBlank
    private String title;

    @NotBlank
    private String category;

    @Size(min = 1)
    private List<ChoiceDto> choices;

    public QuestionCreationDto() {

    }

    public QuestionCreationDto(@NotBlank String title, @NotBlank String category, List<ChoiceDto> choices) {
        this.title = title;
        this.category = category;
        this.choices = choices;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<ChoiceDto> getChoices() {
        return choices;
    }

    public void setChoices(List<ChoiceDto> choices) {
        this.choices = choices;
    }

    @Override
    public String toString() {
        return "QuestionCreationDto{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", choices=" + choices +
                '}';
    }
}
