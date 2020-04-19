package com.example.sandwish;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.sandwish.databinding.FragmentOrdersBinding;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class OrdersFragment extends Fragment {
    private TabLayout tabLayout;


    private int[] tabIcons = {
            R.drawable.location,
            R.drawable.dish,
            R.drawable.delivery

    };
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final FragmentOrdersBinding fragmentOrdersBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_orders,container,false);
        final View view = fragmentOrdersBinding.getRoot();
        setupViewPager(fragmentOrdersBinding.viewpagercontainer);
        fragmentOrdersBinding.tabs.setupWithViewPager(fragmentOrdersBinding.viewpagercontainer);
        fragmentOrdersBinding.tabs.getTabAt(0).setIcon(tabIcons[0]);
        fragmentOrdersBinding.tabs.getTabAt(1).setIcon(tabIcons[1]);
        fragmentOrdersBinding.tabs.getTabAt(2).setIcon(tabIcons[2]);
        return view;

    }



    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getFragmentManager());
        adapter.addFrag(new NearmeFragment(), "Near Me");
        adapter.addFrag(new CuisinesFragment(), "Cuisines");
        adapter.addFrag(new FastDeliveryFragment(), "Fast Delivery");

        viewPager.setAdapter(adapter);
    }
    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }



}
