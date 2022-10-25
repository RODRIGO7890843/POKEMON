public class Charmander extends Pokemon implements IFuego{
    public Charmander(){
    }
    @Override
    protected void atacarPlacaje() {
        System.out.print("Charmander, ataque Placaje");
    }
    @Override
    protected void atacarAraniazo() {
        System.out.print("Charmander, ataque Arañazo");
    }
    @Override
    protected void atacarMordisco() {
        System.out.print("Charmander, ataque Mordisco");
    }
    @Override
    public void atacarPunioFuego() {
        System.out.print("Charmander, ataque Puño de Fuego");
    }
    @Override
    public void atacarLanzaLlamas() {
        System.out.print("Charmander, ataque LanzaLlamas");
    }
}
