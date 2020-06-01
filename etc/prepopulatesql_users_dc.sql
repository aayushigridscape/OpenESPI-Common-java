/*
 *    Copyright (c) 2018-2020 Green Button Alliance, Inc.
 *
 *    Portions copyright (c) 2013-2018 EnergyOS.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

/*
 *    Copyright (c) 2018-2020 Green Button Alliance, Inc.
 *
 *    Portions copyright (c) 2013-2018 EnergyOS.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

/*
 *
 * Copyright (c) 2018-2020 Green Button Alliance, Inc.
 *
 * Portions copyright (c) 2013-2018 EnergyOS.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

/*
 *
 *  *     Copyright (c) 2018-2020 Green Button Alliance, Inc.
 *  *
 *  *     Portions copyright (c) 2013-2018 EnergyOS.org
 *  *
 *  *     Licensed under the Apache License, Version 2.0 (the "License");
 *  *     you may not use this file except in compliance with the License.
 *  *     You may obtain a copy of the License at
 *  *
 *  *         http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *     Unless required by applicable law or agreed to in writing, software
 *  *     distributed under the License is distributed on an "AS IS" BASIS,
 *  *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *     See the License for the specific language governing permissions and
 *  *     limitations under the License.
 *  *
 *
 */

/*
 *
 *  *     Copyright (c) 2018-2020 Green Button Alliance, Inc.
 *  *
 *  *     Portions copyright (c) 2013-2018 EnergyOS.org
 *  *
 *  *     Licensed under the Apache License, Version 2.0 (the "License");
 *  *     you may not use this file except in compliance with the License.
 *  *     You may obtain a copy of the License at
 *  *
 *  *         http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *     Unless required by applicable law or agreed to in writing, software
 *  *     distributed under the License is distributed on an "AS IS" BASIS,
 *  *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *     See the License for the specific language governing permissions and
 *  *     limitations under the License.
 *  *
 *
 */

/*
 *
 *  *     Copyright (c) 2018-2020 Green Button Alliance, Inc.
 *  *
 *  *     Portions copyright (c) 2013-2018 EnergyOS.org
 *  *
 *  *     Licensed under the Apache License, Version 2.0 (the "License");
 *  *     you may not use this file except in compliance with the License.
 *  *     You may obtain a copy of the License at
 *  *
 *  *         http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *     Unless required by applicable law or agreed to in writing, software
 *  *     distributed under the License is distributed on an "AS IS" BASIS,
 *  *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *     See the License for the specific language governing permissions and
 *  *     limitations under the License.
 *  *
 *
 */

/* Add retail customers */
SET SESSION sql_mode='NO_AUTO_VALUE_ON_ZERO';

USE datacustodian;

INSERT INTO retail_customers (`id`,`description`,`published`,`self_link_href`,`self_link_rel`,`up_link_href`,`up_link_rel`,`updated`,`uuid`, enabled, username, first_name, last_name, password, role) VALUES (0, '', '2014-01-02 05:00:00', '/RetailCustomer/1','self','/RetailCustomer','up','2014-01-02 05:00:00','F06E8B03-0299-467E-972A-A883ECDCC575', TRUE, 'grace', 'Grace', 'Hopper', 'koala', 'ROLE_CUSTODIAN');
INSERT INTO retail_customers (`description`,`published`,`self_link_href`,`self_link_rel`,`up_link_href`,`up_link_rel`,`updated`,`uuid`, enabled, username, first_name, last_name, password, role) VALUES ('', '2014-01-02 05:00:00', '/RetailCustomer/1','self','/RetailCustomer','up','2014-01-02 05:00:00','106E8B03-0299-467E-972A-A883ECDCC575', TRUE, 'alan', 'Alan', 'Turing', 'koala', 'ROLE_USER');
INSERT INTO retail_customers (`description`,`published`,`self_link_href`,`self_link_rel`,`up_link_href`,`up_link_rel`,`updated`,`uuid`, enabled, username, first_name, last_name, password, role) VALUES ('', '2014-01-02 05:00:00', '/RetailCustomer/1','self','/RetailCustomer','up','2014-01-02 05:00:00','206E8B03-0299-467E-972A-A883ECDCC575', TRUE, 'donald', 'Donald', 'Knuth','koala', 'ROLE_USER');
INSERT INTO retail_customers (`description`,`published`,`self_link_href`,`self_link_rel`,`up_link_href`,`up_link_rel`,`updated`,`uuid`, enabled, username, first_name, last_name, password, role) VALUES ('', '2014-01-02 05:00:00', '/RetailCustomer/1','self','/RetailCustomer','up','2014-01-02 05:00:00','306E8B03-0299-467E-972A-A883ECDCC575', TRUE, 'paul', 'Paul', 'Dirac', 'koala', 'ROLE_USER');
INSERT INTO retail_customers (`description`,`published`,`self_link_href`,`self_link_rel`,`up_link_href`,`up_link_rel`,`updated`,`uuid`, enabled, username, first_name, last_name, password, role) VALUES ('', '2014-01-02 05:00:00', '/RetailCustomer/1','self','/RetailCustomer','up','2014-01-02 05:00:00','406E8B03-0299-467E-972A-A883ECDCC575', TRUE, 'alonzo', 'Alonzo', 'Church', 'koala', 'ROLE_USER');
INSERT INTO retail_customers (`description`,`published`,`self_link_href`,`self_link_rel`,`up_link_href`,`up_link_rel`,`updated`,`uuid`, enabled, username, first_name, last_name, password, role) VALUES ('', '2014-01-02 05:00:00', '/RetailCustomer/1','self','/RetailCustomer','up','2014-01-02 05:00:00','506E8B03-0299-467E-972A-A883ECDCC575', TRUE, 'charles', 'Charles', 'Babbage', 'koala', 'ROLE_USER');
INSERT INTO retail_customers (`description`,`published`,`self_link_href`,`self_link_rel`,`up_link_href`,`up_link_rel`,`updated`,`uuid`, enabled, username, first_name, last_name, password, role) VALUES ('', '2014-01-02 05:00:00', '/RetailCustomer/1','self','/RetailCustomer','up','2014-01-02 05:00:00','606E8B03-0299-467E-972A-A883ECDCC575', TRUE, 'john', 'John', 'von Neumann', 'koala', 'ROLE_USER');
INSERT INTO retail_customers (`description`,`published`,`self_link_href`,`self_link_rel`,`up_link_href`,`up_link_rel`,`updated`,`uuid`, enabled, username, first_name, last_name, password, role) VALUES ('', '2014-01-02 05:00:00', '/RetailCustomer/1','self','/RetailCustomer','up','2014-01-02 05:00:00','706E8B03-0299-467E-972A-A883ECDCC575', TRUE, 'marian', 'Marian', 'Rejewski', 'koala', 'ROLE_USER');
INSERT INTO retail_customers (`description`,`published`,`self_link_href`,`self_link_rel`,`up_link_href`,`up_link_rel`,`updated`,`uuid`, enabled, username, first_name, last_name, password, role) VALUES ('', '2014-01-02 05:00:00', '/RetailCustomer/1','self','/RetailCustomer','up','2014-01-02 05:00:00','806E8B03-0299-467E-972A-A883ECDCC575', TRUE, 'vinny', 'Vint', 'Koala', 'koala', 'ROLE_USER');
INSERT INTO retail_customers (`description`,`published`,`self_link_href`,`self_link_rel`,`up_link_href`,`up_link_rel`,`updated`,`uuid`, enabled, username, first_name, last_name, password, role) VALUES ('', '2014-01-02 05:00:00', '/RetailCustomer/1','self','/RetailCustomer','up','2014-01-02 05:00:00','906E8B03-0299-467E-972A-A883ECDCC575', TRUE, 'johnny', 'Johnny', 'Koala', 'koala', 'ROLE_USER');
INSERT INTO retail_customers (`description`,`published`,`self_link_href`,`self_link_rel`,`up_link_href`,`up_link_rel`,`updated`,`uuid`, enabled, username, first_name, last_name, password, role) VALUES ('', '2014-01-02 05:00:00', '/RetailCustomer/1','self','/RetailCustomer','up','2014-01-02 05:00:00','A06E8B03-0299-467E-972A-A883ECDCC575', TRUE, 'don', 'Don', 'Koala', 'koala', 'ROLE_USER');
INSERT INTO retail_customers (`description`,`published`,`self_link_href`,`self_link_rel`,`up_link_href`,`up_link_rel`,`updated`,`uuid`, enabled, username, first_name, last_name, password, role) VALUES ('', '2014-01-02 05:00:00', '/RetailCustomer/1','self','/RetailCustomer','up','2014-01-02 05:00:00','B06E8B03-0299-467E-972A-A883ECDCC575', TRUE, 'marty', 'Marty', 'Koala', 'koala', 'ROLE_USER');
INSERT INTO retail_customers (`description`,`published`,`self_link_href`,`self_link_rel`,`up_link_href`,`up_link_rel`,`updated`,`uuid`, enabled, username, first_name, last_name, password, role) VALUES ('', '2014-01-02 05:00:00', '/RetailCustomer/1','self','/RetailCustomer','up','2014-01-02 05:00:00','C06E8B03-0299-467E-972A-A883ECDCC575', TRUE, 'ron', 'Ron', 'Koala', 'koala', 'ROLE_USER');
INSERT INTO retail_customers (`description`,`published`,`self_link_href`,`self_link_rel`,`up_link_href`,`up_link_rel`,`updated`,`uuid`, enabled, username, first_name, last_name, password, role) VALUES ('', '2014-01-02 05:00:00', '/RetailCustomer/1','self','/RetailCustomer','up','2014-01-02 05:00:00','D06E8B03-0299-467E-972A-A883ECDCC575', TRUE, 'dave', 'Dave', 'Koala', 'koala', 'ROLE_USER');
INSERT INTO retail_customers (`description`,`published`,`self_link_href`,`self_link_rel`,`up_link_href`,`up_link_rel`,`updated`,`uuid`, enabled, username, first_name, last_name, password, role) VALUES ('', '2014-01-02 05:00:00', '/RetailCustomer/1','self','/RetailCustomer','up','2014-01-02 05:00:00','E06E8B03-0299-467E-972A-A883ECDCC575', TRUE, 'net0', 'net0', 'NIST', 'koala', 'ROLE_USER');