package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Relay: ImageVector
    get() {
        if (_relay != null) {
            return _relay!!
        }
        _relay = Builder(name = "Relay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.264f, 4.937f)
                curveTo(1.014f, 4.937f, 0.0f, 5.95f, 0.0f, 7.201f)
                curveToRelative(0.0f, 1.251f, 1.014f, 2.264f, 2.264f, 2.264f)
                curveToRelative(1.054f, 0.0f, 1.939f, -0.72f, 2.192f, -1.695f)
                horizontalLineToRelative(10.339f)
                curveToRelative(0.988f, 0.0f, 1.791f, 0.804f, 1.791f, 1.791f)
                curveToRelative(0.0f, 0.988f, -0.804f, 1.792f, -1.791f, 1.792f)
                horizontalLineToRelative(-5.731f)
                curveToRelative(-1.672f, 0.0f, -3.033f, 1.361f, -3.033f, 3.033f)
                curveToRelative(0.0f, 1.673f, 1.361f, 3.033f, 3.033f, 3.033f)
                horizontalLineToRelative(10.494f)
                curveToRelative(0.27f, 0.949f, 1.142f, 1.643f, 2.177f, 1.643f)
                curveToRelative(1.251f, 0.0f, 2.264f, -1.013f, 2.264f, -2.264f)
                curveToRelative(0.0f, -1.251f, -1.014f, -2.264f, -2.264f, -2.264f)
                curveToRelative(-1.035f, 0.0f, -1.907f, 0.695f, -2.177f, 1.643f)
                horizontalLineTo(9.064f)
                curveToRelative(-0.988f, 0.0f, -1.791f, -0.804f, -1.791f, -1.791f)
                curveToRelative(0.0f, -0.988f, 0.804f, -1.792f, 1.791f, -1.792f)
                horizontalLineToRelative(5.731f)
                curveToRelative(1.673f, 0.0f, 3.033f, -1.361f, 3.033f, -3.033f)
                curveToRelative(0.0f, -1.672f, -1.36f, -3.033f, -3.033f, -3.033f)
                horizontalLineTo(4.427f)
                curveToRelative(-0.286f, -0.922f, -1.146f, -1.592f, -2.163f, -1.592f)
                close()
            }
        }
        .build()
        return _relay!!
    }

private var _relay: ImageVector? = null
