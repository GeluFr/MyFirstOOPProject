public class Animal implements Vietate {
    protected String nume;
    protected String culoare;
    protected boolean vegetarian;
    private  int nrPicioare;
    private String undeTraieste[] ={"apa","aer","uscat"};

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

    public Animal(String nume, String culoare, boolean vegetarian, int nrPicioare) {
        this.nume = nume;
        this.culoare = culoare;
        this.vegetarian = vegetarian;
        this.nrPicioare = nrPicioare;

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

    public int getNrPicioare() {
        return nrPicioare;
    }

    public void setNrPicioare(int nrPicioare) {
        this.nrPicioare = nrPicioare;
    }

    public String[] getUndeTraieste() {
        return undeTraieste;
    }

    public void setUndeTraieste(String[] undeTraieste) {
        this.undeTraieste = undeTraieste;
    }

    public void afiseazaNrPicioare(){
        String str1 = getNume();
        String str2;
        if(getNrPicioare()==0){
            str2 ="nu are picioare";
        } else if (getNrPicioare()==2) {
            str2 ="are 2 picioare";

        } else if (getNrPicioare()==4) {
            str2="are 4 picioare";

        }



    }

}
