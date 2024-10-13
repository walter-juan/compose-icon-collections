package com.woowla.compose.icon.collections.devicons.devicons.pandas

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.PandasGroup

public val PandasGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF130754)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(90.25f, 0.0f)
                verticalLineToRelative(96.56f)
                horizontalLineToRelative(13.99f)
                lineTo(104.24f, 0.0f)
                lineTo(90.25f, 0.0f)
                close()
                moveTo(46.24f, 7.57f)
                verticalLineToRelative(29.05f)
                horizontalLineToRelative(13.99f)
                lineTo(60.22f, 7.57f)
                lineTo(46.24f, 7.57f)
                close()
                moveTo(23.76f, 31.45f)
                lineTo(23.76f, 128.0f)
                horizontalLineToRelative(13.99f)
                lineTo(37.75f, 31.44f)
                lineTo(23.76f, 31.44f)
                close()
                moveTo(68.25f, 31.48f)
                verticalLineToRelative(29.05f)
                horizontalLineToRelative(13.99f)
                lineTo(82.23f, 31.48f)
                lineTo(68.25f, 31.48f)
                close()
                moveTo(46.24f, 45.09f)
                verticalLineToRelative(13.7f)
                horizontalLineToRelative(13.99f)
                lineTo(60.22f, 45.09f)
                lineTo(46.24f, 45.09f)
                close()
                moveTo(46.24f, 67.24f)
                lineTo(46.24f, 96.28f)
                horizontalLineToRelative(13.99f)
                lineTo(60.22f, 67.23f)
                lineTo(46.24f, 67.23f)
                close()
                moveTo(68.25f, 69.01f)
                verticalLineToRelative(13.7f)
                horizontalLineToRelative(13.99f)
                lineTo(82.23f, 69.01f)
                lineTo(68.25f, 69.01f)
                close()
                moveTo(68.25f, 91.2f)
                verticalLineToRelative(29.05f)
                horizontalLineToRelative(13.99f)
                lineTo(82.23f, 91.2f)
                lineTo(68.25f, 91.2f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
