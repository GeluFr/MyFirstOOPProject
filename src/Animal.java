public class Animal implements Vietate {
    protected String nume;
    protected String culoare;
    protected boolean vegetarian;

//Constructor cu 0 parametrii
    public Animal() {
       nume = "Unknown";
       culoare = "Unknown";
       vegetarian = false;
    }

//constructor cu 1 parametru
    public Animal(String nume) {
        this.nume = nume;
    }

    //constructor cu 3 parametrii
    public Animal(String nume, String culoare, boolean vegetarian) {
        this.nume = nume;
        this.culoare = culoare;
        this.vegetarian = vegetarian;
    }

    //metoda getter si setter

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    public void mananca(){
        System.out.println(nume + " mananca");
    }
    public void doarme(){
        System.out.println(nume + " doarme");
    }
    public String afiseaza(){
        return nume+" are culoarea "+ culoare;
    }

    @Override
    public void metodaInterfata() {

    }
}
