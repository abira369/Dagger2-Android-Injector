package com.abidroid.dagger2.dagger;

import com.abidroid.dagger2.view.fragments.SampleFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract SampleFragment contributeSampleFragment();

    // Add your fragment dependencies here
}
