public class Main {
    public static void main(String[] args) {
        long inputGold = 200L;
        byte inputSilver = 39;
        short inputWood = 2005;
        long inputHealth = 97L;
        boolean inputHasHelper = true;

        Resources characterResources = new Resources(
                inputGold,
                inputSilver,
                inputWood,
                inputHealth,
                inputHasHelper
        );

        int characterGold = (int) characterResources.gold;
        int characterSilver = characterResources.silver * 100;
        double characterWood = characterResources.wood;
        byte characterHealth = (byte) characterResources.health;
        byte characterHelpersNumber;

        // установка значения characterHelpersNumber в зависимости от значения hasHelper
        if(characterResources.hasHelper)
        {
            characterHelpersNumber = 1;
        }
        else
        {
            characterHelpersNumber = 0;
        }

        Character character = new Character(
                characterGold,
                characterSilver,
                characterWood,
                characterHealth,
                characterHelpersNumber
        );

        System.out.println("Персонаж создан успешно!");
        System.out.println("Количество золота: " + character.gold);
        System.out.println("Количество серебра: " + character.silver);
        System.out.println("Количество дерева: " + character.wood);
        System.out.println("Здоровье: " + character.health);
        System.out.println("Количество помощников: " + character.helpersNumber);
        System.out.println("Навстречу приключениям!");
    }
}

class Resources {
    long gold;
    byte silver;
    short wood;
    long health;
    boolean hasHelper;

    public Resources(
            long inputGold,
            byte inputSilver,
            short inputWood,
            long inputHealth,
            boolean inputHasHelper
    ) {
        gold = inputGold;
        silver = inputSilver;
        wood = inputWood;
        health = inputHealth;
        hasHelper = inputHasHelper;
    }
}

class Character {
    int gold;
    int silver;
    double wood;
    byte health;
    byte helpersNumber;

    public Character(
            int characterGold,
            int characterSilver,
            double characterWood,
            byte characterHealth,
            byte characterHelpersNumber
    ) {
        gold = characterGold;
        silver = characterSilver;
        wood = characterWood;
        health = characterHealth;
        helpersNumber = characterHelpersNumber;
    }
}