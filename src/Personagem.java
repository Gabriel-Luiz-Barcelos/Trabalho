public abstract  class Personagem {
    private String nome;
    private int hp;
    private int hpMax;
    private int defesaBase;

    public Personagem(String nome, int hp, int hpmax, int defesaBase){

    }

    public void atacar(Personagem Alvo){
       int danoBase = getPoderAtaque() ;
    }

    public void receberDano (int quantidade){

    }

    public void receberDano ( int quantidade, boolean critico){

    }

    public void receberCura( int quantidade){

    }

    public abstract void exibirStatus();

    protected abstract int getPoderAtaque();
}
