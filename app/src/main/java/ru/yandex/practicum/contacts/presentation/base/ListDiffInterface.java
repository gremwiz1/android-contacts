package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    boolean equals(Object o);
    boolean theSameAs(T o);
}
