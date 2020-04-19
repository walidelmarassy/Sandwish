package com.example.sandwish;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import com.example.sandwish.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.navView.setItemIconTintList(null);// to appear original image in nav drawer
        binding.drawerLayout.setScrimColor(getResources().getColor(android.R.color.transparent));
        binding.drawerLayout.setDrawerElevation(0);
        binding.navView.inflateHeaderView(R.layout.nav_header);
        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        tx.replace(R.id.container, new HomeFragment());
        tx.commit();
        binding.navicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {

                    binding.drawerLayout.openDrawer(Gravity.LEFT);

                } else binding.drawerLayout.closeDrawer(Gravity.RIGHT);
            }
        });
        binding.navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).addToBackStack(null).commit();
                        binding.drawerLayout.closeDrawers();
                        break;
                    case R.id.orders:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new OrdersFragment()).addToBackStack(null).commit();
                        binding.drawerLayout.closeDrawers();
                    case  R.id.logout:
                        //getSupportFragmentManager().beginTransaction().replace(R.id.container, new logout()).addToBackStack(null).commit();
                        break;



                }
                return true;


            }


        });

    }
}
