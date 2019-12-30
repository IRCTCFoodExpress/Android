package mit.android.irctcfooddelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_login);

        //navController.navigate(R.id.action_new_registration);

    }
}
