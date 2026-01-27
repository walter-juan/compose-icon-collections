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

public val SolidGroup.Warehouse: ImageVector
    get() {
        if (_warehouse != null) {
            return _warehouse!!
        }
        _warehouse = Builder(name = "Warehouse", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 142.1f)
                lineTo(0.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -240.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 240.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -337.9f)
                curveToRelative(0.0f, -27.5f, -17.6f, -52.0f, -43.8f, -60.7f)
                lineTo(303.2f, 5.1f)
                curveToRelative(-9.9f, -3.3f, -20.5f, -3.3f, -30.4f, 0.0f)
                lineTo(43.8f, 81.4f)
                curveTo(17.6f, 90.1f, 0.0f, 114.6f, 0.0f, 142.1f)
                close()
                moveTo(464.0f, 256.0f)
                lineToRelative(-352.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(352.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                close()
                moveTo(112.0f, 416.0f)
                lineToRelative(352.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-352.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                close()
                moveTo(464.0f, 448.0f)
                lineToRelative(-352.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(352.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
