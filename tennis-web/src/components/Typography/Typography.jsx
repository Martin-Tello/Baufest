import React from 'react';
import { Title,Divider } from './styles';

const Typography = (props) => {
  return (
    // <Divider>
    // <Title>Boquita grande Argentina!!!!!!!!!!!</Title>
    // </Divider>
    <Title>{props.children}</Title>
  )
}

export default Typography