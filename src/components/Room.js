import React from 'react'
import { Container, Card } from 'semantic-ui-react'

class Room extends React.PureComponent {
  state = {
    name: '',
    numPersonas: 0,
    lightswitch: null,
    availablelight: null,
    absenceSensor: null,
  }

  componentDidMount() {}

  render() {
    return (
      <Container>
        <Card>
          <Card.Content>
            <Card.Header>{this.props.name}</Card.Header>
            <Card.Description>
              Occupants: {this.props.occupants}
              <br />

            </Card.Description>
          </Card.Content>
        </Card>
      </Container>
    )
  }
}
