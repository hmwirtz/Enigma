package e.harrison.enigma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView outputTextView;
    EditText textInput, Rotor1Setting, Rotor2Setting, Rotor3Setting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitializeElements();



    }

    private void InitializeElements(){
        outputTextView = findViewById(R.id.outputText);
        textInput = findViewById(R.id.textInput);
        Rotor1Setting = findViewById(R.id.rotor1Setting);
        Rotor2Setting = findViewById(R.id.rotor2Setting);
        Rotor3Setting = findViewById(R.id.rotor3Setting);
    }

    public String getSetting(EditText editText, int setting){

        String string;
        editText = findViewById(setting);
        string = editText.getText().toString();

        return string;

    }

    public int stringToInt (String string){

        int Int;
        Int = Integer.parseInt(string);

        return Int;

    }

    public boolean isIncremented (int RotorSetting, Rotors rotor){

        int check;
        check = rotor.IncrementNextRotor(RotorSetting);
        if (check == 0){
            return false;
        }
        else return true;

    }


    public int Rotor1 (int RotorSetting){



        int increment;

        RotorSetting rotor1Setting = new RotorSetting();
        RotorSetting = rotor1Setting.rotorSetting(getSetting(Rotor1Setting, R.id.rotor1Setting));
        Rotors Rotor1 = new Rotors();


        return 0;



    }


    public int Rotor2 (int RotorSetting, boolean Increment){

        int setting;
        int check;
        setting = Rotor1(RotorSetting);
        Rotors Rotor2 = new Rotors();
        Increment = isIncremented(setting, Rotor2);

        if (Increment = true){


        }



        return setting;

    }

    public int Rotor3 (int RotorSetting){

        return RotorSetting;

    }

}
