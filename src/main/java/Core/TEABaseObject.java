package Core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TEABaseObject {

    protected final int DEFAULT_TIMEOUT = 30;
    protected final int DEFAULT_SLEEP = 500;
    private static Logger LOGGER = LoggerFactory.getLogger("TAE_LOGGER");

    public TEABaseObject() {
    }

    public static Logger getLOGGER() {
        return LOGGER;
    }
}
