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

package com.liferay.ide.swtbot.liferay.ui;

import com.liferay.ide.swtbot.ui.UI;

/**
 * @author Li Lu
 * @author Terry Jia
 */
public interface ServerActionUI extends UI
{

    public final String MESAGE_SERVER_STOP = "Destroying ProtocolHandler";
    public final String MENU_CREATE_DB_CONN_PROFILE = "Create a Database Connection Profile";
    public final String MENU_CREATE_PORTAL_SETTINGS_FILE = "Create Portal Settings File";
    public final String MENU_DEBUG = "Debug";
    public final String MENU_OPEN_LIFERAY_HOME_FOLDER = "Open Liferay Home Folder";
    public final String MENU_OPEN_LIFERAY_PORTAL_HOME = "Open Liferay Portal Home";
    public final String MENU_START = "Start";
    public final String MENU_STOP = "Stop";
    public final String MENU_TEST_JASON_WEB_SERVICE = "Test JSON Web Services";
    public final String MENU_TEST_LIFERAY_WEB_SERVICE = "Test Liferay Web Services";
    // public final String DELETE_SERVER = "Delete Server";
    public final String TITLE_DELETE_SERVER_WIZARD = "Delete Server";

}
