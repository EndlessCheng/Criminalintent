package com.endless.android.criminalintent;

import java.util.UUID;

public class Crime {
	private UUID mId;
	private String mTitle;

	public Crime() {
		mId = UUID.randomUUID(); // 生成唯一标识符
	}

	public UUID getId() {
		return mId;
	}

	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String title) {
		mTitle = title;
	}

}
