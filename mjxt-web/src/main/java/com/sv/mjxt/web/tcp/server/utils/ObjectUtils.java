package com.sv.mjxt.web.tcp.server.utils;

import com.sv.mjxt.web.dao.model.Terminal;
import com.sv.mjxt.web.tcp.server.exception.InvalidCommandException;
import com.sv.mjxt.web.tcp.server.exception.NonTerminalException;
import com.sv.mjxt.web.tcp.server.handler.BaseHandler;

public class ObjectUtils {

	public static BaseHandler checkValidCommand(BaseHandler handler, String text) {
        if (handler == null) {
            throw new InvalidCommandException(text);
        }
        return handler;
    }

	public static Terminal checkNonTerminal(Terminal terminal) {
		if (terminal == null) {
			throw new NonTerminalException();
		}
		return terminal;
	}
}
