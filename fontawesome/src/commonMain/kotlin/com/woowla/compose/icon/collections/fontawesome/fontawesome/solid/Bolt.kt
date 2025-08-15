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

public val SolidGroup.Bolt: ImageVector
    get() {
        if (_bolt != null) {
            return _bolt!!
        }
        _bolt = Builder(name = "Bolt", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(338.8f, -9.9f)
                curveToRelative(11.9f, 8.6f, 16.3f, 24.2f, 10.9f, 37.8f)
                lineTo(271.3f, 224.0f)
                lineTo(416.0f, 224.0f)
                curveToRelative(13.5f, 0.0f, 25.5f, 8.4f, 30.1f, 21.1f)
                reflectiveCurveToRelative(0.7f, 26.9f, -9.6f, 35.5f)
                lineToRelative(-288.0f, 240.0f)
                curveToRelative(-11.3f, 9.4f, -27.4f, 9.9f, -39.3f, 1.3f)
                reflectiveCurveToRelative(-16.3f, -24.2f, -10.9f, -37.8f)
                lineTo(176.7f, 288.0f)
                lineTo(32.0f, 288.0f)
                curveToRelative(-13.5f, 0.0f, -25.5f, -8.4f, -30.1f, -21.1f)
                reflectiveCurveToRelative(-0.7f, -26.9f, 9.6f, -35.5f)
                lineToRelative(288.0f, -240.0f)
                curveToRelative(11.3f, -9.4f, 27.4f, -9.9f, 39.3f, -1.3f)
                close()
            }
        }
        .build()
        return _bolt!!
    }

private var _bolt: ImageVector? = null
