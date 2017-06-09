import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap/dist/css/bootstrap-theme.css';

import React from 'react';
import ReactDOM from 'react-dom';
// Usually it is preferable to use a <BrowserRouter>
// <BrowserRouter> should be used when you have a server to handle dynamic 
// requests, while the <HashRouter> should be used for static websites.
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import App from './App';
import Login from './routes/auth/components/Login';
import Register from './routes/auth/components/Register';


import './assets/css/font-awesome.min.css';
import './assets/css/smartadmin-production-plugins.min.css';
import './assets/css/smartadmin-production.min.css';
import './assets/css/smartadmin-skins.min.css';
import './assets/css/smartadmin-react.css';


import './index.css';

ReactDOM.render((
  <Router>
      <Switch>
        <Route exact path='/' component={App} />
        <Route path='/login' component={Login} />
        <Route path='/register' component={Register} />
      </Switch>    
  </Router>),
  document.getElementById('root')
);