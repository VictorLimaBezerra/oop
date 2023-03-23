public class TesteSeres {
    public static void main(String[] args){
        Animal lendario = new Animal("alive","Fenrir",3000,2200,1870,1500,100,"Lendário" ,"πcanha" );
        Npc humano = new Npc("alive", "Rogerinho", 70, 38, 45, 56,7, "Npc" , "soca-fofo");
        Personagem heroi = new Personagem("alive","Álvaro",200,156,150,137,15,"Herói");
        System.out.println(heroi.getAlimento());
        heroi = new Animal(heroi.getSituation(), heroi.getName(), heroi.getLife(), heroi.getSpecial(),
                heroi.getAttack(), heroi.getDefense(), heroi.getLevel(), heroi.getType(), "pizza");

        lendario.scan();
        System.out.println("-----------------------------------------------");
        humano.scan();
        System.out.println("-----------------------------------------------");
        heroi.scan();
        System.out.println("-----------------------------------------------");

        System.out.println(heroi.getAlimento());

        heroi = new Personagem(heroi.getSituation(), lendario.getName(), heroi.getLife(), heroi.getSpecial(),
                lendario.getAttack(), humano.getDefense(), lendario.getLevel(), humano.getType());

        System.out.println(heroi.getAlimento());
    }

}
