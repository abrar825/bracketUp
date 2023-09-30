import {
  Box,
  Flex,
  Heading,
  Spacer,
  Button,
  Link,
  IconButton,
  Image,
} from "@chakra-ui/react";

import {
  Table,
  Thead,
  Tbody,
  Tfoot,
  Tr,
  Th,
  Td,
  TableCaption,
  TableContainer,
} from "@chakra-ui/react";

export default function Leaderboard() {
  return (
    <TableContainer m="20" ml="200" mr="200" bg="#B01041">
      <Table variant="striped" colorScheme="red">
        <Thead bg="blackAlpha.900">
          <Tr>
            <Th textColor="white">Rank</Th>
            <Th textColor="white">Player</Th>
            <Th textColor="white">Points</Th>
          </Tr>
        </Thead>
        <Tbody>
          <Tr>
            <Td>inches</Td>
            <Td>millimetres (mm)</Td>
            <Td>25.4</Td>
          </Tr>
          <Tr>
            <Td>feet</Td>
            <Td>centimetres (cm)</Td>
            <Td>30.48</Td>
          </Tr>
          <Tr>
            <Td>yards</Td>
            <Td>metres (m)</Td>
            <Td>0.91444</Td>
          </Tr>
        </Tbody>
      </Table>
    </TableContainer>
  );
}
