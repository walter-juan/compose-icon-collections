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

public val Simpleicons.Hp: ImageVector
    get() {
        if (_hp != null) {
            return _hp!!
        }
        _hp = Builder(name = "Hp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.007f, 24.0f)
                horizontalLineToRelative(-0.357f)
                lineToRelative(2.459f, -6.745f)
                horizontalLineToRelative(3.38f)
                curveToRelative(0.591f, 0.0f, 1.236f, -0.453f, 1.442f, -1.017f)
                lineToRelative(2.665f, -7.308f)
                curveToRelative(0.44f, -1.195f, -0.247f, -2.171f, -1.525f, -2.171f)
                horizontalLineToRelative(-4.698f)
                lineToRelative(-3.929f, 10.798f)
                lineToRelative(-2.226f, 6.127f)
                curveTo(3.929f, 22.434f, 0.0f, 17.681f, 0.0f, 12.007f)
                curveTo(0.0f, 6.498f, 3.709f, 1.855f, 8.765f, 0.44f)
                lineTo(6.47f, 6.759f)
                lineTo(2.651f, 17.255f)
                horizontalLineToRelative(2.542f)
                lineTo(8.449f, 8.339f)
                horizontalLineToRelative(1.91f)
                lineToRelative(-3.256f, 8.916f)
                horizontalLineTo(9.644f)
                lineToRelative(3.022f, -8.325f)
                curveToRelative(0.44f, -1.195f, -0.247f, -2.171f, -1.525f, -2.171f)
                horizontalLineToRelative(-2.143f)
                lineToRelative(2.459f, -6.745f)
                curveTo(11.636f, 0.0f, 11.814f, 0.0f, 11.993f, 0.0f)
                curveTo(18.628f, 0.0f, 24.0f, 5.372f, 24.0f, 12.007f)
                curveToRelative(0.014f, 6.622f, -5.358f, 11.993f, -11.993f, 11.993f)
                close()
                moveTo(19.274f, 8.325f)
                horizontalLineToRelative(-1.91f)
                lineToRelative(-2.679f, 7.336f)
                horizontalLineToRelative(1.91f)
                lineToRelative(2.679f, -7.336f)
                close()
            }
        }
        .build()
        return _hp!!
    }

private var _hp: ImageVector? = null
