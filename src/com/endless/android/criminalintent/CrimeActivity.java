package com.endless.android.criminalintent;

import android.app.Fragment;

/**
 * �й� UI fragment
 */
public class CrimeActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		return new CrimeFragment();
	}
}
