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

public val SolidGroup.Taxi: ImageVector
    get() {
        if (_taxi != null) {
            return _taxi!!
        }
        _taxi = Builder(name = "Taxi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-8.9f, 0.0f)
                curveToRelative(-42.0f, 0.0f, -79.1f, 27.3f, -91.6f, 67.4f)
                lineToRelative(-23.0f, 73.5f)
                curveTo(14.5f, 219.1f, 0.0f, 243.9f, 0.0f, 272.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(320.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -176.0f)
                curveToRelative(0.0f, -28.1f, -14.5f, -52.9f, -36.4f, -67.1f)
                lineToRelative(-23.0f, -73.5f)
                curveTo(440.1f, 91.3f, 402.9f, 64.0f, 360.9f, 64.0f)
                lineToRelative(-8.9f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(192.0f, 0.0f)
                close()
                moveTo(151.1f, 128.0f)
                lineToRelative(209.9f, 0.0f)
                curveToRelative(14.0f, 0.0f, 26.4f, 9.1f, 30.5f, 22.5f)
                lineToRelative(13.0f, 41.5f)
                lineToRelative(-296.9f, 0.0f)
                lineToRelative(13.0f, -41.5f)
                curveToRelative(4.2f, -13.4f, 16.5f, -22.5f, 30.5f, -22.5f)
                close()
                moveTo(96.0f, 272.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(384.0f, 304.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _taxi!!
    }

private var _taxi: ImageVector? = null
