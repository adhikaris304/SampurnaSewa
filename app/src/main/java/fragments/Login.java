package fragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.sampurnasewa.Booking;
import com.example.sampurnasewa.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Login extends Fragment {
    private EditText etUsernameLogin,etPasswordLogin;
    private Button btnLogin;


    public Login() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        etUsernameLogin= view.findViewById(R.id.etUsernameLogin);
        etPasswordLogin= view.findViewById(R.id.etPasswordLogin);
        btnLogin= view.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
        return view;
    }
    private void login(){
        Intent intent = new Intent(getActivity(), Booking.class);
        startActivity(intent);
    }

}
