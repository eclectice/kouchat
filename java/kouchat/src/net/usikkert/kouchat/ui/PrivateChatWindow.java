
/***************************************************************************
 *   Copyright 2006-2008 by Christian Ihle                                 *
 *   kontakt@usikkert.net                                                  *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU General Public License     *
 *   along with this program; if not, write to the                         *
 *   Free Software Foundation, Inc.,                                       *
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.             *
 ***************************************************************************/

package net.usikkert.kouchat.ui;

import net.usikkert.kouchat.misc.NickDTO;

/**
 * This interface is used by other layers to communicate directly with
 * the private chat window for a user, without needing to know which kind
 * of user interface is behind.
 *
 * @author Christian Ihle
 */
public interface PrivateChatWindow
{
	/**
	 * Adds a new line of text to the private chat area, in the specified color.
	 *
	 * @param message The text to add to the private chat.
	 * @param color The color to show the text in.
	 */
	void appendToPrivateChat( String message, int color );

	/**
	 * Gets the user this private chat is connected to.
	 *
	 * @return The user of this private chat.
	 */
	NickDTO getUser();

	/**
	 * Gets the full contents of the private chat area.
	 *
	 * @return The text in the chat.
	 */
	String getChatText();

	/**
	 * Removes the text in the chat area.
	 */
	void clearChatText();

	/**
	 * Hides or shows the private chat window.
	 *
	 * @param visible True to show the window, false to hide.
	 */
	void setVisible( boolean visible );

	/**
	 * Checks if the window is visible at the moment.
	 *
	 * @return True if the window is visible.
	 */
	boolean isVisible();

	/**
	 * Gives the window a chance to change settings that depend on the away
	 * state of the user.
	 *
	 * @param away True if away.
	 */
	void setAway( boolean away );

	/**
	 * Gives the window a chance to update after the user logged off.
	 */
	void setLoggedOff();

	/**
	 * Gives the window a chance to update after a nick change.
	 */
	void updateNick();

	/**
	 * Checks if the window is focused at the moment.
	 *
	 * @return True if the window is focused.
	 */
	boolean isFocused();
}
