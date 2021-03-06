/*******************************************************************************
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 *******************************************************************************/

package com.liferay.ide.swtbot.ui.eclipse.page;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;

import com.liferay.ide.swtbot.ui.page.Tree;
import com.liferay.ide.swtbot.ui.page.View;

/**
 * @author Terry Jia
 */
public class ServersView extends View
{

    private Tree servers;

    public ServersView( SWTWorkbenchBot bot )
    {
        super( bot, LABEL_SERVERS );

        servers = new Tree( bot, 1 );
    }

    public void clickStartBtn()
    {
        clickToolbarButton( LEBAL_SERVER_START_BUTTON );
    }

    public void clickStopBtn()
    {
        clickToolbarButton( LEBAL_SERVER_STOP_BUTTON );
    }

    public void clickDebugBtn()
    {
        clickToolbarButton( LEBAL_SERVER_DEBUG_BUTTON );
    }

    public Tree getServers()
    {
        return servers;
    }

}
