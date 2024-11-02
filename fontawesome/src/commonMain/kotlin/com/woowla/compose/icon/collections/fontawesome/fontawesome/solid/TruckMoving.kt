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

public val SolidGroup.TruckMoving: ImageVector
    get() {
        if (_truckMoving != null) {
            return _truckMoving!!
        }
        _truckMoving = Builder(name = "TruckMoving", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 304.0f)
                lineToRelative(0.0f, 80.0f)
                lineToRelative(0.0f, 16.0f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                curveToRelative(26.2f, 0.0f, 49.4f, -12.6f, 64.0f, -32.0f)
                curveToRelative(14.6f, 19.4f, 37.8f, 32.0f, 64.0f, 32.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, -35.8f, 80.0f, -80.0f)
                curveToRelative(0.0f, -5.5f, -0.6f, -10.8f, -1.6f, -16.0f)
                lineTo(416.0f, 384.0f)
                lineToRelative(33.6f, 0.0f)
                curveToRelative(-1.0f, 5.2f, -1.6f, 10.5f, -1.6f, 16.0f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                reflectiveCurveToRelative(80.0f, -35.8f, 80.0f, -80.0f)
                curveToRelative(0.0f, -5.5f, -0.6f, -10.8f, -1.6f, -16.0f)
                lineToRelative(1.6f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(0.0f, -16.0f)
                lineToRelative(0.0f, -10.3f)
                curveToRelative(0.0f, -9.2f, -3.2f, -18.2f, -9.0f, -25.3f)
                lineToRelative(-58.8f, -71.8f)
                curveToRelative(-10.6f, -13.0f, -26.5f, -20.5f, -43.3f, -20.5f)
                lineTo(480.0f, 144.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(585.0f, 256.0f)
                lineToRelative(-105.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(48.8f, 0.0f)
                curveToRelative(2.4f, 0.0f, 4.7f, 1.1f, 6.2f, 2.9f)
                lineTo(585.0f, 256.0f)
                close()
                moveTo(528.0f, 368.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(176.0f, 400.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(80.0f, 368.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _truckMoving!!
    }

private var _truckMoving: ImageVector? = null
