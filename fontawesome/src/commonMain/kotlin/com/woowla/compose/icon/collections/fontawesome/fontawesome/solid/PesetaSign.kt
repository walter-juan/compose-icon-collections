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

public val SolidGroup.PesetaSign: ImageVector
    get() {
        if (_pesetaSign != null) {
            return _pesetaSign!!
        }
        _pesetaSign = Builder(name = "PesetaSign", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 32.0f)
                curveTo(94.3f, 32.0f, 80.0f, 46.3f, 80.0f, 64.0f)
                lineToRelative(0.0f, 104.0f)
                lineToRelative(-24.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(24.0f, 0.0f)
                lineToRelative(0.0f, 232.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(80.2f, 0.0f, 146.6f, -59.0f, 158.2f, -136.0f)
                lineToRelative(25.8f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-25.8f, 0.0f)
                curveTo(386.6f, 91.0f, 320.2f, 32.0f, 240.0f, 32.0f)
                lineTo(112.0f, 32.0f)
                close()
                moveTo(333.0f, 168.0f)
                lineToRelative(-189.0f, 0.0f)
                lineToRelative(0.0f, -72.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(44.7f, 0.0f, 82.3f, 30.6f, 93.0f, 72.0f)
                close()
                moveTo(144.0f, 216.0f)
                lineToRelative(189.0f, 0.0f)
                curveToRelative(-10.7f, 41.4f, -48.2f, 72.0f, -93.0f, 72.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, -72.0f)
                close()
            }
        }
        .build()
        return _pesetaSign!!
    }

private var _pesetaSign: ImageVector? = null
