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

public val SolidGroup.Tape: ImageVector
    get() {
        if (_tape != null) {
            return _tape!!
        }
        _tape = Builder(name = "Tape", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(412.8f, 416.0f)
                curveToRelative(41.5f, -40.7f, 67.2f, -97.3f, 67.2f, -160.0f)
                curveToRelative(0.0f, -123.7f, -100.3f, -224.0f, -224.0f, -224.0f)
                reflectiveCurveTo(32.0f, 132.3f, 32.0f, 256.0f)
                reflectiveCurveTo(132.3f, 480.0f, 256.0f, 480.0f)
                lineToRelative(288.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-131.2f, 0.0f)
                close()
                moveTo(256.0f, 160.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 0.0f, 192.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 0.0f, -192.0f)
                close()
                moveTo(304.0f, 256.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 96.0f, 0.0f)
                close()
            }
        }
        .build()
        return _tape!!
    }

private var _tape: ImageVector? = null
