package io.github.rboshae.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Rick Boshae on 2/12/2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

