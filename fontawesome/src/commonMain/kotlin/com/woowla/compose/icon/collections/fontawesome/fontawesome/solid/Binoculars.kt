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

public val SolidGroup.Binoculars: ImageVector
    get() {
        if (_binoculars != null) {
            return _binoculars!!
        }
        _binoculars = Builder(name = "Binoculars", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                lineTo(96.0f, 96.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(192.0f, 128.0f)
                lineToRelative(0.0f, 320.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 480.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -59.1f)
                curveToRelative(0.0f, -34.6f, 9.4f, -68.6f, 27.2f, -98.3f)
                curveTo(40.9f, 267.8f, 49.7f, 242.4f, 53.0f, 216.0f)
                lineTo(60.5f, 156.0f)
                curveToRelative(2.0f, -16.0f, 15.6f, -28.0f, 31.8f, -28.0f)
                lineToRelative(99.8f, 0.0f)
                close()
                moveTo(419.8f, 128.0f)
                curveToRelative(16.1f, 0.0f, 29.8f, 12.0f, 31.8f, 28.0f)
                lineTo(459.0f, 216.0f)
                curveToRelative(3.3f, 26.4f, 12.1f, 51.8f, 25.8f, 74.6f)
                curveToRelative(17.8f, 29.7f, 27.2f, 63.7f, 27.2f, 98.3f)
                lineToRelative(0.0f, 59.1f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-128.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -320.0f)
                lineToRelative(99.8f, 0.0f)
                close()
                moveTo(320.0f, 64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                close()
                moveTo(288.0f, 128.0f)
                lineToRelative(0.0f, 160.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -160.0f)
                lineToRelative(64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
