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

public val SolidGroup.Passport: ImageVector
    get() {
        if (_passport != null) {
            return _passport!!
        }
        _passport = Builder(name = "Passport", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 28.7f, 28.7f, 0.0f, 64.0f, 0.0f)
                lineTo(320.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 384.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 64.0f)
                close()
                moveTo(96.0f, 408.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(144.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-144.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                close()
                moveTo(278.6f, 208.0f)
                curveToRelative(-4.8f, 26.4f, -21.5f, 48.7f, -44.2f, 61.2f)
                curveToRelative(6.7f, -17.0f, 11.2f, -38.0f, 12.6f, -61.2f)
                lineToRelative(31.6f, 0.0f)
                close()
                moveTo(105.5f, 208.0f)
                lineToRelative(31.6f, 0.0f)
                curveToRelative(1.4f, 23.1f, 6.0f, 44.2f, 12.6f, 61.2f)
                curveToRelative(-22.7f, -12.5f, -39.4f, -34.8f, -44.2f, -61.2f)
                close()
                moveTo(181.9f, 263.0f)
                curveToRelative(-6.2f, -13.4f, -11.1f, -32.5f, -12.7f, -55.0f)
                lineToRelative(45.8f, 0.0f)
                curveToRelative(-1.6f, 22.5f, -6.5f, 41.6f, -12.7f, 55.0f)
                curveToRelative(-4.5f, 9.6f, -8.2f, 13.8f, -10.2f, 15.5f)
                curveToRelative(-2.0f, -1.7f, -5.7f, -5.8f, -10.2f, -15.5f)
                close()
                moveTo(181.9f, 121.0f)
                curveToRelative(4.5f, -9.6f, 8.2f, -13.8f, 10.2f, -15.5f)
                curveToRelative(2.0f, 1.7f, 5.7f, 5.8f, 10.2f, 15.5f)
                curveToRelative(6.2f, 13.4f, 11.1f, 32.5f, 12.7f, 55.0f)
                lineToRelative(-45.8f, 0.0f)
                curveToRelative(1.6f, -22.5f, 6.5f, -41.6f, 12.7f, -55.0f)
                close()
                moveTo(278.6f, 176.0f)
                lineTo(247.0f, 176.0f)
                curveToRelative(-1.4f, -23.1f, -6.0f, -44.2f, -12.6f, -61.2f)
                curveToRelative(22.7f, 12.5f, 39.4f, 34.8f, 44.2f, 61.2f)
                close()
                moveTo(137.0f, 176.0f)
                lineToRelative(-31.6f, 0.0f)
                curveToRelative(4.8f, -26.4f, 21.5f, -48.7f, 44.2f, -61.2f)
                curveToRelative(-6.7f, 17.0f, -11.2f, 38.0f, -12.6f, 61.2f)
                close()
                moveTo(320.0f, 192.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, -256.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 256.0f, 0.0f)
                close()
            }
        }
        .build()
        return _passport!!
    }

private var _passport: ImageVector? = null
