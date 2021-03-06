package com.mmnaseri.cs.clrs.ch27.s3;

import com.mmnaseri.cs.clrs.ch02.s3.MergeSorterTest;
import com.mmnaseri.cs.clrs.ch27.s0.SchedulerFactory;
import com.mmnaseri.cs.clrs.common.Sorter;

/**
 * @author Mohammad Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (3/13/16, 6:52 PM)
 */
public abstract class ScheduledSimpleMergeSorterTest extends MergeSorterTest {

    @Override
    protected Sorter<Integer> getAscendingSorter() {
        return new ScheduledSimpleMergeSorter<>(NATURAL_COMPARATOR, getSchedulerFactory());
    }

    protected abstract SchedulerFactory getSchedulerFactory();

}