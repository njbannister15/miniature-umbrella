/**
 * Created by griga on 11/24/15.
 */

import React from 'react'

import NavMenuContainer from '../containers/NavMenuContainer'

import MinifyMenu from './MinifyMenu'

import LoginInfo from '../../user/containers/LoginInfo'

//import AsideChat from '../../chat/components/AsideChat'

export default class Navigation extends React.Component {

  render() {
    return (
      <aside id="left-panel">
        <LoginInfo />
        <nav>
          <NavMenuContainer/>
          {/*
          <NavMenuContainer
            openedSign={'<i class="fa fa-minus-square-o"></i>'}
            closedSign={'<i class="fa fa-plus-square-o"></i>'}
          />
          */}
        </nav>
        <MinifyMenu />
      </aside>
    )
  }
}