package com.endless.android.criminalintent;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

import android.content.Context;

/*
 * 单例
 */
public class CrimeLab {
	private ArrayList<Crime> mCrimes; // set 或许会更好

	private static CrimeLab sCrimeLab;
	private Context mAppContext;

	private CrimeLab(Context appContext) {
		mAppContext = appContext;
		mCrimes = new ArrayList<Crime>();
		Random rand = new Random();
		for (int i = 0; i < 100; ++i) {
			Crime c = new Crime();
			c.setTitle("Crime #" + i);
			c.setSolved((rand.nextInt() & 1) == 1);
			mCrimes.add(c);
		}
	}

	public static CrimeLab get(Context c) {
		if (sCrimeLab == null) {
			sCrimeLab = new CrimeLab(c.getApplicationContext());
		}
		return sCrimeLab;
	}

	public ArrayList<Crime> getCrimes() {
		return mCrimes;
	}

	public Crime getCrime(UUID id) {
		for (Crime c : mCrimes) {
			if (c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}
}
