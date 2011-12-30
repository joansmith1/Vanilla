/*
 * This file is part of Vanilla (http://www.getspout.org/).
 *
 * Vanilla is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Vanilla is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.getspout.vanilla.protocol.handler;

import org.getspout.api.player.Player;
import org.getspout.api.protocol.MessageHandler;
import org.getspout.api.protocol.Session;
import org.getspout.vanilla.protocol.msg.PositionRotationMessage;

public final class PositionRotationMessageHandler extends MessageHandler<PositionRotationMessage> {
	@Override
	public void handle(Session session, Player player, PositionRotationMessage message) {
		/*if (player == null) {
			return;
		}

		float rot = (message.getRotation() - 90) % 360;
		if (rot < 0) {
			rot += 360.0;
		}
		PlayerMoveEvent event = EventFactory.onPlayerMove(player, player.getLocation(), new Location(player.getWorld(), message.getX(), message.getY(), message.getZ(), rot, message.getPitch()));

		if (event.isCancelled()) {
			return;
		}

		player.setRawLocation(event.getTo());
		*/
	}
}