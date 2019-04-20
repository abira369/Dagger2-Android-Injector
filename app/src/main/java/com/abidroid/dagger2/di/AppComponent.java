package com.abidroid.dagger2.di;

import com.abidroid.dagger2.SampleApplication;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component (modules = AndroidSupportInjectionModule.class)
public interface AppComponent extends AndroidInjector<SampleApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<SampleApplication> {}

}
