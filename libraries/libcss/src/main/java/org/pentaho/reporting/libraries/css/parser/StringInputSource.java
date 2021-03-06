/*!
* This program is free software; you can redistribute it and/or modify it under the
* terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
* Foundation.
*
* You should have received a copy of the GNU Lesser General Public License along with this
* program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
* or from the Free Software Foundation, Inc.,
* 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
* without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
* See the GNU Lesser General Public License for more details.
*
* Copyright (c) 2002-2017 Hitachi Vantara..  All rights reserved.
*/

package org.pentaho.reporting.libraries.css.parser;

import org.w3c.css.sac.InputSource;

import java.io.StringReader;
import java.net.URL;

/**
 * Creation-Date: 08.12.2005, 21:16:26
 *
 * @author Thomas Morgner
 */
public class StringInputSource extends InputSource {
  private StringReader reader;
  private URL baseUrl;

  /**
   * Zero-argument default constructor.
   *
   * @see #setURI
   * @see #setByteStream
   * @see #setCharacterStream
   * @see #setEncoding
   */
  public StringInputSource( final String data, final URL baseUrl ) {
    if ( data == null ) {
      throw new NullPointerException();
    }
    if ( baseUrl == null ) {
      throw new NullPointerException();
    }
    this.reader = new StringReader( data );
    this.baseUrl = baseUrl;
    setCharacterStream( reader );
    setURI( baseUrl.toExternalForm() );
  }

  public StringReader getReader() {
    return reader;
  }

  public URL getBaseUrl() {
    return baseUrl;
  }
}
