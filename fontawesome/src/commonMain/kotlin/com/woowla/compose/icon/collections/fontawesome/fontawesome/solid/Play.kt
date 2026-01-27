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

public val SolidGroup.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(91.2f, 36.9f)
                curveToRelative(-12.4f, -6.8f, -27.4f, -6.5f, -39.6f, 0.7f)
                reflectiveCurveTo(32.0f, 57.9f, 32.0f, 72.0f)
                lineToRelative(0.0f, 368.0f)
                curveToRelative(0.0f, 14.1f, 7.5f, 27.2f, 19.6f, 34.4f)
                reflectiveCurveToRelative(27.2f, 7.5f, 39.6f, 0.7f)
                lineToRelative(336.0f, -184.0f)
                curveToRelative(12.8f, -7.0f, 20.8f, -20.5f, 20.8f, -35.1f)
                reflectiveCurveToRelative(-8.0f, -28.1f, -20.8f, -35.1f)
                lineToRelative(-336.0f, -184.0f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
