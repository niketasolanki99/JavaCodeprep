package coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class ImmutabilityEx {

    //create a immutable class
    private final String name;
    private final int id;
    private final List<Courses> courses;

    public ImmutabilityEx(String name, int id, List<Courses> courses){
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>(courses);
    }

    //In the getter, return either a new copy of the list or an unmodifiable view instead of the original list.
    public List<Courses> getCourses() {
        return Collections.unmodifiableList(courses);
    }
}
