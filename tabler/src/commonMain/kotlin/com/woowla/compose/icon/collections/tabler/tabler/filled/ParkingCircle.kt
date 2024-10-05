package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.ParkingCircle: ImageVector
    get() {
        if (_parkingCircle != null) {
            return _parkingCircle!!
        }
        _parkingCircle = Builder(name = "ParkingCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -20.0f, 0.0f)
                lineToRelative(0.004f, -0.28f)
                curveToRelative(0.148f, -5.393f, 4.566f, -9.72f, 9.996f, -9.72f)
                moveToRelative(1.334f, 5.0f)
                horizontalLineToRelative(-3.334f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.883f, -0.993f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.334f)
                curveToRelative(1.516f, 0.0f, 2.666f, -1.38f, 2.666f, -3.0f)
                reflectiveCurveToRelative(-1.15f, -3.0f, -2.666f, -3.0f)
                moveToRelative(0.0f, 2.0f)
                curveToRelative(0.323f, 0.0f, 0.666f, 0.411f, 0.666f, 1.0f)
                reflectiveCurveToRelative(-0.343f, 1.0f, -0.666f, 1.0f)
                horizontalLineToRelative(-2.334f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _parkingCircle!!
    }

private var _parkingCircle: ImageVector? = null
