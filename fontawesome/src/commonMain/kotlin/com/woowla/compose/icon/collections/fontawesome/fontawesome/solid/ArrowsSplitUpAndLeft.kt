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

public val SolidGroup.ArrowsSplitUpAndLeft: ImageVector
    get() {
        if (_arrowsSplitUpAndLeft != null) {
            return _arrowsSplitUpAndLeft!!
        }
        _arrowsSplitUpAndLeft = Builder(name = "ArrowsSplitUpAndLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.6f, 150.6f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(96.0f, -96.0f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                lineToRelative(96.0f, 96.0f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(-32.8f, 12.5f, -45.3f, 0.0f)
                lineTo(352.0f, 109.3f)
                lineTo(352.0f, 384.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-70.7f, 0.0f, -128.0f, -57.3f, -128.0f, -128.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineToRelative(-114.7f, 0.0f)
                lineToRelative(41.4f, 41.4f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(-32.8f, 12.5f, -45.3f, 0.0f)
                lineToRelative(-96.0f, -96.0f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(96.0f, -96.0f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, 32.8f, 0.0f, 45.3f)
                lineTo(109.3f, 256.0f)
                lineTo(224.0f, 256.0f)
                curveToRelative(23.3f, 0.0f, 45.2f, 6.2f, 64.0f, 17.1f)
                lineToRelative(0.0f, -163.9f)
                lineToRelative(-41.4f, 41.4f)
                close()
            }
        }
        .build()
        return _arrowsSplitUpAndLeft!!
    }

private var _arrowsSplitUpAndLeft: ImageVector? = null
