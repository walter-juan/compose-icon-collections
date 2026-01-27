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

public val SolidGroup.Swatchbook: ImageVector
    get() {
        if (_swatchbook != null) {
            return _swatchbook!!
        }
        _swatchbook = Builder(name = "Swatchbook", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 48.0f)
                curveTo(0.0f, 21.5f, 21.5f, 0.0f, 48.0f, 0.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 368.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                reflectiveCurveTo(0.0f, 469.0f, 0.0f, 416.0f)
                lineTo(0.0f, 48.0f)
                close()
                moveTo(240.0f, 409.6f)
                lineToRelative(0.0f, -271.5f)
                lineToRelative(48.1f, -48.1f)
                curveToRelative(18.7f, -18.7f, 49.1f, -18.7f, 67.9f, 0.0f)
                lineToRelative(67.9f, 67.9f)
                curveToRelative(18.7f, 18.7f, 18.7f, 49.1f, 0.0f, 67.9f)
                lineTo(240.0f, 409.6f)
                close()
                moveTo(205.5f, 512.0f)
                lineToRelative(192.0f, -192.0f)
                lineToRelative(66.6f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-258.5f, 0.0f)
                close()
                moveTo(80.0f, 64.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(80.0f, 64.0f)
                close()
                moveTo(64.0f, 208.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                close()
                moveTo(96.0f, 440.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
            }
        }
        .build()
        return _swatchbook!!
    }

private var _swatchbook: ImageVector? = null
