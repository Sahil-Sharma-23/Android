package com.example.spinner_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    // Defining the Spinner variables
    Spinner countrySpinner, stateSpinner, citySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // String array to store the country names
        String[] countries = new String[]{"Select Country", "India", "Russia", "USA"};

        // Linking all the view items with the variable
        countrySpinner = findViewById(R.id.spinner_country);
        stateSpinner = findViewById(R.id.spinner_state);
        citySpinner = findViewById(R.id.spinner_city);

        // Setting array adapter for the country spinner
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,countries);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        countrySpinner.setAdapter(arrayAdapter);

        // Setting the listener event on the country spinner
        countrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(countrySpinner.getSelectedItem().toString().equals("India")){
                    String[] indianStates = new String[]{"Select State", "Maharashtra", "Punjab", "Kerela"};
                    ArrayAdapter<String> arrayAdapterForStates = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, indianStates);
                    arrayAdapterForStates.setDropDownViewResource(android.R.layout.simple_spinner_item);
                    stateSpinner.setAdapter(arrayAdapterForStates);

                    stateSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(stateSpinner.getSelectedItem().toString().equals("Maharashtra")){
                                String[] maharashtraCities = new String[]{"Pune", "Mumbai", "Ahmednagar"};
                                ArrayAdapter<String> arrayAdapterForCities = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, maharashtraCities);
                                arrayAdapterForCities.setDropDownViewResource(android.R.layout.simple_spinner_item);
                                citySpinner.setAdapter(arrayAdapterForCities);

                                citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        String address = countrySpinner.getSelectedItem().toString() + ", " + stateSpinner.getSelectedItem().toString() + ", " +
                                                citySpinner.getSelectedItem().toString();
                                        Toast.makeText(getApplicationContext(), address,Toast.LENGTH_SHORT).show();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }

                            if(stateSpinner.getSelectedItem().toString().equals("Punjab")){
                                String[] punjabCities = new String[]{"Ludhiana", "Amritsar", "Patiala"};
                                ArrayAdapter<String> arrayAdapterForCities = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, punjabCities);
                                arrayAdapterForCities.setDropDownViewResource(android.R.layout.simple_spinner_item);
                                citySpinner.setAdapter(arrayAdapterForCities);

                                citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        String address = countrySpinner.getSelectedItem().toString() + ", " + stateSpinner.getSelectedItem().toString() + ", " +
                                                citySpinner.getSelectedItem().toString();
                                        Toast.makeText(getApplicationContext(), address,Toast.LENGTH_SHORT).show();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }

                            if(stateSpinner.getSelectedItem().toString().equals("Kerela")){
                                String[] kerelaCities = new String[]{"Kochi", "Thrissur", "Kannur"};
                                ArrayAdapter<String> arrayAdapterForCities = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, kerelaCities);
                                arrayAdapterForCities.setDropDownViewResource(android.R.layout.simple_spinner_item);
                                citySpinner.setAdapter(arrayAdapterForCities);

                                citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        String address = countrySpinner.getSelectedItem().toString() + ", " + stateSpinner.getSelectedItem().toString() + ", " +
                                                citySpinner.getSelectedItem().toString();
                                        Toast.makeText(getApplicationContext(), address,Toast.LENGTH_SHORT).show();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });


                }

                if(countrySpinner.getSelectedItem().toString().equals("USA")){
                    String[] USAStates = new String[]{"Select State", "Texas", "Washington", "Florida"};
                    ArrayAdapter<String> arrayAdapterForStates = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, USAStates);
                    arrayAdapterForStates.setDropDownViewResource(android.R.layout.simple_spinner_item);
                    stateSpinner.setAdapter(arrayAdapterForStates);

                    stateSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(stateSpinner.getSelectedItem().toString().equals("Texas")){
                                String[] texasCities = new String[]{"Texas City", "Austin", "Houston"};
                                ArrayAdapter<String> arrayAdapterForCities = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, texasCities);
                                arrayAdapterForCities.setDropDownViewResource(android.R.layout.simple_spinner_item);
                                citySpinner.setAdapter(arrayAdapterForCities);

                                citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        String address = countrySpinner.getSelectedItem().toString() + ", " + stateSpinner.getSelectedItem().toString() + ", " +
                                                citySpinner.getSelectedItem().toString();
                                        Toast.makeText(getApplicationContext(), address,Toast.LENGTH_SHORT).show();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }

                            if(stateSpinner.getSelectedItem().toString().equals("Washington")){
                                String[] washingtonCities = new String[]{"Olympia", "Tocoma", "Seatle"};
                                ArrayAdapter<String> arrayAdapterForCities = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, washingtonCities);
                                arrayAdapterForCities.setDropDownViewResource(android.R.layout.simple_spinner_item);
                                citySpinner.setAdapter(arrayAdapterForCities);

                                citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        String address = countrySpinner.getSelectedItem().toString() + ", " + stateSpinner.getSelectedItem().toString() + ", " +
                                                citySpinner.getSelectedItem().toString();
                                        Toast.makeText(getApplicationContext(), address,Toast.LENGTH_SHORT).show();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }

                            if(stateSpinner.getSelectedItem().toString().equals("Florida")){
                                String[] floridaCities = new String[]{"Tampa", "Orlando", "Miami"};
                                ArrayAdapter<String> arrayAdapterForCities = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, floridaCities);
                                arrayAdapterForCities.setDropDownViewResource(android.R.layout.simple_spinner_item);
                                citySpinner.setAdapter(arrayAdapterForCities);

                                citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        String address = countrySpinner.getSelectedItem().toString() + ", " + stateSpinner.getSelectedItem().toString() + ", " +
                                                citySpinner.getSelectedItem().toString();
                                        Toast.makeText(getApplicationContext(), address,Toast.LENGTH_SHORT).show();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }

                if(countrySpinner.getSelectedItem().toString().equals("Russia")){
                    String[] dubaiStates = new String[]{"Select State", "Altai", "Buryatia", "Crimea"};
                    ArrayAdapter<String> arrayAdapterForStates = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, dubaiStates);
                    arrayAdapterForStates.setDropDownViewResource(android.R.layout.simple_spinner_item);
                    stateSpinner.setAdapter(arrayAdapterForStates);

                    stateSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(stateSpinner.getSelectedItem().toString().equals("Altai")){
                                String[] altaiCities = new String[]{"Biysk", "Yarovoye", "Slavgorod"};
                                ArrayAdapter<String> arrayAdapterForCities = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, altaiCities);
                                arrayAdapterForCities.setDropDownViewResource(android.R.layout.simple_spinner_item);
                                citySpinner.setAdapter(arrayAdapterForCities);

                                citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        String address = countrySpinner.getSelectedItem().toString() + ", " + stateSpinner.getSelectedItem().toString() + ", " +
                                                citySpinner.getSelectedItem().toString();
                                        Toast.makeText(getApplicationContext(), address,Toast.LENGTH_SHORT).show();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }

                            if(stateSpinner.getSelectedItem().toString().equals("Buryatia")){
                                String[] buryatiaCities = new String[]{"Arshan", "Khyagt", "Dodo-gol"};
                                ArrayAdapter<String> arrayAdapterForCities = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, buryatiaCities);
                                arrayAdapterForCities.setDropDownViewResource(android.R.layout.simple_spinner_item);
                                citySpinner.setAdapter(arrayAdapterForCities);

                                citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        String address = countrySpinner.getSelectedItem().toString() + ", " + stateSpinner.getSelectedItem().toString() + ", " +
                                                citySpinner.getSelectedItem().toString();
                                        Toast.makeText(getApplicationContext(), address,Toast.LENGTH_SHORT).show();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }

                            if(stateSpinner.getSelectedItem().toString().equals("Crimea")){
                                String[] crimeaCities = new String[]{"Kerch", "Sevastopol", "Yalta"};
                                ArrayAdapter<String> arrayAdapterForCities = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, crimeaCities);
                                arrayAdapterForCities.setDropDownViewResource(android.R.layout.simple_spinner_item);
                                citySpinner.setAdapter(arrayAdapterForCities);

                                citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        String address = countrySpinner.getSelectedItem().toString() + ", " + stateSpinner.getSelectedItem().toString() + ", " +
                                                citySpinner.getSelectedItem().toString();
                                        Toast.makeText(getApplicationContext(), address,Toast.LENGTH_SHORT).show();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                } // End of the if = Russia condition
            } // End of the onItemSelected method

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        }); // End of the country spinner onSelectedListener(Anonymous class)
    } // End of the onCreate method
} // End of the class main activity