public class Animal extends Personagem{
    private String alimento;

    public Animal(String situation, String name, int life, int special, int attack, int defense, int level,
                  String type, String alimento) {
        super(situation, name, life, special, attack, defense, level, type);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return this.alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void scan() {
        super.scan();
        System.out.println("Alimento:"+this.alimento);
    }

}