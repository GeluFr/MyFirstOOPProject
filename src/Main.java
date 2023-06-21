
public class Main {
    public static void staticMethod1(){
        System.out.println("Static method1 is called and calls method2 ");
        System.out.println("method2 return is "+ staticMethod2());
    }

    public static int staticMethod2(){
        System.out.println("static Method2 does something");
        return 1+3;
    }


    public static void main(String[] args) {


        //creeaza un obiect din clasa DemoClass
        DemoClass obiect1 = new DemoClass();
        DemoClass obiect2 = new DemoClass();
        System.out.println(obiect1.x);
        System.out.println(obiect2.x);
        obiect1.x=6;
        System.out.println(obiect1.x);
        System.out.println(obiect2.x);
        obiect1.afiseazaText();
        obiect2.text="something else";
        System.out.println(obiect2.text);
        DemoClass.afiseazaTextStatic();

        Human cristina = new Human("test@test.com","test");//instantiem obiect din clasa Human
        //cristina.email="cristina@test.com";//atribuim valori
        cristina.verify();
        cristina.sendEmail();
        //System.out.println(cristina.email);
        Human jon = new Human("jon@test.com","test");//adaugam un obiect nou
        jon.setAddress("Test 123");
        //System.out.println(jon.setAddress());
        //System.out.println(jon.email);
        cristina.planet="Earth";
        jon.planet= "Mars";
        System.out.println("Cristina's planet is "+cristina.planet+" Jon's planet is "+ jon.planet); //planet fiind static in clasa Human, atunci afiseaza ultima valoare a lui planet.

        Book book1 = new Book();
        Book book2 = new Book();
        book1.setAuthor("Mihai Eminescu");
        book1.setTitle("Poezii");
        //book2.author="Ion Creanga";
        //book2.title="Amintiri din copilarie";
        System.out.println(book1.afiseaza());
        System.out.println(book2.afiseaza());
        System.out.println(book1.getPrice());
        staticMethod1();
        //System.out.println(staticMethod2());
        staticMethod2();
        System.out.println(staticMethod2());

        //exemple clasa Sportiv-Inotator

        Inotator inotator1 = new Inotator("Popescu","Ro");
        Maratonist maratonist1 = new Maratonist("Ionescu","Ro");
        inotator1.seAntreneaza();
        inotator1.seOdihneste();
        maratonist1.seOdihneste();

        Animal animal1= new Animal("Rex");
        Animal animal2= new Animal("Bobita","neagra",false);

        animal1.mananca();
        animal1.doarme();
        String afiseazaAnimal1 = animal1.afiseaza();
        System.out.println(afiseazaAnimal1);

        animal2.mananca();
        animal2.doarme();
        String afiseazaAnimal2 = animal2.afiseaza();
        System.out.println(afiseazaAnimal2);


        Fotbalist fotbalist1= new Fotbalist("Mbape","FR");
        fotbalist1.seOdihneste();






    }
}
