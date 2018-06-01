package e.harrison.enigma;



public class Rotors {


    public int charValue(int rotorSetting){

        int currentSetting;
        int initialSetting = 0;

        currentSetting = initialSetting + rotorSetting;

        if (currentSetting > 26){
            return currentSetting - 26;
        }
        else

        return currentSetting;




    }

    public int IncrementNextRotor(int LettersHit){

        int increment = 0;

        if (LettersHit > 26){
            return increment++;

        }

        else return increment;

    }

}


