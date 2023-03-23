public class Personagem {
    private String situation;
    private String name;
    private int life;
    private int special;
    private int attack;
    private int defense;
    private int level;

    private String type;

    public Personagem (String situation, String name, int life, int special, int attack, int defense, int level,
                       String type ) {
        this.situation = situation;
        this.name = name;
        this.life = life;
        this.special = special;
        this.attack = attack;
        this.defense = defense;
        this.level = level;
        this.type = type;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private void death (){
        if (life == 0){
            situation = "death";
        }

    }

    public int consultarVida (){

        return this.life;

    }

    public String getAlimento (){
        return "PERSONAGEM NÃO POSSUI ALIMENTO!!!";
    }

    public void scan (){

        System.out.println("situation:"+this.situation);
        System.out.println("name:"+this.name);
        System.out.println("life:"+this.life);
        System.out.println("special:"+this.special);
        System.out.println("attack:"+this.attack);
        System.out.println("defense:"+this.defense);
        System.out.println("level:"+this.level);
        System.out.println("Type:"+this.type);

    }

}
