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

public val SolidGroup.HouseCircleCheck: ImageVector
    get() {
        if (_houseCircleCheck != null) {
            return _houseCircleCheck!!
        }
        _houseCircleCheck = Builder(name = "HouseCircleCheck", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.7f, 352.0f)
                curveToRelative(8.1f, -89.7f, 83.5f, -160.0f, 175.3f, -160.0f)
                curveToRelative(8.9f, 0.0f, 17.6f, 0.7f, 26.1f, 1.9f)
                lineTo(309.5f, 7.0f)
                curveToRelative(-6.0f, -5.0f, -14.0f, -7.0f, -21.0f, -7.0f)
                reflectiveCurveToRelative(-15.0f, 1.0f, -22.0f, 8.0f)
                lineTo(10.0f, 231.5f)
                curveToRelative(-7.0f, 7.0f, -10.0f, 15.0f, -10.0f, 24.0f)
                curveToRelative(0.0f, 18.0f, 14.0f, 32.1f, 32.0f, 32.1f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, 69.7f)
                curveToRelative(-0.1f, 0.9f, -0.1f, 1.8f, -0.1f, 2.8f)
                lineToRelative(0.0f, 112.0f)
                curveToRelative(0.0f, 22.1f, 17.9f, 40.0f, 40.0f, 40.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(1.2f, 0.0f, 2.4f, -0.1f, 3.6f, -0.2f)
                curveToRelative(1.5f, 0.1f, 3.0f, 0.2f, 4.5f, 0.2f)
                lineToRelative(31.9f, 0.0f)
                lineToRelative(24.0f, 0.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, -17.9f, 40.0f, -40.0f)
                lineToRelative(0.0f, -24.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.7f, 0.0f)
                close()
                moveTo(640.0f, 368.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, -288.0f, 0.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 288.0f, 0.0f)
                close()
                moveTo(563.3f, 324.7f)
                curveToRelative(6.2f, 6.2f, 6.2f, 16.4f, 0.0f, 22.6f)
                lineToRelative(-72.0f, 72.0f)
                curveToRelative(-6.2f, 6.2f, -16.4f, 6.2f, -22.6f, 0.0f)
                lineToRelative(-40.0f, -40.0f)
                curveToRelative(-6.2f, -6.2f, -6.2f, -16.4f, 0.0f, -22.6f)
                reflectiveCurveToRelative(16.4f, -6.2f, 22.6f, 0.0f)
                lineTo(480.0f, 385.4f)
                lineToRelative(60.7f, -60.7f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                close()
            }
        }
        .build()
        return _houseCircleCheck!!
    }

private var _houseCircleCheck: ImageVector? = null
