package uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs;

/**
 * corbaObjects/scs/ConnectionDescriptionsHolder.java . Generated by the
 * IDL-to-Java compiler (portable), version "3.2" from scs.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min27s BRST
 */

public final class ConnectionDescriptionsHolder implements
		org.omg.CORBA.portable.Streamable {
	public uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ConnectionDescription value[] = null;

	public ConnectionDescriptionsHolder() {
	}

	public ConnectionDescriptionsHolder(
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ConnectionDescription[] initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ConnectionDescriptionsHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ConnectionDescriptionsHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ConnectionDescriptionsHelper.type();
	}

}
