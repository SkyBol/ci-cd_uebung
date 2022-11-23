package com.example.demo.domain.blogpost.dto;

import com.example.demo.domain.authority.Authority;
import com.example.demo.domain.authority.dto.AuthorityDTO;
import com.example.demo.domain.blogpost.BlogPost;
import com.example.demo.domain.role.Role;
import com.example.demo.domain.role.dto.RoleDTO;
import com.example.demo.domain.user.User;
import com.example.demo.domain.user.dto.UserDTO;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-11T09:54:00+0100",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class BlogPostExtendedMapperImpl implements BlogPostExtendedMapper {

    @Override
    public BlogPost fromDTO(BlogPostExtendedDTO dto) {
        if ( dto == null ) {
            return null;
        }

        BlogPost blogPost = new BlogPost();

        blogPost.setId( dto.getId() );
        blogPost.setTitle( dto.getTitle() );
        blogPost.setText( dto.getText() );
        blogPost.setCategory( dto.getCategory() );
        blogPost.setUser( userDTOToUser( dto.getUser() ) );
        blogPost.setCreationTime( dto.getCreationTime() );
        blogPost.setEditTime( dto.getEditTime() );

        return blogPost;
    }

    @Override
    public List<BlogPost> fromDTOs(List<BlogPostExtendedDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<BlogPost> list = new ArrayList<BlogPost>( dtos.size() );
        for ( BlogPostExtendedDTO blogPostExtendedDTO : dtos ) {
            list.add( fromDTO( blogPostExtendedDTO ) );
        }

        return list;
    }

    @Override
    public Set<BlogPost> fromDTOs(Set<BlogPostExtendedDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<BlogPost> set = new LinkedHashSet<BlogPost>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( BlogPostExtendedDTO blogPostExtendedDTO : dtos ) {
            set.add( fromDTO( blogPostExtendedDTO ) );
        }

        return set;
    }

    @Override
    public BlogPostExtendedDTO toDTO(BlogPost BO) {
        if ( BO == null ) {
            return null;
        }

        BlogPostExtendedDTO blogPostExtendedDTO = new BlogPostExtendedDTO();

        blogPostExtendedDTO.setId( BO.getId() );
        blogPostExtendedDTO.setTitle( BO.getTitle() );
        blogPostExtendedDTO.setText( BO.getText() );
        blogPostExtendedDTO.setCategory( BO.getCategory() );
        blogPostExtendedDTO.setCreationTime( BO.getCreationTime() );
        blogPostExtendedDTO.setEditTime( BO.getEditTime() );
        blogPostExtendedDTO.setUser( userToUserDTO( BO.getUser() ) );

        return blogPostExtendedDTO;
    }

    @Override
    public List<BlogPostExtendedDTO> toDTOs(List<BlogPost> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<BlogPostExtendedDTO> list = new ArrayList<BlogPostExtendedDTO>( BOs.size() );
        for ( BlogPost blogPost : BOs ) {
            list.add( toDTO( blogPost ) );
        }

        return list;
    }

    @Override
    public Set<BlogPostExtendedDTO> toDTOs(Set<BlogPost> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<BlogPostExtendedDTO> set = new LinkedHashSet<BlogPostExtendedDTO>( Math.max( (int) ( BOs.size() / .75f ) + 1, 16 ) );
        for ( BlogPost blogPost : BOs ) {
            set.add( toDTO( blogPost ) );
        }

        return set;
    }

    protected Authority authorityDTOToAuthority(AuthorityDTO authorityDTO) {
        if ( authorityDTO == null ) {
            return null;
        }

        Authority authority = new Authority();

        authority.setId( authorityDTO.getId() );
        authority.setName( authorityDTO.getName() );

        return authority;
    }

    protected Set<Authority> authorityDTOSetToAuthoritySet(Set<AuthorityDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Authority> set1 = new LinkedHashSet<Authority>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( AuthorityDTO authorityDTO : set ) {
            set1.add( authorityDTOToAuthority( authorityDTO ) );
        }

        return set1;
    }

    protected Role roleDTOToRole(RoleDTO roleDTO) {
        if ( roleDTO == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( roleDTO.getId() );
        role.setName( roleDTO.getName() );
        role.setAuthorities( authorityDTOSetToAuthoritySet( roleDTO.getAuthorities() ) );

        return role;
    }

    protected Set<Role> roleDTOSetToRoleSet(Set<RoleDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Role> set1 = new LinkedHashSet<Role>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( RoleDTO roleDTO : set ) {
            set1.add( roleDTOToRole( roleDTO ) );
        }

        return set1;
    }

    protected User userDTOToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDTO.getId() );
        user.setFirstName( userDTO.getFirstName() );
        user.setLastName( userDTO.getLastName() );
        user.setEmail( userDTO.getEmail() );
        user.setRoles( roleDTOSetToRoleSet( userDTO.getRoles() ) );

        return user;
    }

    protected AuthorityDTO authorityToAuthorityDTO(Authority authority) {
        if ( authority == null ) {
            return null;
        }

        AuthorityDTO authorityDTO = new AuthorityDTO();

        authorityDTO.setId( authority.getId() );
        authorityDTO.setName( authority.getName() );

        return authorityDTO;
    }

    protected Set<AuthorityDTO> authoritySetToAuthorityDTOSet(Set<Authority> set) {
        if ( set == null ) {
            return null;
        }

        Set<AuthorityDTO> set1 = new LinkedHashSet<AuthorityDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Authority authority : set ) {
            set1.add( authorityToAuthorityDTO( authority ) );
        }

        return set1;
    }

    protected RoleDTO roleToRoleDTO(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setId( role.getId() );
        roleDTO.setName( role.getName() );
        roleDTO.setAuthorities( authoritySetToAuthorityDTOSet( role.getAuthorities() ) );

        return roleDTO;
    }

    protected Set<RoleDTO> roleSetToRoleDTOSet(Set<Role> set) {
        if ( set == null ) {
            return null;
        }

        Set<RoleDTO> set1 = new LinkedHashSet<RoleDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Role role : set ) {
            set1.add( roleToRoleDTO( role ) );
        }

        return set1;
    }

    protected UserDTO userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( user.getId() );
        userDTO.setFirstName( user.getFirstName() );
        userDTO.setLastName( user.getLastName() );
        userDTO.setEmail( user.getEmail() );
        userDTO.setRoles( roleSetToRoleDTOSet( user.getRoles() ) );

        return userDTO;
    }
}
