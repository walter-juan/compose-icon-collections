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

public val SolidGroup.Stamp: ImageVector
    get() {
        if (_stamp != null) {
            return _stamp!!
        }
        _stamp = Builder(name = "Stamp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(312.0f, 201.8f)
                curveToRelative(0.0f, -17.4f, 9.2f, -33.2f, 19.9f, -47.0f)
                curveToRelative(12.6f, -16.2f, 20.1f, -36.6f, 20.1f, -58.8f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 43.0f, -96.0f, 96.0f)
                curveToRelative(0.0f, 22.1f, 7.5f, 42.5f, 20.1f, 58.8f)
                curveToRelative(10.7f, 13.8f, 19.9f, 29.6f, 19.9f, 47.0f)
                curveToRelative(0.0f, 29.9f, -24.3f, 54.2f, -54.2f, 54.2f)
                lineTo(112.0f, 256.0f)
                curveToRelative(-61.9f, 0.0f, -112.0f, 50.1f, -112.0f, 112.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(416.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                curveToRelative(0.0f, -61.9f, -50.1f, -112.0f, -112.0f, -112.0f)
                lineToRelative(-33.8f, 0.0f)
                curveToRelative(-29.9f, 0.0f, -54.2f, -24.3f, -54.2f, -54.2f)
                close()
                moveTo(56.0f, 464.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(400.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(56.0f, 464.0f)
                close()
            }
        }
        .build()
        return _stamp!!
    }

private var _stamp: ImageVector? = null
