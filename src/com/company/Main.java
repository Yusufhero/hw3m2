package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(createObject("Son"));
        System.out.println(createObject("Mother"));
        System.out.println(createObject("Dady"));
        Printable[] drawbales = {createObject("Mother") , createObject("Dady"), createObject("Daughter") , createObject("GrandDaughter"), createObject("Son"),createObject("GrandSon")};
        for (Printable draw : drawbales) {
                System.out.println(draw.getInfo());
        }

    }

    public static Printable createObject(String ClassName) {
        switch (ClassName) {
            case "Daughter":
                return new Daughter("Elsd " , "Bobov " , "Books " , 25);
            case "Mother":
                return new Mother("Francur ", "Bobov ", "Sleep ", 48);
            case "GrandDaughter":
                return new GrandDaughter("Cum ", "Bobov ", "Game ", 7);
            case "Dady":
                return new Dady("Ff ", "fd ",34 );
            case "Son":
                return new Son("Ci ", "Bobov ", 27);
            case "GrandSon":
                return new GrandSon("rr ", "Bobov ", 7);

        }
        return null;
    }
}

