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

public val SolidGroup.HandLizard: ImageVector
    get() {
        if (_handLizard != null) {
            return _handLizard!!
        }
        _handLizard = Builder(name = "HandLizard", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 112.0f)
                curveTo(0.0f, 85.5f, 21.5f, 64.0f, 48.0f, 64.0f)
                lineToRelative(112.0f, 0.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(46.5f, 0.0f)
                curveToRelative(36.8f, 0.0f, 71.2f, 18.0f, 92.1f, 48.2f)
                lineToRelative(113.5f, 164.0f)
                curveToRelative(13.0f, 18.7f, 19.9f, 41.0f, 19.9f, 63.8f)
                lineToRelative(0.0f, 12.0f)
                lineToRelative(0.0f, 16.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-96.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -13.8f)
                lineTo(273.9f, 352.0f)
                lineTo(240.0f, 352.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.5f, -48.0f, 48.0f, -48.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(80.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.5f, -48.0f, -48.0f, -48.0f)
                lineToRelative(-80.0f, 0.0f)
                lineTo(48.0f, 160.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                close()
            }
        }
        .build()
        return _handLizard!!
    }

private var _handLizard: ImageVector? = null
