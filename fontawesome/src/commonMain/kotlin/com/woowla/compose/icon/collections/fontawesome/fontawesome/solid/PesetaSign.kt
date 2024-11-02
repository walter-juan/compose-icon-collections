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
        _pesetaSign = Builder(name = "PesetaSign", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(46.3f, 32.0f, 32.0f, 46.3f, 32.0f, 64.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(77.4f, 0.0f, 142.0f, -55.0f, 156.8f, -128.0f)
                lineToRelative(3.2f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-3.2f, 0.0f)
                curveTo(334.0f, 87.0f, 269.4f, 32.0f, 192.0f, 32.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(282.5f, 160.0f)
                lineTo(96.0f, 160.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(41.8f, 0.0f, 77.4f, 26.7f, 90.5f, 64.0f)
                close()
                moveTo(96.0f, 224.0f)
                lineToRelative(186.5f, 0.0f)
                curveToRelative(-13.2f, 37.3f, -48.7f, 64.0f, -90.5f, 64.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _pesetaSign!!
    }

private var _pesetaSign: ImageVector? = null
