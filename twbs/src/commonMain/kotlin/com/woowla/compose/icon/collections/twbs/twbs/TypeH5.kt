package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.TypeH5: ImageVector
    get() {
        if (_typeH5 != null) {
            return _typeH5!!
        }
        _typeH5 = Builder(name = "TypeH5", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 10.516f)
                horizontalLineToRelative(1.264f)
                curveToRelative(0.193f, 0.976f, 1.112f, 1.364f, 2.01f, 1.364f)
                curveToRelative(1.005f, 0.0f, 2.067f, -0.782f, 2.067f, -2.247f)
                curveToRelative(0.0f, -1.292f, -0.983f, -2.082f, -2.089f, -2.082f)
                curveToRelative(-1.012f, 0.0f, -1.658f, 0.596f, -1.924f, 1.077f)
                horizontalLineToRelative(-1.12f)
                lineTo(9.646f, 3.0f)
                horizontalLineToRelative(5.535f)
                verticalLineToRelative(1.141f)
                horizontalLineToRelative(-4.415f)
                lineTo(10.5f, 7.28f)
                horizontalLineToRelative(0.072f)
                curveToRelative(0.201f, -0.316f, 0.883f, -0.84f, 1.967f, -0.84f)
                curveToRelative(1.709f, 0.0f, 3.13f, 1.177f, 3.13f, 3.158f)
                curveToRelative(0.0f, 2.025f, -1.407f, 3.403f, -3.475f, 3.403f)
                curveToRelative(-1.809f, 0.0f, -3.1f, -1.048f, -3.194f, -2.484f)
                close()
                moveTo(7.495f, 13.0f)
                verticalLineTo(3.201f)
                horizontalLineTo(6.174f)
                verticalLineToRelative(4.15f)
                horizontalLineTo(1.32f)
                verticalLineTo(3.2f)
                horizontalLineTo(0.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(1.32f)
                verticalLineTo(8.512f)
                horizontalLineToRelative(4.854f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _typeH5!!
    }

private var _typeH5: ImageVector? = null
