package ind.keyboard.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import ind.keyboard.litrit.R;

public class EnableFragment extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        MainActivity mainApp = MainActivity.getMainApp();

        View v = inflater.inflate(R.layout.enable_fragment, container,  false);
        TextView instructionsHeadTextView = (TextView)v.findViewById(R.id.enable_instructions_head);
        TextView step1TextView = (TextView)v.findViewById(R.id.enable_step_1);
        TextView step2TextView = (TextView)v.findViewById(R.id.enable_step_2);
        TextView step3TextView = (TextView)v.findViewById(R.id.enable_step_3);
        Button enableButton = (Button)v.findViewById(R.id.enable_button);

        String instructionsHeadText = mainApp.getStringResourceByName("enable_instructions_head");
        String step1Text = mainApp.getStringResourceByName("enable_step_1");
        String step2Text = mainApp.getStringResourceByName("enable_step_2");
        String step3Text = mainApp.getStringResourceByName("enable_step_3");
        String enableButtonText = mainApp.getStringResourceByName("enable_button");

        instructionsHeadTextView.setText(instructionsHeadText);
        step1TextView.setText(step1Text);
        step2TextView.setText(step2Text);
        step3TextView.setText(step3Text);
        enableButton.setText(enableButtonText);
        return v;
    }
}