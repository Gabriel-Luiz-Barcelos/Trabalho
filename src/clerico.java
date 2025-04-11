public class clerico extends Personagem implements Especial,Suporte{

    private int fe;
    private int oracoes;

    @Override protected int getPoderAtaque();

    @Override public void usarHabilidadeEspecial(Personagem aula){

    }
    @Override public void curar(Personagem aliado);

    @Override public void exibirStatus();

}
