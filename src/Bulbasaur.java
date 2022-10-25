public class Bulbasaur extends Pokemon implements IPlanta{
    public Bulbasaur(){
    }
    @Override
    protected void atacarPlacaje() {
        System.out.print("Bulbasaur, ataque Placaje");
    }
    @Override
    protected void atacarAraniazo() {
        System.out.print("Bulbasaur, ataque Arañazo");
    }
    @Override
    protected void atacarMordisco() {
        System.out.print("Bulbasaur, ataque Mordisco");
    }
    @Override
    public void atacarDrenaje() {
        System.out.print("Bulbasaur, ataque Drenaje");
    }
    @Override
    public void atacarParalizar() {
        System.out.print("Bulbasaur, ataque Paralisis");
    }
}
