import React from 'react'
import ReactDOM from 'react-dom'

import 'semantic-ui-css/semantic.min.css'

import { BrowserRouter, Route, Switch } from 'react-router-dom'

import App from './App'

import { Home } from 'components/pages/Home'

ReactDOM.render(
  <BrowserRouter>
    <Switch>
      <Route exact path={'/home'} component={Home} />
      <Route component={App} />
    </Switch>
  </BrowserRouter>,
  document.getElementById('root')
)
