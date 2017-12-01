import React from 'react'
import { Container, Grid, Card, Form } from 'semantic-ui-react'
import { fetchLightswitch, createLightswitch, fetchRoom } from 'api/basic'

class Lights extends React.PureComponent {
  state = {
    lights: [],
  }

  async componentDidMount() {
    const lights = this.props
    this.setState({ lights })
  }

  render() {
    const { lights } = this.state
    return (
      <Container>
        <Grid.Row>
          <Grid.Column>
            <h1>Lights</h1>
            <Card.Group itemsPerRow={6}>
              {lights.map(({ onStatus, threshold, timeThreshold }, index) => (
                <Card key={index}>
                  <Card.Content>
                    <Card.Header>Light {index + 1}</Card.Header>
                    <Card.Description>
                      Status:{' '}
                      {(typeof onStatus === 'string' && onStatus === 'true') ||
                      onStatus
                        ? 'On'
                        : 'Off'}
                      <br />
                      Threshold: {threshold}
                      <br />
                      Time Threshold: {timeThreshold}
                    </Card.Description>
                  </Card.Content>
                </Card>
              ))}
            </Card.Group>
          </Grid.Column>
        </Grid.Row>
      </Container>
    )
  }
}

export { Home }
