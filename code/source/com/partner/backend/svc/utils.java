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
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	quantity = IDataUtil.getString( pipelineCursor, "quantity" );
			String	unit_price = IDataUtil.getString( pipelineCursor, "unit_price" );
			String	discount = IDataUtil.getString( pipelineCursor, "discount" );
		pipelineCursor.destroy();
		
		String total_price = String.valueOf(Integer.parseInt(quantity)*Float.parseFloat(unit_price)*(100-Float.parseFloat(discount))/100);
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "total_price",total_price );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}
}

