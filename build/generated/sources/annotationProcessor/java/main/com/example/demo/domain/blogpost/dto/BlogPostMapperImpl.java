package com.example.demo.domain.blogpost.dto;

import com.example.demo.domain.blogpost.BlogPost;
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
public class BlogPostMapperImpl implements BlogPostMapper {

    @Override
    public BlogPost fromDTO(BlogPostDTO dto) {
        if ( dto == null ) {
            return null;
        }

        BlogPost blogPost = new BlogPost();

        blogPost.setId( dto.getId() );
        blogPost.setTitle( dto.getTitle() );
        blogPost.setText( dto.getText() );
        blogPost.setCategory( dto.getCategory() );

        return blogPost;
    }

    @Override
    public List<BlogPost> fromDTOs(List<BlogPostDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<BlogPost> list = new ArrayList<BlogPost>( dtos.size() );
        for ( BlogPostDTO blogPostDTO : dtos ) {
            list.add( fromDTO( blogPostDTO ) );
        }

        return list;
    }

    @Override
    public Set<BlogPost> fromDTOs(Set<BlogPostDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<BlogPost> set = new LinkedHashSet<BlogPost>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( BlogPostDTO blogPostDTO : dtos ) {
            set.add( fromDTO( blogPostDTO ) );
        }

        return set;
    }

    @Override
    public BlogPostDTO toDTO(BlogPost BO) {
        if ( BO == null ) {
            return null;
        }

        BlogPostDTO blogPostDTO = new BlogPostDTO();

        blogPostDTO.setId( BO.getId() );
        blogPostDTO.setTitle( BO.getTitle() );
        blogPostDTO.setText( BO.getText() );
        blogPostDTO.setCategory( BO.getCategory() );

        return blogPostDTO;
    }

    @Override
    public List<BlogPostDTO> toDTOs(List<BlogPost> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<BlogPostDTO> list = new ArrayList<BlogPostDTO>( BOs.size() );
        for ( BlogPost blogPost : BOs ) {
            list.add( toDTO( blogPost ) );
        }

        return list;
    }

    @Override
    public Set<BlogPostDTO> toDTOs(Set<BlogPost> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<BlogPostDTO> set = new LinkedHashSet<BlogPostDTO>( Math.max( (int) ( BOs.size() / .75f ) + 1, 16 ) );
        for ( BlogPost blogPost : BOs ) {
            set.add( toDTO( blogPost ) );
        }

        return set;
    }
}
