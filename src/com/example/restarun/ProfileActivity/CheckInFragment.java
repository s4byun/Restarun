package com.example.restarun.ProfileActivity;

import com.example.restarun.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CheckInFragment extends Fragment{

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_checkin, container, false);
		return view;
	}
}