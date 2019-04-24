package com.abidroid.dagger2.dagger;

import com.abidroid.dagger2.SampleApplication;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component (modules = {
        AndroidSupportInjectionModule.class,
        ActivityModule.class,
        FragmentModule.class,
        ViewModelModule.class})
@Singleton
public interface AppComponent extends AndroidInjector<SampleApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<SampleApplication> {}

}
