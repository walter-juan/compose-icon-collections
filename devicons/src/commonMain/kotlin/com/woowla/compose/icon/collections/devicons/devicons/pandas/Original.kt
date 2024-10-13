package com.woowla.compose.icon.collections.devicons.devicons.pandas

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.PandasGroup

public val PandasGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF130754)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(46.24f, 7.57f)
                horizontalLineToRelative(13.99f)
                verticalLineToRelative(29.05f)
                horizontalLineToRelative(-13.99f)
                close()
                moveTo(46.24f, 67.24f)
                horizontalLineToRelative(13.99f)
                lineTo(60.23f, 96.28f)
                horizontalLineToRelative(-13.99f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffca00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(46.24f, 45.09f)
                horizontalLineToRelative(13.99f)
                verticalLineToRelative(13.7f)
                horizontalLineToRelative(-13.99f)
                close()
            }
            path(fill = SolidColor(Color(0xFF130754)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.76f, 31.45f)
                horizontalLineToRelative(13.99f)
                lineTo(37.75f, 128.0f)
                horizontalLineToRelative(-13.99f)
                close()
                moveTo(68.25f, 91.2f)
                horizontalLineToRelative(13.99f)
                verticalLineToRelative(29.05f)
                horizontalLineToRelative(-13.99f)
                close()
                moveTo(68.25f, 31.48f)
                horizontalLineToRelative(13.99f)
                verticalLineToRelative(29.05f)
                horizontalLineToRelative(-13.99f)
                close()
            }
            path(fill = SolidColor(Color(0xFFe70488)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(68.25f, 69.01f)
                horizontalLineToRelative(13.99f)
                verticalLineToRelative(13.7f)
                horizontalLineToRelative(-13.99f)
                close()
            }
            path(fill = SolidColor(Color(0xFF130754)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(90.25f, 0.0f)
                horizontalLineToRelative(13.99f)
                verticalLineToRelative(96.55f)
                horizontalLineToRelative(-13.99f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
