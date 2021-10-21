/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.marcoaros.toolbox.ui.login;
// Declare any non-default types here with import statements

public interface IMyTest extends android.os.IInterface
{
  /** Default implementation for IMyTest. */
  public static class Default implements com.marcoaros.toolbox.ui.login.IMyTest
  {
    /**
         * Demonstrates some basic types that you can use as parameters
         * and return values in AIDL.
         *///    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
    //            double aDouble, String aString);

    @Override public java.lang.String getName() throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.marcoaros.toolbox.ui.login.IMyTest
  {
    private static final java.lang.String DESCRIPTOR = "com.marcoaros.toolbox.ui.login.IMyTest";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.marcoaros.toolbox.ui.login.IMyTest interface,
     * generating a proxy if needed.
     */
    public static com.marcoaros.toolbox.ui.login.IMyTest asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.marcoaros.toolbox.ui.login.IMyTest))) {
        return ((com.marcoaros.toolbox.ui.login.IMyTest)iin);
      }
      return new com.marcoaros.toolbox.ui.login.IMyTest.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_getName:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getName();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.marcoaros.toolbox.ui.login.IMyTest
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /**
           * Demonstrates some basic types that you can use as parameters
           * and return values in AIDL.
           *///    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
      //            double aDouble, String aString);

      @Override public java.lang.String getName() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getName, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getName();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.marcoaros.toolbox.ui.login.IMyTest sDefaultImpl;
    }
    static final int TRANSACTION_getName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(com.marcoaros.toolbox.ui.login.IMyTest impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.marcoaros.toolbox.ui.login.IMyTest getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * Demonstrates some basic types that you can use as parameters
       * and return values in AIDL.
       *///    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
  //            double aDouble, String aString);

  public java.lang.String getName() throws android.os.RemoteException;
}
