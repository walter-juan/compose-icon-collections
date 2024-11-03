package com.woowla.compose.icon.collections.twbs.twbs

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
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Cast: ImageVector
    get() {
        if (_cast != null) {
            return _cast!!
        }
        _cast = Builder(name = "Cast", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.646f, 9.354f)
                lineToRelative(-3.792f, 3.792f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.353f, 0.854f)
                horizontalLineToRelative(7.586f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.354f, -0.854f)
                lineTo(8.354f, 9.354f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.414f, 11.0f)
                horizontalLineTo(14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(3.086f)
                lineToRelative(-1.0f, 1.0f)
                horizontalLineTo(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 10.5f)
                verticalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.5f, 2.0f)
                horizontalLineToRelative(13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 3.5f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-2.086f)
                close()
            }
        }
        .build()
        return _cast!!
    }

private var _cast: ImageVector? = null
