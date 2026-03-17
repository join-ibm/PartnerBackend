package com.partner.backend.svc;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class utils

{
	// ---( internal utility methods )---

	final static utils _instance = new utils();

	static utils _newInstance() { return new utils(); }

	static utils _cast(Object o) { return (utils)o; }

	// ---( server methods )---




	public static final void compute_price (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(compute_price)>> ---
		// @sigtype java 3.5
		// [i] field:0:required quantity
		// [i] field:0:required unit_price
		// [i] field:0:required discount
		// [o] field:0:required total_price
		// --- <<IS-END>> ---

                
	}
}

