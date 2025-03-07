module.exports = {
    sendMessage: function(successCallback, errorCallback) {
        if (window.cordova && cordova.exec) {
            cordova.exec(successCallback, errorCallback, "MyPlugin", "sendMessage", []);
        } else {
            console.error("Cordova is not available.");
            if (errorCallback) errorCallback("Cordova is not available.");
        }
    }
};
