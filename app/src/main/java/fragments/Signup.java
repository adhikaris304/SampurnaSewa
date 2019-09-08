package fragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.sampurnasewa.LoginRegister;
import com.example.sampurnasewa.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Signup extends Fragment {
    private EditText etFullnameReg, etUsernameReg, etEmailReg, etAddressReg, etContact_No, etPasswordReg, etConfPassword;
    private Button btnSignUp;
    private TextView tvAlreadyHaveAccount;


    public Signup() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_signup, container, false);
        etFullnameReg = view.findViewById(R.id.etFullnameReg);
        etUsernameReg = view.findViewById(R.id.etUsernameReg);
        etEmailReg = view.findViewById(R.id.etEmailReg);
        etAddressReg = view.findViewById(R.id.etAddressReg);
        etContact_No = view.findViewById(R.id.etContact_No);
        etPasswordReg = view.findViewById(R.id.etPasswordReg);
        etConfPassword = view.findViewById(R.id.etConfPassword);
        btnSignUp = view.findViewById(R.id.btnSignUp);
        tvAlreadyHaveAccount = view.findViewById(R.id.tvAlreadyHaveAccount);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });

        tvAlreadyHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), LoginRegister.class);
                startActivity(intent);
            }
        });

        return view;
    }

    private void signup() {
    }

}
