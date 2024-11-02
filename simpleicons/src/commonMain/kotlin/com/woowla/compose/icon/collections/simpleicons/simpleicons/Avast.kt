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

public val Simpleicons.Avast: ImageVector
    get() {
        if (_avast != null) {
            return _avast!!
        }
        _avast = Builder(name = "Avast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.294f, 2.991f)
                arcToRelative(3.029f, 3.029f, 0.0f, false, true, 4.45f, 1.204f)
                lineToRelative(7.002f, 14.804f)
                arcToRelative(11.937f, 11.937f, 0.0f, false, false, 2.254f, -6.913f)
                curveTo(24.046f, 5.457f, 18.711f, 0.047f, 12.083f, 0.0f)
                curveTo(5.456f, -0.046f, 0.047f, 5.289f, 0.0f, 11.917f)
                arcToRelative(11.936f, 11.936f, 0.0f, false, false, 2.221f, 7.034f)
                lineToRelative(0.281f, -0.061f)
                lineToRelative(4.569f, -1.008f)
                curveToRelative(0.129f, -0.029f, 0.197f, 0.145f, 0.084f, 0.213f)
                lineTo(3.374f, 20.337f)
                arcToRelative(11.956f, 11.956f, 0.0f, false, false, 8.543f, 3.662f)
                curveToRelative(3.76f, 0.027f, 7.126f, -1.68f, 9.344f, -4.371f)
                lineTo(9.809f, 7.574f)
                arcToRelative(3.027f, 3.027f, 0.0f, false, true, 0.485f, -4.583f)
                close()
                moveTo(12.443f, 16.6f)
                lineTo(5.07f, 17.24f)
                arcToRelative(1.302f, 1.302f, 0.0f, true, true, 0.187f, -2.567f)
                lineToRelative(7.203f, 1.697f)
                curveToRelative(0.129f, 0.031f, 0.114f, 0.217f, -0.017f, 0.229f)
                close()
                moveTo(9.03f, 10.116f)
                lineToRelative(8.94f, 7.232f)
                curveToRelative(0.102f, 0.083f, 0.01f, 0.245f, -0.113f, 0.198f)
                lineTo(7.103f, 13.471f)
                arcToRelative(1.959f, 1.959f, 0.0f, true, true, 1.927f, -3.355f)
                close()
            }
        }
        .build()
        return _avast!!
    }

private var _avast: ImageVector? = null
