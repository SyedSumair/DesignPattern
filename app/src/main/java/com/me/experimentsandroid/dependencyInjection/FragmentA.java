package com.me.experimentsandroid.dependencyInjection;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.me.experimentsandroid.MyApplication;
import com.me.experimentsandroid.R;
import com.me.experimentsandroid.dependencyInjection.Contracts.MyExample;
import com.me.experimentsandroid.dependencyInjection.extras.Keys;

import java.util.Date;

import javax.inject.Inject;


/**
 * A placeholder fragment containing a simple view.
 */

/**
 * What object do you want?
 * Where do you want that object?
 * How will you provide or construct that object?
 */
public class FragmentA extends Fragment implements View.OnClickListener {
    @Inject
    SharedPreferences mPreferences;
    @Inject
    MyExample mMyExample;

    private EditText mInputText;
    private Button mBtnStore;

    public FragmentA() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((MyApplication) getActivity().getApplication()).getComponent().inject(this);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        mBtnStore.setText((new Date(mMyExample.getDate())).toString());
    }

    private void initViews(View view) {
        mInputText = (EditText) view.findViewById(R.id.input_text);
        mBtnStore = (Button) view.findViewById(R.id.btn_store);
        mBtnStore.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        storeTextToPreferences();
    }

    private void storeTextToPreferences() {
        String text = mInputText.getText().toString().trim();
        if (text != null && !text.isEmpty()) {
            mPreferences.edit().putString(Keys.PREF_INPUT, text).apply();
        }
    }
}
