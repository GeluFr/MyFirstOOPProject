public class Fotbalist extends Sportiv implements InterfataA{
    Abilitate abilitate;
    public Fotbalist(String name, String tara) {
        super(name, tara);
    }

    @Override
    void seAntreneaza() {

    }

    public void seOdihneste(){
        super.seOdihneste(); //super face referire la codul din clasa Sportiv , adica clasa mama
        System.out.println(" Dupa un meci dificil");
    }

    @Override
    public void metodaInterfataA() {

    }
}
