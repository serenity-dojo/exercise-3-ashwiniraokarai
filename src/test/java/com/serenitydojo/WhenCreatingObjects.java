package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {
    @Test
    public void creating_a_dog(){
        Dog fido = new Dog("Fido", "Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");

//        Commenting sample code because compiler cannot decide which one of the assertEquals flavor to call:
//        java: reference to assertEquals is ambiguous
//        both method assertEquals(java.lang.Object,java.lang.Object) in org.junit.Assert and method assertEquals(long,long) in org.junit.Assert match
//        Assert.assertEquals(fido.getAge(),5);

//      Using some google search help, manipulated the second arg ("expected value")
//      The result is an Integer object that represents the integer value specified by the string.
        Assert.assertEquals(fido.getAge(), Integer.valueOf("5"));

    }
}
