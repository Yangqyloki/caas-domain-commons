package com.hybris.caas.dto.utils;

import com.hybris.caas.dto.order.enums.RecurrencePatternType;
import org.apache.commons.beanutils.BeanComparator;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Sort;

import java.util.Comparator;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DomainUtils {

    /**
     * Refer in DTO libraries with dependencies, refer to AddressDto.
     *
     * @param stream
     * @param delimiter
     * @return
     */
    public static String joinNonEmptyStrings(final Stream<String> stream, final String delimiter) {
        return stream.filter(StringUtils::isNotEmpty).collect(Collectors.joining(delimiter));
    }

    /**
     * Refer in DTO libraries with dependencies, refer to BaseOrderLineDto.
     * @param mainCriteria
     * @param <T>
     * @return
     */
    public static <T> Comparator<T> comparator(final Sort.Order mainCriteria) {
        final BeanComparator<T> comparator = new BeanComparator<>(mainCriteria.getProperty());
        return mainCriteria.getDirection() == Sort.Direction.ASC ? comparator
                : comparator.reversed();
    }

    /**
     * Refer in DTO libraries with dependencies, refer to BaseOrderLineDto.
     * @param interval
     * @param type
     * @return
     */
    public static String generateFrequency(final Integer interval, final String type) {
        final StringJoiner joiner = new StringJoiner(" ");
        String label = joiner.add("Every").add(interval.toString())
                .add(RecurrencePatternType.getBriefDescription(RecurrencePatternType.valueOf(type)))
                .toString();
        if (interval > 1) {
            label = label + "s";
        }
        return label;
    }

}
