package org.my.group;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by xiongyizhou on 2019/11/8 10:18
 * E-mail: xiongyizhou@powerpms.com
 *
 * @author xiongyizhou
 */
@ApplicationScoped
public class MyService {

    private static String NAME = "xyz";

    public String getName() {
        return NAME;
    }

}
