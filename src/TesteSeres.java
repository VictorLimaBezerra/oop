public class TesteSeres {
    public static void main(String[] args){
        Animal lendario = new Animal("alive","Fenrir",3000,2200,1870,1500,100,"Lendário" ,"πcanha" );
        Npc humano = new Npc("alive", "Rogerinho", 70, 38, 45, 56,7, "Npc" , "soca-fofo");
        Personagem heroi = new Personagem("alive","Álvaro",200,156,150,137,15,"Herói");

        lendario.scanAnimal();
        System.out.println("-----------------------------------------------");
        humano.scanNpc();
        System.out.println("-----------------------------------------------");
        heroi.scan();
        System.out.println("-----------------------------------------------");


    }

}
