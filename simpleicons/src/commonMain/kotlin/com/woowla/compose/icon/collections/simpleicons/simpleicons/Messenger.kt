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

public val Simpleicons.Messenger: ImageVector
    get() {
        if (_messenger != null) {
            return _messenger!!
        }
        _messenger = Builder(name = "Messenger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.24f, 0.0f, 0.0f, 4.952f, 0.0f, 11.64f)
                curveToRelative(0.0f, 3.499f, 1.434f, 6.521f, 3.769f, 8.61f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.323f, 0.683f)
                lineToRelative(0.065f, 2.135f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, false, 1.347f, 0.85f)
                lineToRelative(2.381f, -1.053f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.641f, -0.046f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 12.0f, 23.28f)
                curveToRelative(6.76f, 0.0f, 12.0f, -4.952f, 12.0f, -11.64f)
                reflectiveCurveTo(18.76f, 0.0f, 12.0f, 0.0f)
                moveToRelative(6.806f, 7.44f)
                curveToRelative(0.522f, -0.03f, 0.971f, 0.567f, 0.63f, 1.094f)
                lineToRelative(-4.178f, 6.457f)
                arcToRelative(0.707f, 0.707f, 0.0f, false, true, -0.977f, 0.208f)
                lineToRelative(-3.87f, -2.504f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, false, -0.49f, 0.007f)
                lineToRelative(-4.363f, 3.01f)
                curveToRelative(-0.637f, 0.438f, -1.415f, -0.317f, -0.995f, -0.966f)
                lineToRelative(4.179f, -6.457f)
                arcToRelative(0.706f, 0.706f, 0.0f, false, true, 0.977f, -0.21f)
                lineToRelative(3.87f, 2.505f)
                curveToRelative(0.15f, 0.097f, 0.344f, 0.094f, 0.491f, -0.007f)
                lineToRelative(4.362f, -3.008f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, 0.364f, -0.13f)
            }
        }
        .build()
        return _messenger!!
    }

private var _messenger: ImageVector? = null
