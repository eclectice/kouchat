
/***************************************************************************
 *   Copyright 2006-2012 by Christian Ihle                                 *
 *   kontakt@usikkert.net                                                  *
 *                                                                         *
 *   This file is part of KouChat.                                         *
 *                                                                         *
 *   KouChat is free software; you can redistribute it and/or modify       *
 *   it under the terms of the GNU Lesser General Public License as        *
 *   published by the Free Software Foundation, either version 3 of        *
 *   the License, or (at your option) any later version.                   *
 *                                                                         *
 *   KouChat is distributed in the hope that it will be useful,            *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU      *
 *   Lesser General Public License for more details.                       *
 *                                                                         *
 *   You should have received a copy of the GNU Lesser General Public      *
 *   License along with KouChat.                                           *
 *   If not, see <http://www.gnu.org/licenses/>.                           *
 ***************************************************************************/

package net.usikkert.kouchat.ui.swing;

import java.awt.Image;

import javax.swing.ImageIcon;

import net.usikkert.kouchat.util.Validate;

/**
 * Loads the different icons to use when the application is
 * in different states.
 *
 * @author Christian Ihle
 */
public class StatusIcons {

    /** User is not away, and has no new messages. */
    private final ImageIcon normalIcon;

    /** User is not away, but has new messages. */
    private final ImageIcon normalActivityIcon;

    /** User is away, but has no new messages. */
    private final ImageIcon awayIcon;

    /** User is away, and has new messages. */
    private final ImageIcon awayActivityIcon;

    /**
     * Constructor. Loads the icons.
     *
     * @param imageLoader The image loader.
     */
    public StatusIcons(final ImageLoader imageLoader) {
        Validate.notNull(imageLoader, "Image loader can not be null");

        normalIcon = imageLoader.getKouNormal32Icon();
        normalActivityIcon = imageLoader.getKouNormalActivity32Icon();
        awayIcon = imageLoader.getKouAway32Icon();
        awayActivityIcon = imageLoader.getKouAwayActivity32Icon();
    }

    /**
     * Gets the normal icon.
     *
     * @return The normal icon.
     */
    public Image getNormalIcon() {
        return normalIcon.getImage();
    }

    /**
     * Gets the normal icon as image icon.
     *
     * @return The normal icon.
     */
    public ImageIcon getNormalIconImage() {
        return normalIcon;
    }

    /**
     * Gets the normal activity icon.
     *
     * @return The normal activity icon.
     */
    public Image getNormalActivityIcon() {
        return normalActivityIcon.getImage();
    }

    /**
     * Gets the away icon.
     *
     * @return The away icon.
     */
    public Image getAwayIcon() {
        return awayIcon.getImage();
    }

    /**
     * Gets the away activity icon.
     *
     * @return The away activity icon.
     */
    public Image getAwayActivityIcon() {
        return awayActivityIcon.getImage();
    }
}
