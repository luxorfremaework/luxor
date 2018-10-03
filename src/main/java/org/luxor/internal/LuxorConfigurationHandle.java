package org.luxor.internal;

import lombok.*;
import org.luxor.configuration.LuxorConfiguration;

/**
 * Created by jeremiassantos on 02/10/2018.
 */
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LuxorConfigurationHandle {

    private static final LuxorConfigurationHandle INSTANCE = new LuxorConfigurationHandle();

    @NonNull
    private LuxorConfiguration configuration;

    public static LuxorConfigurationHandle getInstance() {
        return INSTANCE;
    }

    public boolean isConfigurationPresent() {
        return configuration != null;
    }

}
