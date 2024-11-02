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

public val Simpleicons.Brenntag: ImageVector
    get() {
        if (_brenntag != null) {
            return _brenntag!!
        }
        _brenntag = Builder(name = "Brenntag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.73f, 12.01f)
                curveToRelative(-0.768f, 0.959f, -1.899f, 1.878f, -3.274f, 2.421f)
                curveToRelative(0.828f, 1.02f, 1.246f, 2.156f, 0.945f, 3.337f)
                curveToRelative(-0.287f, 1.128f, -1.365f, 2.228f, -2.9f, 2.228f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(-5.999f)
                horizontalLineToRelative(7.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, -3.139f, 7.0f, -6.998f)
                reflectiveCurveTo(17.36f, 0.0f, 13.5f, 0.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(8.998f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(3.999f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.655f, 0.0f, 3.0f, 1.344f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.345f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, -3.139f, 7.0f, -6.998f)
                curveToRelative(0.0f, -1.712f, -0.481f, -3.634f, -1.77f, -4.991f)
            }
        }
        .build()
        return _brenntag!!
    }

private var _brenntag: ImageVector? = null
