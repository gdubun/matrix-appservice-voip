/*
 * matrix-appservice-voip - Matrix Bridge to VoIP/SMS
 * Copyright (C) 2018 Kamax Sarl
 *
 * https://www.kamax.io/
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.kamax.matrix.bridge.voip.matrix.event;

public class CallHangupEvent extends CallEvent {

    public static CallHangupEvent from(String callId, String reason) {
        CallHangupEvent ev = new CallHangupEvent();
        ev.setVersion(0);
        ev.setCallId(callId);
        ev.setReason(reason);
        return ev;
    }

    /*
    Known values on Matrix side:
    - invite_timeout - Other side did not pickup within lifetime
    - ice_failed - media connection error (generic - invalid SDP, or failure to negotiate with TURN, or just network error)
     */
    private String reason;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
