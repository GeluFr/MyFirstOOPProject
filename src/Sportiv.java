abstract class Sportiv {
    String name;
    String tara;

    public Sportiv(String name, String tara) {
        this.name = name;
        this.tara = tara;
    }

    abstract void seAntreneaza();
    public void seOdihneste(){
        System.out.println("Sportivul se odihneste");
    }

}
