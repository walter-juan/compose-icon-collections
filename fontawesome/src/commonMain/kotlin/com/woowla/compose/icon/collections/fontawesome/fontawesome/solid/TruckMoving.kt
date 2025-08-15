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
                lineTo(0.0f, 424.0f)
                curveToRelative(0.0f, 48.6f, 39.4f, 88.0f, 88.0f, 88.0f)
                curveToRelative(25.2f, 0.0f, 48.0f, -10.6f, 64.0f, -27.6f)
                curveToRelative(16.0f, 17.0f, 38.8f, 27.6f, 64.0f, 27.6f)
                curveToRelative(40.3f, 0.0f, 74.2f, -27.1f, 84.7f, -64.0f)
                lineToRelative(134.6f, 0.0f)
                curveToRelative(10.4f, 36.9f, 44.4f, 64.0f, 84.7f, 64.0f)
                curveToRelative(43.0f, 0.0f, 78.9f, -30.9f, 86.5f, -71.7f)
                curveToRelative(20.0f, -10.8f, 33.5f, -32.0f, 33.5f, -56.3f)
                lineToRelative(0.0f, -146.7f)
                curveToRelative(0.0f, -17.0f, -6.7f, -33.3f, -18.7f, -45.3f)
                lineTo(576.0f, 146.7f)
                curveToRelative(-12.0f, -12.0f, -28.3f, -18.7f, -45.3f, -18.7f)
                lineToRelative(-50.7f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(480.0f, 192.0f)
                lineToRelative(50.7f, 0.0f)
                lineToRelative(45.3f, 45.3f)
                lineToRelative(0.0f, 50.7f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                close()
                moveTo(88.0f, 384.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, 80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, -80.0f)
                close()
                moveTo(480.0f, 424.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 80.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -80.0f, 0.0f)
                close()
                moveTo(216.0f, 384.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, 80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, -80.0f)
                close()
            }
        }
        .build()
        return _truckMoving!!
    }

private var _truckMoving: ImageVector? = null
