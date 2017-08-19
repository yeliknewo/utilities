
package com.kileyowen.utils;

import org.eclipse.jdt.annotation.Nullable;

import com.kileyowen.exceptions.ExceptionNull;

//TODO Document
public class NullUtils {

	// TODO Document
	public static final <T> T assertNotNull(final @Nullable T obj) throws ExceptionNull {

		// TODO Document
		if (obj == null) {

			// TODO Document
			throw new ExceptionNull();

		}

		// TODO Document
		return obj;

	}

}
