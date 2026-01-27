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

public val SolidGroup.PlaneArrival: ImageVector
    get() {
        if (_planeArrival != null) {
            return _planeArrival!!
        }
        _planeArrival = Builder(name = "PlaneArrival", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(386.6f, 193.1f)
                lineTo(265.9f, 3.7f)
                curveToRelative(-4.8f, -7.6f, -12.6f, -12.8f, -21.4f, -14.3f)
                lineToRelative(-43.1f, -7.6f)
                curveToRelative(-10.8f, -1.9f, -20.2f, 7.3f, -18.6f, 18.1f)
                lineToRelative(24.0f, 161.6f)
                lineToRelative(-105.0f, -18.5f)
                lineToRelative(-33.8f, -61.8f)
                curveTo(64.5f, 74.7f, 58.2f, 70.2f, 51.1f, 69.0f)
                lineTo(34.0f, 66.0f)
                curveToRelative(-9.8f, -1.7f, -18.8f, 5.9f, -18.8f, 15.8f)
                lineToRelative(0.6f, 106.3f)
                curveToRelative(0.2f, 30.9f, 22.4f, 57.3f, 52.9f, 62.7f)
                lineToRelative(13.5f, 2.4f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(417.6f, 73.6f)
                curveToRelative(30.5f, 5.4f, 59.5f, -15.0f, 64.9f, -45.4f)
                reflectiveCurveToRelative(-15.0f, -59.5f, -45.4f, -64.9f)
                lineTo(386.6f, 193.1f)
                close()
                moveTo(224.0f, 384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
                moveTo(355.2f, 368.7f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(32.0f, 448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(512.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(32.0f, 448.0f)
                close()
            }
        }
        .build()
        return _planeArrival!!
    }

private var _planeArrival: ImageVector? = null
