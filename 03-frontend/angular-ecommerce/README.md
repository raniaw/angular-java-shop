# AngularEcommerce

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 14.2.6.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via a platform of your choice. To use this command, you need to first add a package that implements end-to-end testing capabilities.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.io/cli) page.


# Okta 
npm i @okta/okta-signin-widget@6.2.0
npm i @okta/okta-angular@5.2.0
npm i @okta/okta-auth-js@6.4.0

# no warning 
angular.json
...
"options": {
            "allowedCommonJsDependencies": [
              "lodash",
              "@babel/runtime-corejs3",
              "@okta/okta-signin-widget",
              "detect-node",
              "tiny-emitter",
              "p-cancelable",
              "cross-fetch"
            ],
            ...

#ssl : Generating a RSA private key

openssl req -x509 -out ssl-localhost\localhost.crt -keyout ssl-localhost\localhost.key -newkey rsa:2048 -nodes -sha256 -days 365 -config localhost.conf

#open ssl as text

openssl x509 -noout -text -in ssl-localhost/localhost.crt


