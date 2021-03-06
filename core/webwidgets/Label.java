package core.webwidgets;

/**
 * The Label class is a wrapper class to allow centralized control of common web
 * widget objects and methods.
 */
public class Label extends WebWidget {
	/**
	 * Label object constructor.
	 *
	 * @param id
	 *            the locator or label object identifier
	 */
	public Label(String id) {
		super(id, "Label");
	}

	/**
	 * Label object constructor to override object name with sLabel variable.
	 *
	 * @param id
	 *            the locator or Label object identifier
	 * @param label
	 *            the name to use for this object which will override the
	 *            calling objects name For example, if the calling object name
	 *            is Object1 and you want something more descriptive displayed
	 *            in the result log you can set the sLabel to "SearchAccount"
	 *            and the more descriptive object name "SearchAccount" will be
	 *            used in the log output instead of Object1. This is useful when
	 *            you are using a generic object type
	 */
	public Label(String id, String label) {
		super(id, "Label", label);
	}
}
