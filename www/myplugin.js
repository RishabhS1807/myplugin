var exec = require("cordova/exec");

var MyPlugin = {
    openSettings: function (successCallback, errorCallback) {
        exec(successCallback, errorCallback, "MyPlugin", "openSettings", []);
    },

    openDateTimeSettings: function (successCallback, errorCallback) {
        exec(successCallback, errorCallback, "MyPlugin", "openDateTimeSettings", []);
    }
};

module.exports = MyPlugin;
