// This file was generated by Mendix Modeler 6.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package communitycommons.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the CommunityCommons module

	public static void assertTrue(IContext context, boolean _valueToAssert)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("valueToAssert", _valueToAssert);
			Core.execute(context, "CommunityCommons.AssertTrue", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void assertTrue_2(IContext context, boolean _valueToAssert, String _message)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("valueToAssert", _valueToAssert);
			params.put("message", _message);
			Core.execute(context, "CommunityCommons.AssertTrue_2", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void createUserIfNotExists(IContext context, String _username, String _role, String _password, boolean _webserviceUser)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Username", _username);
			params.put("Role", _role);
			params.put("Password", _password);
			params.put("WebserviceUser", _webserviceUser);
			Core.execute(context, "CommunityCommons.CreateUserIfNotExists", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void releaseOldLocksSE(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "CommunityCommons.releaseOldLocksSE", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static void updateUserHelper(IContext context, String _username, String _role, String _password, boolean _webserviceUser, system.proxies.User _user)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Username", _username);
			params.put("Role", _role);
			params.put("Password", _password);
			params.put("WebserviceUser", _webserviceUser);
			params.put("User", _user == null ? null : _user.getMendixObject());
			Core.execute(context, "CommunityCommons.UpdateUserHelper", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}