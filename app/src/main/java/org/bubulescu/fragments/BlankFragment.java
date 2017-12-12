package org.bubulescu.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    private EditText etIme, etPrezime;
    private Button bSave;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View firstFragment = inflater.inflate(R.layout.fragment_blank, container, false);

        etIme = firstFragment.findViewById(R.id.etIme);
        etPrezime = firstFragment.findViewById(R.id.etPrezime);
        bSave = firstFragment.findViewById(R.id.bSave);


        bSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ime = etIme.getText().toString();
                String prezime = etPrezime.getText().toString();
                Toast.makeText(getActivity(), "Ime: " + ime + " Prezime: " + prezime, Toast.LENGTH_SHORT).show();
            }
        });
        
        return firstFragment;
    }

}
