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

public val SolidGroup.Tractor: ImageVector
    get() {
        if (_tractor != null) {
            return _tractor!!
        }
        _tractor = Builder(name = "Tractor", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 96.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(133.4f, 0.0f)
                lineToRelative(-57.6f, -96.0f)
                lineToRelative(-75.8f, 0.0f)
                close()
                moveTo(96.0f, 223.0f)
                lineTo(96.0f, 64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(107.8f, 0.0f)
                curveToRelative(22.5f, 0.0f, 43.3f, 11.8f, 54.9f, 31.1f)
                lineToRelative(77.4f, 128.9f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -72.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 72.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 41.5f)
                curveToRelative(0.0f, 14.2f, -6.3f, 27.8f, -17.3f, 36.9f)
                lineToRelative(-35.0f, 29.2f)
                curveToRelative(26.5f, 15.2f, 44.3f, 43.7f, 44.3f, 76.4f)
                curveToRelative(0.0f, 48.6f, -39.4f, 88.0f, -88.0f, 88.0f)
                reflectiveCurveToRelative(-88.0f, -39.4f, -88.0f, -88.0f)
                curveToRelative(0.0f, -14.4f, 3.5f, -28.0f, 9.6f, -40.0f)
                lineToRelative(-101.2f, 0.0f)
                curveToRelative(-3.0f, 13.4f, -7.9f, 26.0f, -14.4f, 37.7f)
                curveToRelative(7.7f, 9.4f, 7.2f, 23.4f, -1.6f, 32.2f)
                lineToRelative(-22.6f, 22.6f)
                curveToRelative(-8.8f, 8.8f, -22.7f, 9.3f, -32.2f, 1.6f)
                curveToRelative(-9.3f, 5.2f, -19.3f, 9.3f, -29.8f, 12.3f)
                curveToRelative(-1.2f, 12.1f, -11.4f, 21.6f, -23.9f, 21.6f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-12.4f, 0.0f, -22.7f, -9.5f, -23.9f, -21.6f)
                curveToRelative(-10.5f, -3.0f, -20.4f, -7.2f, -29.8f, -12.3f)
                curveToRelative(-9.4f, 7.7f, -23.4f, 7.2f, -32.2f, -1.6f)
                lineTo(35.5f, 453.8f)
                curveToRelative(-8.8f, -8.8f, -9.3f, -22.7f, -1.6f, -32.2f)
                curveToRelative(-5.2f, -9.3f, -9.3f, -19.3f, -12.3f, -29.8f)
                curveToRelative(-12.1f, -1.2f, -21.6f, -11.4f, -21.6f, -23.9f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -12.4f, 9.5f, -22.7f, 21.6f, -23.9f)
                curveToRelative(3.0f, -10.5f, 7.2f, -20.4f, 12.3f, -29.8f)
                curveToRelative(-7.7f, -9.4f, -7.2f, -23.4f, 1.6f, -32.2f)
                lineToRelative(22.6f, -22.6f)
                curveToRelative(8.8f, -8.8f, 22.7f, -9.3f, 32.2f, -1.6f)
                curveToRelative(1.9f, -1.0f, 3.7f, -2.0f, 5.7f, -3.0f)
                close()
                moveTo(160.0f, 288.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 0.0f, 128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 0.0f, -128.0f)
                close()
                moveTo(440.0f, 424.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 80.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -80.0f, 0.0f)
                close()
            }
        }
        .build()
        return _tractor!!
    }

private var _tractor: ImageVector? = null
