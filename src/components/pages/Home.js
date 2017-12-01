import React from 'react'
import { Container, Grid, Card, Form } from 'semantic-ui-react'
import { fetchLightswitch, createLightswitch, fetchRoom } from 'api/basic'

class Home extends React.PureComponent {
  state = {
    lights: [],
    selectedStatus: 'true',
    FormThresholdValue: '',
    FormTimeThresholdValue: '',
  }

  async componentDidMount() {
    const lights = await fetchLightswitch()
    this.setState({ lights })
  }

  handleOnStatusChange = (e, { value }) =>
    this.setState({ selectedStatus: value })

  handleThresholdChange = (e, { value }) =>
    this.setState({ FormThresholdValue: value })

  handleTimeThresholdChange = (e, { value }) =>
    this.setState({ FormTimeThresholdValue: value })

  async addLightSwitch() {
    const {selectedStatus, FormThresholdValue, FormTimeThresholdValue } = this.state
    await createLightswitch(selectedStatus, FormThresholdValue, FormTimeThresholdValue)
    const lights = await fetchLightswitch()
    this.setState({ lights })
  }

  render() {
    const {
      lights,
      selectedStatus,
      FormThresholdValue,
      FormTimeThresholdValue,
    } = this.state
    return (
      <Container>
        <Grid.Row>
          <Card>
            <Card.Content>
              <Card.Header>
                <h1>Add Lightswitch</h1>
              </Card.Header>
              <Card.Description>
                <Form>
                  <Form.Group>
                    <Form.Radio
                      label={'On'}
                      value={'true'}
                      name={'OnStatus'}
                      checked={selectedStatus === 'true'}
                      onChange={this.handleOnStatusChange}
                    />
                    <Form.Radio
                      label={'Off'}
                      value={'false'}
                      name={'OnStatus'}
                      checked={selectedStatus === 'false'}
                      onChange={this.handleOnStatusChange}
                    />
                  </Form.Group>
                  <Form.Group>
                    <Form.Input
                      label={'Threshold'}
                      value={FormThresholdValue}
                      onChange={this.handleThresholdChange}
                    />
                  </Form.Group>
                  <Form.Group>
                    <Form.Input
                      label={'Time Threshold'}
                      value={FormTimeThresholdValue}
                      onChange={this.handleTimeThresholdChange}
                    />
                  </Form.Group>
                  <Form.Button
                    color={'green'}
                    type={'submit'}
                    onClick={this.addLightSwitch.bind(this)}
                  >
                    Add
                  </Form.Button>
                </Form>
              </Card.Description>
            </Card.Content>
          </Card>
        </Grid.Row>
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
