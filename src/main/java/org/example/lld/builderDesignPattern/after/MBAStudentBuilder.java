package org.example.lld.builderDesignPattern.after;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Business Study");
        this.subjects = subs;
        return this;
    }
}
