package dev.nathanmkaya.showcasejava.di;

import androidx.lifecycle.ViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dev.nathanmkaya.showcasejava.ui.ui.agency.agencyViewModel;
import dev.nathanmkaya.showcasejava.ui.ui.past.PastViewModel;
import dev.nathanmkaya.showcasejava.ui.ui.upcoming.UpcomingViewModel;

@Module
public abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(agencyViewModel.class)
    abstract ViewModel bindDashboardViewModel(agencyViewModel agencyViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(UpcomingViewModel.class)
    abstract ViewModel bindNotificationViewModel(UpcomingViewModel upcomingViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PastViewModel.class)
    abstract ViewModel bindHomeViewModel(PastViewModel pastViewModel);
}
