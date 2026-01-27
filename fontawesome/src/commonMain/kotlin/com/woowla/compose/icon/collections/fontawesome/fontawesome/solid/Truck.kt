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

public val SolidGroup.Truck: ImageVector
    get() {
        if (_truck != null) {
            return _truck!!
        }
        _truck = Builder(name = "Truck", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                lineToRelative(288.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(50.7f, 0.0f)
                curveToRelative(17.0f, 0.0f, 33.3f, 6.7f, 45.3f, 18.7f)
                lineTo(557.3f, 192.0f)
                curveToRelative(12.0f, 12.0f, 18.7f, 28.3f, 18.7f, 45.3f)
                lineTo(576.0f, 384.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineToRelative(-3.3f, 0.0f)
                curveToRelative(-10.4f, 36.9f, -44.4f, 64.0f, -84.7f, 64.0f)
                reflectiveCurveToRelative(-74.2f, -27.1f, -84.7f, -64.0f)
                lineToRelative(-102.6f, 0.0f)
                curveToRelative(-10.4f, 36.9f, -44.4f, 64.0f, -84.7f, 64.0f)
                reflectiveCurveToRelative(-74.2f, -27.1f, -84.7f, -64.0f)
                lineTo(64.0f, 448.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 96.0f)
                close()
                moveTo(512.0f, 288.0f)
                lineToRelative(0.0f, -50.7f)
                lineToRelative(-45.3f, -45.3f)
                lineToRelative(-50.7f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(96.0f, 0.0f)
                close()
                moveTo(192.0f, 424.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -80.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 80.0f, 0.0f)
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
