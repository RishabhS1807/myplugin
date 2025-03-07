var exec = require('cordova/exec');

var MyPlugin = {
    openSettings: function(success, error) {
        exec(success, error, "MyPlugin", "openSettings", []);
    }
};

module.exports = MyPlugin;
