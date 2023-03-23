public class Npc extends Personagem {
    private String caracterisrica;

    public Npc (String situation, String name, int life, int special, int attack, int defense, int level, String type,
                String caracterisrica){
        super(situation, name, life, special, attack, defense, level, type);
        this.caracterisrica = caracterisrica;
    }

    public String getCaracterisrica() {
        return caracterisrica;
    }

    public void setCaracterisrica(String caracterisrica) {
        this.caracterisrica = caracterisrica;
    }

    public void scan() {
        super.scan();
        System.out.println("Característica:"+this.caracterisrica);
    }
}
