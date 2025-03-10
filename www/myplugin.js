var exec = require('cordova/exec');

var MyPlugin = {
    openSettings: function(successCallback, errorCallback) {
        exec(successCallback, errorCallback, "MyPlugin", "openSettings", []);
    }
};

module.exports = MyPlugin;
