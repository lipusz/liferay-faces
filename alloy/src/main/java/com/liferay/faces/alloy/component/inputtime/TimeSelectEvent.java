/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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
 */
package com.liferay.faces.alloy.component.inputtime;

import java.util.Date;

import javax.faces.component.UIComponent;
import javax.faces.component.behavior.Behavior;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.PhaseId;


/**
 * @author  Kyle Stiemann
 */
public class TimeSelectEvent extends AjaxBehaviorEvent {

	// Public Constants
	public static final String TIME_SELECT = "timeSelect";

	/// serialVersionUID
	private static final long serialVersionUID = 7170476851361370335L;

	// Private Members
	private Date time;

	public TimeSelectEvent(UIComponent uiComponent, Behavior behavior, Date time) {
		super(uiComponent, behavior);
		this.time = time;
		setPhaseId(PhaseId.APPLY_REQUEST_VALUES);
	}

	public Date getTime() {
		return time;
	}
}
