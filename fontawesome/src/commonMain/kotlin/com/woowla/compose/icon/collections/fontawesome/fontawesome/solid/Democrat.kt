package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Democrat: ImageVector
    get() {
        if (_democrat != null) {
            return _democrat!!
        }
        _democrat = Builder(name = "Democrat", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveToRelative(0.0f, -8.9f, 3.8f, -20.9f, 6.2f, -27.3f)
                curveToRelative(1.0f, -2.8f, 3.8f, -4.7f, 6.8f, -4.7f)
                curveToRelative(1.9f, 0.0f, 3.8f, 0.7f, 5.2f, 2.1f)
                lineTo(128.0f, 45.7f)
                lineTo(173.8f, 2.1f)
                curveToRelative(1.4f, -1.3f, 3.2f, -2.1f, 5.2f, -2.1f)
                curveToRelative(3.0f, 0.0f, 5.8f, 1.8f, 6.8f, 4.7f)
                curveToRelative(2.4f, 6.5f, 6.2f, 18.4f, 6.2f, 27.3f)
                curveToRelative(0.0f, 26.5f, -21.9f, 42.0f, -29.5f, 46.6f)
                lineToRelative(76.2f, 72.6f)
                curveToRelative(6.0f, 5.7f, 13.9f, 8.8f, 22.1f, 8.8f)
                lineToRelative(219.2f, 0.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(40.3f, 0.0f, 78.2f, 19.0f, 102.4f, 51.2f)
                lineToRelative(19.2f, 25.6f)
                curveToRelative(10.6f, 14.1f, 7.7f, 34.2f, -6.4f, 44.8f)
                reflectiveCurveToRelative(-34.2f, 7.7f, -44.8f, -6.4f)
                lineToRelative(-19.2f, -25.6f)
                curveToRelative(-5.3f, -7.0f, -11.8f, -12.8f, -19.2f, -17.0f)
                lineToRelative(0.0f, 87.4f)
                lineToRelative(-352.0f, 0.0f)
                lineToRelative(-40.4f, -94.3f)
                curveToRelative(-3.9f, -9.2f, -15.3f, -12.6f, -23.6f, -7.0f)
                lineToRelative(-42.1f, 28.0f)
                curveToRelative(-9.1f, 6.1f, -19.7f, 9.3f, -30.7f, 9.3f)
                lineToRelative(-2.0f, 0.0f)
                curveTo(23.9f, 256.0f, 0.0f, 232.1f, 0.0f, 202.7f)
                curveTo(0.0f, 190.6f, 4.1f, 178.9f, 11.7f, 169.4f)
                lineTo(87.6f, 74.6f)
                curveTo(78.1f, 67.4f, 64.0f, 53.2f, 64.0f, 32.0f)
                close()
                moveTo(544.0f, 352.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-160.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -128.0f)
                lineToRelative(352.0f, 0.0f)
                close()
                moveTo(256.0f, 280.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
                moveTo(504.0f, 256.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
                moveTo(368.0f, 280.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
            }
        }
        .build()
        return _democrat!!
    }

private var _democrat: ImageVector? = null
