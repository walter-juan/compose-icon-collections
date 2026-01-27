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

public val SolidGroup.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0f, -24.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveTo(-2.3f, -0.3f, 7.0f, 9.1f)
                lineToRelative(528.0f, 528.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-87.5f, -87.5f)
                curveToRelative(17.2f, -2.4f, 30.5f, -17.3f, 30.5f, -35.2f)
                curveToRelative(0.0f, -8.1f, -2.7f, -15.9f, -7.8f, -22.2f)
                lineToRelative(-9.8f, -12.2f)
                curveTo(464.4f, 308.5f, 448.0f, 261.8f, 448.0f, 213.7f)
                lineToRelative(0.0f, -21.7f)
                curveToRelative(0.0f, -77.4f, -55.0f, -142.0f, -128.0f, -156.8f)
                lineToRelative(0.0f, -3.2f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 3.2f)
                curveToRelative(-38.6f, 7.8f, -72.2f, 29.6f, -95.2f, 59.7f)
                lineTo(41.0f, -24.9f)
                close()
                moveTo(128.0f, 213.6f)
                curveToRelative(0.0f, 48.1f, -16.4f, 94.8f, -46.4f, 132.4f)
                lineToRelative(-9.8f, 12.2f)
                curveToRelative(-5.0f, 6.3f, -7.8f, 14.1f, -7.8f, 22.2f)
                curveToRelative(0.0f, 19.6f, 15.9f, 35.5f, 35.5f, 35.5f)
                lineToRelative(235.3f, 0.0f)
                lineToRelative(-206.9f, -206.9f)
                lineToRelative(0.0f, 4.5f)
                close()
                moveTo(288.0f, 512.0f)
                curveToRelative(29.8f, 0.0f, 54.9f, -20.4f, 62.0f, -48.0f)
                lineToRelative(-124.0f, 0.0f)
                curveToRelative(7.1f, 27.6f, 32.2f, 48.0f, 62.0f, 48.0f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
