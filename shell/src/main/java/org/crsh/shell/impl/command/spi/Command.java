/*
 * Copyright (C) 2012 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.crsh.shell.impl.command.spi;

import org.crsh.cli.impl.invocation.InvocationMatch;
import org.crsh.command.CommandCreationException;

/**
 * The real command that will be used in an command pipeline.
 *
 * @param <C> the consumed type
 * @param <P> the the produced type
 */
public abstract class Command<C, P> {

  /**
   * @return an invoker for this command.
   * @throws CommandCreationException
   */
  public  abstract CommandInvoker<C, P> getInvoker() throws CommandCreationException;

  /**
   * @return the match that created this command
   */
  public abstract InvocationMatch<?> getMatch();

  /**
   * @return the command produced type
   */
  public abstract Class<P> getProducedType();

  /**
   * @return the command consumed type
   */
  public abstract Class<C> getConsumedType();
}
