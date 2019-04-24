package com.abidroid.dagger2.dagger;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.abidroid.dagger2.viewmodel.SampleViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);

    @Binds
    @IntoMap
    @ViewModelKey(SampleViewModel.class)
    abstract ViewModel bindSampleViewModel(SampleViewModel sampleViewModel);

    // Add your view model dependencies here

}