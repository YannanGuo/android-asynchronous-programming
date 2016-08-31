package com.guoyannan.loader;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;

import com.guoyannan.loader.dummy.DummyContent;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks,
        CursorLoaderListFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentManager fragmentManager =  getSupportFragmentManager();
        if(fragmentManager.findFragmentById(android.R.id.content) != null){
            CursorLoaderListFragment fragment = CursorLoaderListFragment.newInstance(10);
            fragmentManager.beginTransaction().add(android.R.id.content, fragment).commit();
        }
        getSupportLoaderManager().initLoader(0, null, this);
    }

    @Override
    public Loader onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader loader, Object data) {

    }

    @Override
    public void onLoaderReset(Loader loader) {

    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
