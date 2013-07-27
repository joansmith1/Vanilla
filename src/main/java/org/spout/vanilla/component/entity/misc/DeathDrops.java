/*
 * This file is part of Vanilla.
 *
 * Copyright (c) 2011 Spout LLC <http://www.spout.org/>
 * Vanilla is licensed under the Spout License Version 1.
 *
 * Vanilla is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the Spout License Version 1.
 *
 * Vanilla is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for
 * more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the Spout License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://spout.in/licensev1> for the full license, including
 * the MIT license.
 */
package org.spout.vanilla.component.entity.misc;

import java.util.List;

import org.spout.api.inventory.Inventory;
import org.spout.api.inventory.ItemStack;

import org.spout.vanilla.component.entity.VanillaEntityComponent;
import org.spout.vanilla.data.VanillaData;

/**
 * Handle item/XP drop from a entity.
 */
public class DeathDrops extends VanillaEntityComponent {
	/**
	 * Add a amount of XP the entity drops.
	 *
	 * @param amount The amount of XP the entity drops.
	 * @return The current component.
	 */
	public DeathDrops addXpDrop(short amount) {
		getOwner().getData().put(VanillaData.DROP_EXPERIENCE, amount);
		return this;
	}

	/**
	 * Retrieve the amount of XP the entity drops on death.
	 *
	 * @return the amount of XP.
	 */
	public short getXpDrop() {
		return getOwner().getData().get(VanillaData.DROP_EXPERIENCE);
	}

	/**
	 * Add a item the entity drops.
	 *
	 * @param itemstack Contains the item to drop.
	 * @return The current component.
	 */
	public DeathDrops addDrop(ItemStack itemstack) {
		Inventory dropInventory = getOwner().getData().get(VanillaData.DROP_INVENTORY);
		dropInventory.add(itemstack);
		return this;
	}

	/**
	 * Retrieve a list of all the item drops this entity does.
	 *
	 * @return A list of all the items this entity drops.
	 */
	public List<ItemStack> getDrops() {
		return getOwner().getData().get(VanillaData.DROP_INVENTORY);
	}
}
