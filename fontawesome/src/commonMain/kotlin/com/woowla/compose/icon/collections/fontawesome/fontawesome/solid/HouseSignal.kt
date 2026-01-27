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

public val SolidGroup.HouseSignal: ImageVector
    get() {
        if (_houseSignal != null) {
            return _houseSignal!!
        }
        _houseSignal = Builder(name = "HouseSignal", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(515.9f, 240.0f)
                lineToRelative(-19.9f, 0.0f)
                lineToRelative(0.0f, 144.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineToRelative(-137.0f, 0.0f)
                curveToRelative(-24.0f, -91.7f, -93.5f, -165.0f, -183.0f, -194.3f)
                lineToRelative(0.0f, -13.7f)
                lineToRelative(-19.9f, 0.0f)
                curveToRelative(-15.5f, 0.0f, -28.1f, -12.6f, -28.1f, -28.1f)
                curveToRelative(0.0f, -7.6f, 3.1f, -14.9f, 8.6f, -20.2f)
                lineTo(276.5f, -4.9f)
                curveTo(283.9f, -12.0f, 293.7f, -16.0f, 304.0f, -16.0f)
                reflectiveCurveToRelative(20.1f, 4.0f, 27.5f, 11.1f)
                lineTo(535.4f, 191.7f)
                curveToRelative(5.5f, 5.3f, 8.6f, 12.6f, 8.6f, 20.2f)
                curveToRelative(0.0f, 15.5f, -12.6f, 28.1f, -28.1f, 28.1f)
                close()
                moveTo(280.0f, 192.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-48.0f, 0.0f)
                close()
                moveTo(24.0f, 288.0f)
                curveToRelative(128.1f, 0.0f, 232.0f, 103.9f, 232.0f, 232.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                curveToRelative(0.0f, -101.6f, -82.4f, -184.0f, -184.0f, -184.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(32.0f, 480.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(0.0f, 408.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                curveToRelative(75.1f, 0.0f, 136.0f, 60.9f, 136.0f, 136.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                curveToRelative(0.0f, -48.6f, -39.4f, -88.0f, -88.0f, -88.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _houseSignal!!
    }

private var _houseSignal: ImageVector? = null
