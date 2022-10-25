public class Pikachu extends Pokemon implements IElectrico{
    public Pikachu(){
    }
    @Override
    protected void atacarPlacaje() {
        System.out.print("Pikachu, ataque Placaje");
    }
    @Override
    protected void atacarAraniazo() {
        System.out.print("Pikachu, ataque Arañazo");
    }
    @Override
    protected void atacarMordisco() {
        System.out.print("Pikachu, ataque Mordisco");
    }
    @Override
    public void atacarImpactTrueno() {
        System.out.print("Pikachu, ataque Impacto Trueno");
    }
    @Override
    public void atacarPunioTrueno() {
        System.out.print("Pikachu, ataque Puño Trueno");
    }
}
