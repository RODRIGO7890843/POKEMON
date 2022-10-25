public class Squirtle extends Pokemon implements IAgua {
    public Squirtle(){
    }
    @Override
    protected void atacarPlacaje() {
        System.out.print("Squirtle, ataque Placaje");
    }
    @Override
    protected void atacarAraniazo() {
        System.out.print("Squirtle, ataque Arañazo");
    }
    @Override
    protected void atacarMordisco() {
        System.out.print("Squirtle, ataque Mordisco");
    }
    @Override
    public void atacarHidroBomba() {
        System.out.print("Squirtle, ataque Hidro Bomba");
    }
    @Override
    public void atacarBurbuja() {
        System.out.print("Squirtle, ataque Burbuja");
    }
    @Override
    public void atacarPistolaAgua() {
        System.out.print("Squirtle, ataque Pistola de Agua");
    }
}
