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

public val SolidGroup.FunnelDollar: ImageVector
    get() {
        if (_funnelDollar != null) {
            return _funnelDollar!!
        }
        _funnelDollar = Builder(name = "FunnelDollar", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 64.0f)
                curveTo(19.1f, 64.0f, 7.4f, 71.8f, 2.4f, 83.8f)
                reflectiveCurveTo(0.2f, 109.5f, 9.4f, 118.6f)
                lineTo(192.0f, 301.3f)
                lineTo(192.0f, 416.0f)
                curveToRelative(0.0f, 8.5f, 3.4f, 16.6f, 9.4f, 22.6f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(2.5f, 2.5f, 5.3f, 4.5f, 8.3f, 6.0f)
                curveToRelative(-21.2f, -30.9f, -33.6f, -68.3f, -33.6f, -108.6f)
                curveToRelative(0.0f, -99.4f, 75.5f, -181.1f, 172.3f, -191.0f)
                lineToRelative(90.4f, -90.4f)
                curveToRelative(9.2f, -9.2f, 11.9f, -22.9f, 6.9f, -34.9f)
                reflectiveCurveTo(492.9f, 64.0f, 480.0f, 64.0f)
                lineTo(32.0f, 64.0f)
                close()
                moveTo(576.0f, 400.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, -288.0f, 0.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 288.0f, 0.0f)
                close()
                moveTo(416.0f, 320.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 8.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                lineToRelative(-45.8f, 0.0f)
                curveToRelative(-5.6f, 0.0f, -10.2f, 4.6f, -10.2f, 10.2f)
                curveToRelative(0.0f, 4.9f, 3.5f, 9.1f, 8.3f, 10.0f)
                lineToRelative(45.0f, 8.2f)
                curveToRelative(20.0f, 3.6f, 34.6f, 21.1f, 34.6f, 41.5f)
                curveToRelative(0.0f, 23.3f, -18.9f, 42.2f, -42.2f, 42.2f)
                lineToRelative(-5.8f, 0.0f)
                lineToRelative(0.0f, 8.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -8.0f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                lineToRelative(53.8f, 0.0f)
                curveToRelative(5.6f, 0.0f, 10.2f, -4.6f, 10.2f, -10.2f)
                curveToRelative(0.0f, -4.9f, -3.5f, -9.1f, -8.3f, -10.0f)
                lineToRelative(-45.0f, -8.2f)
                curveToRelative(-20.0f, -3.6f, -34.6f, -21.1f, -34.6f, -41.5f)
                curveToRelative(0.0f, -22.6f, 17.7f, -41.0f, 40.0f, -42.1f)
                lineToRelative(0.0f, -8.1f)
                close()
            }
        }
        .build()
        return _funnelDollar!!
    }

private var _funnelDollar: ImageVector? = null
