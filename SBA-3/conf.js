var HtmlScreenshotReporter = require('protractor-jasmine2-screenshot-reporter');
 
var reporter = new HtmlScreenshotReporter({
  dest: 'target/screenshots',
  filename: 'my-report.html'
});
 
 
 
 
exports.config = {
 
directConnect: true,
 
capabilities : {
'browserName': 'chrome'
,
    chromeOptions: {
      binary: process.env.CHROME_BIN,
      args: ['--no-sandbox']
    }
},
 
 
framework: 'jasmine',
 
specs: ['./Specs/angularforms.js'],
 
jasmineNodeOpts: {
    
 
defaultTimeoutInterval: 30000
},
 
 
 // Setup the report before any tests start
  beforeLaunch: function() {
    return new Promise(function(resolve){
      reporter.beforeLaunch(resolve);
    });
  },
 
  // Assign the test reporter to each running instance
  onPrepare: function() {
    jasmine.getEnv().addReporter(reporter);
  },
 
  // Close the report after all tests finish
  afterLaunch: function(exitCode) {
    return new Promise(function(resolve){
      reporter.afterLaunch(resolve.bind(this, exitCode));
    });
  }
 
 
};