/* SearchResult
 *
 * $Id$
 *
 * Created on 12:45:18 PM Nov 9, 2005.
 *
 * Copyright (C) 2005 Internet Archive.
 *
 * This file is part of wayback.
 *
 * wayback is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * any later version.
 *
 * wayback is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser Public License for more details.
 *
 * You should have received a copy of the GNU Lesser Public License
 * along with wayback; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package org.archive.wayback.core;

import java.util.Properties;

/**
 *
 *
 * @author brad
 * @version $Date$, $Revision$
 */
public class SearchResult {
	private Properties data = null;
	public SearchResult() {
		super();
		data = new Properties();
	}
	public boolean containsKey(String key) {
		return data.containsKey(key);
	}

	public String get(String key) {
		return (String) data.get(key);
	}

	public String put(String key, String value) {
		return (String) data.put(key, value);
	}

}
