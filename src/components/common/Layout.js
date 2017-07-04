import React from 'react'
import {Route, Switch} from 'react-router-dom'
import TodoApp from '../../routes/todo/containers/TodoApp'
// import Header from './Header'
import Navigation from '../navigation/components/Navigation'
// import Ribbon from '../ribbon/Ribbon' import Footer from './Footer' import
// Shortcut from '../navigation/components/Shortcut' import LayoutSwitcher from
// '../layout/components/LayoutSwitcher'

export default class Layout extends React.Component {
  render() {
    return (
      <div>
        {/*
        <Header />
        */}
        <Navigation/>
        <div id="main" role="main">
          {/*
          <LayoutSwitcher />
          <Ribbon />
*/}
          {this.props.children}
        </div>
        {/*
        <Footer />
        <Shortcut />
        */}

      </div>
    )
  }
}
