package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.BloggerFill: ImageVector
    get() {
        if (_bloggerFill != null) {
            return _bloggerFill!!
        }
        _bloggerFill = Builder(name = "BloggerFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.822f, 9.729f)
                horizontalLineTo(18.729f)
                curveTo(18.14f, 9.729f, 17.635f, 9.224f, 17.635f, 8.635f)
                curveTo(17.635f, 5.523f, 15.112f, 3.0f, 12.0f, 3.0f)
                horizontalLineTo(8.636f)
                curveTo(5.523f, 3.0f, 3.0f, 5.523f, 3.0f, 8.635f)
                verticalLineTo(15.364f)
                curveTo(3.0f, 18.476f, 5.523f, 21.0f, 8.636f, 21.0f)
                horizontalLineTo(15.365f)
                curveTo(18.477f, 21.0f, 21.0f, 18.476f, 21.0f, 15.364f)
                verticalLineTo(10.906f)
                curveTo(21.0f, 10.233f, 20.495f, 9.729f, 19.822f, 9.729f)
                close()
                moveTo(8.551f, 7.542f)
                horizontalLineTo(12.589f)
                curveTo(13.178f, 7.542f, 13.682f, 8.046f, 13.682f, 8.635f)
                curveTo(13.682f, 9.224f, 13.178f, 9.729f, 12.589f, 9.729f)
                horizontalLineTo(8.551f)
                curveTo(7.963f, 9.729f, 7.458f, 9.224f, 7.458f, 8.635f)
                curveTo(7.458f, 8.046f, 7.963f, 7.542f, 8.551f, 7.542f)
                close()
                moveTo(15.449f, 16.458f)
                horizontalLineTo(8.636f)
                curveTo(8.047f, 16.458f, 7.542f, 15.953f, 7.542f, 15.364f)
                curveTo(7.542f, 14.775f, 8.047f, 14.271f, 8.636f, 14.271f)
                horizontalLineTo(15.449f)
                curveTo(16.037f, 14.271f, 16.542f, 14.775f, 16.542f, 15.364f)
                curveTo(16.542f, 15.953f, 16.037f, 16.458f, 15.449f, 16.458f)
                close()
            }
        }
        .build()
        return _bloggerFill!!
    }

private var _bloggerFill: ImageVector? = null
