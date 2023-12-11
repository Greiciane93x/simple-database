package br.simple.database.utils;

public class Generic<T> {
    T t;

    public Generic(T t){
        this.t  = t;
    }

    public T getGeneric(){
        return this.t;
    }

    @Override
    public String toString() {
        return "Value{" +
                "t=" + t +
                '}';
    }
}
