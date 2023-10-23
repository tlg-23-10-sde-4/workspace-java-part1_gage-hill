/*
 * The packages in this module are:
 * com.entertainment.client
 * does not export because it's the main
 */

module com.entertainment.client {
    // what other modules does this module depend on?
    // in here, I have access to the public classes in this module's exposed packages
    requires com.entertainment;
}