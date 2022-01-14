package com.example.baseconversion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declaring variables needed
    TextView selectFormat;
    RadioGroup radioGroup;
    RadioButton radioButton;
    EditText editTextValue;
    CheckBox checkBox_decimal, checkBox_octal, checkBox_hexa, checkBox_binary;
    Button button_convert;

    void linkToID() {
        // Linking the variables to their respective ID
        selectFormat = findViewById(R.id.tv_select_format);
        radioGroup = findViewById(R.id.radioGroup);
        editTextValue = findViewById(R.id.editText_value);
        checkBox_binary = findViewById(R.id.cb_binary);
        checkBox_hexa = findViewById(R.id.cb_hexa);
        checkBox_octal = findViewById(R.id.cb_octal);
        checkBox_decimal = findViewById(R.id.cb_decimal);
        button_convert = findViewById(R.id.btn_convert);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linkToID();

        button_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputValue = editTextValue.getText().toString();     // get the value of the text box
                radioButton = findViewById(radioGroup.getCheckedRadioButtonId());       // Link the radio button variable with it's ID
                String checkedRadioButtonValue = radioButton.getText().toString();      // Radio button text value

                switch (checkedRadioButtonValue) {
                    case "DECIMAL":
                        if (checkBox_decimal.isChecked()) {
                            Toast.makeText(getApplicationContext(), "Decimal: " + inputValue, Toast.LENGTH_LONG).show();
                        }
                        if (checkBox_binary.isChecked()) {
                            Toast.makeText(getApplicationContext(), "Binary : " + decimalToBinary(inputValue), Toast.LENGTH_LONG).show();
                        }
                        if (checkBox_hexa.isChecked()) {
                            Toast.makeText(getApplicationContext(), "Hex : " + decimalToHexa(inputValue), Toast.LENGTH_LONG).show();
                        }
                        if (checkBox_octal.isChecked()) {
                            Toast.makeText(getApplicationContext(), "octal : " + decimalToOctal(inputValue), Toast.LENGTH_LONG).show();
                        }
                        break;
                    case "BINARY":
                        if (checkBox_decimal.isChecked()) {
                            Toast.makeText(getApplicationContext(), "Decimal: " + binaryToDecimal(inputValue), Toast.LENGTH_LONG).show();
                        }
                        if (checkBox_binary.isChecked()) {
                            Toast.makeText(getApplicationContext(), "Binary : " + inputValue, Toast.LENGTH_LONG).show();
                        }
                        if (checkBox_hexa.isChecked()) {
                            Toast.makeText(getApplicationContext(), "Hex : " + binaryToHexa(inputValue), Toast.LENGTH_LONG).show();
                        }
                        if (checkBox_octal.isChecked()) {
                            Toast.makeText(getApplicationContext(), "octal : " + binaryToOctal(inputValue), Toast.LENGTH_LONG).show();
                        }
                        break;
                    case "HEXA":
                        if (checkBox_decimal.isChecked()) {
                            Toast.makeText(getApplicationContext(), "Decimal: " + hexaToDecimal(inputValue), Toast.LENGTH_LONG).show();
                        }
                        if (checkBox_binary.isChecked()) {
                            Toast.makeText(getApplicationContext(), "Binary : " + hexaToBinary(inputValue), Toast.LENGTH_LONG).show();
                        }
                        if (checkBox_hexa.isChecked()) {
                            Toast.makeText(getApplicationContext(), "Hex : " + inputValue, Toast.LENGTH_LONG).show();
                        }
                        if (checkBox_octal.isChecked()) {
                            Toast.makeText(getApplicationContext(), "octal : " + hexaToOctal(inputValue), Toast.LENGTH_LONG).show();
                        }
                        break;
                    case "OCTAL":
                        if (checkBox_decimal.isChecked()) {
                            Toast.makeText(getApplicationContext(), "Decimal: " + octalToDecimal(inputValue), Toast.LENGTH_LONG).show();
                        }
                        if (checkBox_binary.isChecked()) {
                            Toast.makeText(getApplicationContext(), "Binary : " + octalToBinary(inputValue), Toast.LENGTH_LONG).show();
                        }
                        if (checkBox_hexa.isChecked()) {
                            Toast.makeText(getApplicationContext(), "Hex : " + octalToHexa(inputValue), Toast.LENGTH_LONG).show();
                        }
                        if (checkBox_octal.isChecked()) {
                            Toast.makeText(getApplicationContext(), "octal : " + inputValue, Toast.LENGTH_LONG).show();
                        }
                        break;
                }
            }
        });

    }

    int binaryToDecimal(String binary) {
        // convert binary to decimal.
        int decimal = Integer.parseInt(binary, 2);
        return decimal;
    }

    String binaryToHexa(String binary) {
        // convert binary to hexa
        String hexa = Integer.toHexString(Integer.parseInt(binary));
        return hexa;
    }

    String binaryToOctal(String binary) {
        // convert binary to octal
        String octal = Integer.toOctalString(Integer.parseInt(binary));
        return octal;
    }

    String decimalToHexa(String decimal) {
        // convert decimal number to hexa
        String hexa = Integer.toHexString(Integer.parseInt(decimal));
        return hexa;
    }

    String decimalToOctal(String decimal) {
        // convert decimal number to octal string
        String octal = Integer.toOctalString(Integer.parseInt(decimal));
        return octal;
    }

    String decimalToBinary(String decimal) {
        // convert decimal number to binary
        String binary = Integer.toBinaryString(Integer.parseInt(decimal));
        return binary;
    }

    int hexaToDecimal(String hexa) {
        // convert hexadecimal to decimal
        int decimalNum = Integer.parseInt(hexa, 16);
        return decimalNum;
    }

    String hexaToBinary(String hexa) {
        //  convert hexadecimal value to binary
        String binary = Integer.toBinaryString(Integer.parseInt(hexa));
        return binary;
    }

    String hexaToOctal(String hexa) {
        // convert hexa decimal value to octal
        String octalString = Integer.toOctalString(Integer.parseInt(hexa));
        return octalString;
    }

    int octalToDecimal(String octal) {
        // convert octal string to decimal number
        int decimalNumber = Integer.parseInt(octal, 8);
        return decimalNumber;
    }

    String octalToBinary(String octal) {
        // convert octal string to binary
        String binary = Integer.toBinaryString(Integer.parseInt(octal));
        return binary;
    }

    int octalToHexa(String octal) {
        // convert octal string to hexa decimal value
        int hexa = Integer.parseInt(octal, 8);
        return hexa;
    }
}