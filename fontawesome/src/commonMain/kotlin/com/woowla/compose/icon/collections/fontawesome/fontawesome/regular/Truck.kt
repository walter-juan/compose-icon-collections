package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.Truck: ImageVector
    get() {
        if (_truck != null) {
            return _truck!!
        }
        _truck = Builder(name = "Truck", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 80.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 288.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(3.3f, 0.0f)
                curveToRelative(10.4f, -36.9f, 44.4f, -64.0f, 84.7f, -64.0f)
                reflectiveCurveToRelative(74.2f, 27.1f, 84.7f, 64.0f)
                lineToRelative(102.6f, 0.0f)
                curveToRelative(4.9f, -17.4f, 15.1f, -32.7f, 28.7f, -43.9f)
                lineTo(368.0f, 96.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(64.0f, 80.0f)
                close()
                moveTo(67.3f, 448.0f)
                lineTo(64.0f, 448.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                lineToRelative(288.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(55.4f, 0.0f)
                curveToRelative(17.0f, 0.0f, 33.3f, 6.7f, 45.3f, 18.7f)
                lineToRelative(40.6f, 40.6f)
                curveToRelative(12.0f, 12.0f, 18.7f, 28.3f, 18.7f, 45.3f)
                lineTo(576.0f, 384.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineToRelative(-3.3f, 0.0f)
                curveToRelative(-10.4f, 36.9f, -44.4f, 64.0f, -84.7f, 64.0f)
                reflectiveCurveToRelative(-74.2f, -27.1f, -84.7f, -64.0f)
                lineToRelative(-102.6f, 0.0f)
                curveToRelative(-10.4f, 36.9f, -44.4f, 64.0f, -84.7f, 64.0f)
                reflectiveCurveToRelative(-74.2f, -27.1f, -84.7f, -64.0f)
                close()
                moveTo(416.0f, 256.0f)
                lineToRelative(112.0f, 0.0f)
                lineToRelative(0.0f, -23.4f)
                curveToRelative(0.0f, -4.2f, -1.7f, -8.3f, -4.7f, -11.3f)
                lineToRelative(-40.6f, -40.6f)
                curveToRelative(-3.0f, -3.0f, -7.1f, -4.7f, -11.3f, -4.7f)
                lineToRelative(-55.4f, 0.0f)
                lineToRelative(0.0f, 80.0f)
                close()
                moveTo(416.0f, 304.0f)
                lineToRelative(0.0f, 32.4f)
                curveToRelative(2.6f, -0.2f, 5.3f, -0.4f, 8.0f, -0.4f)
                curveToRelative(40.3f, 0.0f, 74.2f, 27.1f, 84.7f, 64.0f)
                lineToRelative(3.3f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -80.0f)
                lineToRelative(-112.0f, 0.0f)
                close()
                moveTo(152.0f, 464.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 80.0f)
                close()
                moveTo(424.0f, 464.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 80.0f)
                close()
            }
        }
        .build()
        return _truck!!
    }

private var _truck: ImageVector? = null
