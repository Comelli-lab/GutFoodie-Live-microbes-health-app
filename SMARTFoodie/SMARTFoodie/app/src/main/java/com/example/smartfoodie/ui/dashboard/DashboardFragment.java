package com.example.smartfoodie.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.smartfoodie.R;
import com.example.smartfoodie.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment implements View.OnClickListener{

    private FragmentDashboardBinding binding;

    private Button bMealPlanner;
    private Button bHealthyDiet;
    private Button bPantry;
    private Button bLearnMore;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //final TextView textView = binding.textDashboard;
        //dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        bMealPlanner = (Button) getView().findViewById(R.id.bMealPlan);
        bMealPlanner.setOnClickListener(this::onClick);

        bHealthyDiet = (Button) getView().findViewById(R.id.bHealthyDiet);
        bHealthyDiet.setOnClickListener(this::onClick);

        bPantry = (Button) getView().findViewById(R.id.bPantry);
        bPantry.setOnClickListener(this::onClick);

        bLearnMore = (Button) getView().findViewById(R.id.bLearnMore);
        bLearnMore.setOnClickListener(this::onClick);
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick(View view) {
        if(view==bMealPlanner) {
            Toast.makeText(DashboardFragment.this.getContext(), "Meal planner is under development!", Toast.LENGTH_SHORT).show();
        }
        else if(view==bHealthyDiet) {
            Toast.makeText(DashboardFragment.this.getContext(), "Healthy diet is under development!", Toast.LENGTH_SHORT).show();
        }
        else if(view==bPantry) {
            Toast.makeText(DashboardFragment.this.getContext(), "Pantry is under development!", Toast.LENGTH_SHORT).show();
        }
        else if(view==bLearnMore) {
            Toast.makeText(DashboardFragment.this.getContext(), "Learn more is under development!", Toast.LENGTH_SHORT).show();
        }
    }
}