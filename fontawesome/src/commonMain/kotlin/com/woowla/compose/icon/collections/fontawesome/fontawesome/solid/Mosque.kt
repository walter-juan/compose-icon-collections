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

public val SolidGroup.Mosque: ImageVector
    get() {
        if (_mosque != null) {
            return _mosque!!
        }
        _mosque = Builder(name = "Mosque", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.8f, 224.0f)
                lineToRelative(226.4f, 0.0f)
                curveToRelative(43.5f, 0.0f, 78.8f, -35.3f, 78.8f, -78.8f)
                curveToRelative(0.0f, -25.5f, -12.3f, -49.4f, -33.1f, -64.2f)
                lineTo(297.3f, -25.4f)
                curveToRelative(-5.6f, -3.9f, -13.0f, -3.9f, -18.5f, 0.0f)
                lineTo(129.1f, 81.0f)
                curveTo(108.3f, 95.8f, 96.0f, 119.7f, 96.0f, 145.2f)
                curveTo(96.0f, 188.7f, 131.3f, 224.0f, 174.8f, 224.0f)
                close()
                moveTo(512.0f, 512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -224.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(-448.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveTo(0.0f, 206.3f, 0.0f, 224.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(448.0f, 0.0f)
                close()
                moveTo(240.0f, 384.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 80.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, -80.0f)
                close()
            }
        }
        .build()
        return _mosque!!
    }

private var _mosque: ImageVector? = null
