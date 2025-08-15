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

public val SolidGroup.HeartCircleCheck: ImageVector
    get() {
        if (_heartCircleCheck != null) {
            return _heartCircleCheck!!
        }
        _heartCircleCheck = Builder(name = "HeartCircleCheck", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.0f, 87.1f)
                lineToRelative(15.0f, 20.7f)
                lineToRelative(15.0f, -20.7f)
                curveTo(296.0f, 52.5f, 336.2f, 32.0f, 378.9f, 32.0f)
                curveTo(452.4f, 32.0f, 512.0f, 91.6f, 512.0f, 165.1f)
                lineToRelative(0.0f, 2.6f)
                curveToRelative(0.0f, 17.6f, -3.4f, 35.6f, -9.5f, 53.7f)
                curveToRelative(-21.8f, -8.6f, -45.6f, -13.4f, -70.5f, -13.4f)
                curveToRelative(-106.0f, 0.0f, -192.0f, 86.0f, -192.0f, 192.0f)
                curveToRelative(0.0f, 28.5f, 6.2f, 55.6f, 17.4f, 80.0f)
                curveToRelative(-0.5f, 0.0f, -0.9f, 0.0f, -1.4f, 0.0f)
                curveToRelative(-15.5f, 0.0f, -30.8f, -4.6f, -43.1f, -14.1f)
                curveToRelative(-73.0f, -55.7f, -212.9f, -186.0f, -212.9f, -298.2f)
                lineToRelative(0.0f, -2.6f)
                curveTo(0.0f, 91.6f, 59.6f, 32.0f, 133.1f, 32.0f)
                curveTo(175.8f, 32.0f, 216.0f, 52.5f, 241.0f, 87.1f)
                close()
                moveTo(288.0f, 400.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 288.0f, 0.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, -288.0f, 0.0f)
                close()
                moveTo(489.4f, 339.1f)
                curveToRelative(-7.1f, -5.2f, -17.2f, -3.6f, -22.4f, 3.5f)
                lineToRelative(-53.0f, 72.9f)
                lineToRelative(-26.8f, -26.8f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0.0f)
                reflectiveCurveToRelative(-6.2f, 16.4f, 0.0f, 22.6f)
                lineToRelative(40.0f, 40.0f)
                curveToRelative(3.3f, 3.3f, 7.9f, 5.0f, 12.6f, 4.6f)
                reflectiveCurveToRelative(8.9f, -2.8f, 11.7f, -6.5f)
                lineToRelative(64.0f, -88.0f)
                curveToRelative(5.2f, -7.1f, 3.6f, -17.2f, -3.5f, -22.3f)
                close()
            }
        }
        .build()
        return _heartCircleCheck!!
    }

private var _heartCircleCheck: ImageVector? = null
