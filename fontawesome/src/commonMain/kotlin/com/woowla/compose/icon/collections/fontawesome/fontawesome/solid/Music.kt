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

public val SolidGroup.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(468.0f, 7.0f)
                curveToRelative(7.6f, 6.1f, 12.0f, 15.3f, 12.0f, 25.0f)
                lineToRelative(0.0f, 304.0f)
                curveToRelative(0.0f, 44.2f, -43.0f, 80.0f, -96.0f, 80.0f)
                reflectiveCurveToRelative(-96.0f, -35.8f, -96.0f, -80.0f)
                reflectiveCurveToRelative(43.0f, -80.0f, 96.0f, -80.0f)
                curveToRelative(11.2f, 0.0f, 22.0f, 1.6f, 32.0f, 4.6f)
                lineToRelative(0.0f, -116.7f)
                lineToRelative(-224.0f, 49.8f)
                lineToRelative(0.0f, 206.3f)
                curveToRelative(0.0f, 44.2f, -43.0f, 80.0f, -96.0f, 80.0f)
                reflectiveCurveToRelative(-96.0f, -35.8f, -96.0f, -80.0f)
                reflectiveCurveToRelative(43.0f, -80.0f, 96.0f, -80.0f)
                curveToRelative(11.2f, 0.0f, 22.0f, 1.6f, 32.0f, 4.6f)
                lineTo(128.0f, 96.0f)
                curveToRelative(0.0f, -15.0f, 10.4f, -28.0f, 25.1f, -31.2f)
                lineToRelative(288.0f, -64.0f)
                curveToRelative(9.5f, -2.1f, 19.4f, 0.2f, 27.0f, 6.3f)
                close()
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null
