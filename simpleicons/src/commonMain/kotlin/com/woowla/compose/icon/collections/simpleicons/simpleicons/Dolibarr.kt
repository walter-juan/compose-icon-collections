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

public val Simpleicons.Dolibarr: ImageVector
    get() {
        if (_dolibarr != null) {
            return _dolibarr!!
        }
        _dolibarr = Builder(name = "Dolibarr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.275f, 0.0f)
                arcToRelative(3.18f, 3.168f, 0.0f, false, false, -3.18f, 3.169f)
                arcToRelative(3.18f, 3.168f, 0.0f, false, false, 3.18f, 3.168f)
                arcToRelative(3.18f, 3.168f, 0.0f, false, false, 3.18f, -3.168f)
                arcTo(3.18f, 3.168f, 0.0f, false, false, 20.275f, 0.0f)
                close()
                moveTo(0.545f, 0.353f)
                verticalLineToRelative(23.645f)
                horizontalLineTo(7.63f)
                lineTo(7.64f, 7.104f)
                horizontalLineToRelative(2.395f)
                curveToRelative(4.066f, 0.0f, 6.099f, 1.602f, 6.099f, 4.806f)
                curveToRelative(0.0f, 3.41f, -2.068f, 5.115f, -6.204f, 5.115f)
                horizontalLineTo(8.794f)
                verticalLineToRelative(6.97f)
                reflectiveCurveToRelative(1.683f, 0.005f, 2.114f, 0.005f)
                curveToRelative(3.67f, 0.0f, 6.67f, -1.125f, 9.0f, -3.376f)
                curveToRelative(2.33f, -2.25f, 3.495f, -5.155f, 3.495f, -8.714f)
                curveToRelative(0.0f, -2.072f, -0.423f, -3.903f, -1.268f, -5.493f)
                arcToRelative(3.803f, 3.803f, 0.0f, false, true, -1.86f, 0.495f)
                curveToRelative(-0.982f, 0.0f, -1.96f, -0.403f, -2.654f, -1.096f)
                arcToRelative(3.782f, 3.782f, 0.0f, false, true, -1.1f, -2.647f)
                curveToRelative(0.0f, -0.533f, 0.12f, -1.063f, 0.34f, -1.548f)
                curveTo(14.913f, 0.776f, 12.557f, 0.353f, 9.79f, 0.353f)
                close()
            }
        }
        .build()
        return _dolibarr!!
    }

private var _dolibarr: ImageVector? = null
