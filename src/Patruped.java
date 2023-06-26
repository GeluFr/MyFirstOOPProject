public class Patruped extends Animal{
    String nume;
    int nrPicioare;

    public Patruped (String nume, int nrPicioare){
        this.nume= nume;
        this.nrPicioare = 4;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrPicioare() {
        return nrPicioare;
    }

    public void setNrPicioare(int nrPicioare) {
        this.nrPicioare = nrPicioare;
    }
}
