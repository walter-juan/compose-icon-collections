package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Magic: ImageVector
    get() {
        if (_magic != null) {
            return _magic!!
        }
        _magic = Builder(name = "Magic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(29.658f, 29.658f, 0.0f, false, true, -3.611f, 3.53f)
                arcTo(27.326f, 27.326f, 0.0f, false, true, 9.729f, 12.0f)
                curveToRelative(0.0f, 2.948f, -0.47f, 5.792f, -1.34f, 8.47f)
                arcTo(29.658f, 29.658f, 0.0f, false, true, 12.0f, 24.0f)
                arcToRelative(29.658f, 29.658f, 0.0f, false, true, 3.611f, -3.53f)
                arcToRelative(27.326f, 27.326f, 0.0f, false, true, -1.34f, -8.47f)
                curveToRelative(0.0f, -2.948f, 0.47f, -5.792f, 1.34f, -8.47f)
                arcTo(29.658f, 29.658f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(18.109f, 5.381f)
                arcTo(27.362f, 27.362f, 0.0f, false, false, 17.3f, 12.0f)
                curveToRelative(0.0f, 2.278f, 0.28f, 4.494f, 0.809f, 6.619f)
                arcToRelative(30.696f, 30.696f, 0.0f, false, true, 4.391f, -2.424f)
                arcTo(13.662f, 13.662f, 0.0f, false, true, 21.843f, 12.0f)
                curveToRelative(0.0f, -1.46f, 0.23f, -2.868f, 0.657f, -4.195f)
                arcToRelative(30.698f, 30.698f, 0.0f, false, true, -4.391f, -2.424f)
                close()
                moveTo(5.891f, 5.381f)
                arcTo(30.7f, 30.7f, 0.0f, false, true, 1.5f, 7.805f)
                curveToRelative(0.427f, 1.327f, 0.657f, 2.736f, 0.657f, 4.195f)
                curveToRelative(0.0f, 1.46f, -0.23f, 2.868f, -0.657f, 4.195f)
                arcToRelative(30.696f, 30.696f, 0.0f, false, true, 4.391f, 2.424f)
                curveTo(6.42f, 16.494f, 6.7f, 14.278f, 6.7f, 12.0f)
                curveToRelative(0.0f, -2.278f, -0.28f, -4.494f, -0.809f, -6.619f)
                close()
            }
        }
        .build()
        return _magic!!
    }

private var _magic: ImageVector? = null
