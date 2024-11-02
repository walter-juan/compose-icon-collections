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

public val Simpleicons.Upstash: ImageVector
    get() {
        if (_upstash != null) {
            return _upstash!!
        }
        _upstash = Builder(name = "Upstash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.803f, 0.0f)
                curveTo(11.193f, 0.0f, 8.583f, 0.995f, 6.592f, 2.986f)
                curveToRelative(-3.982f, 3.982f, -3.982f, 10.44f, 0.0f, 14.422f)
                curveToRelative(1.991f, 1.991f, 5.22f, 1.991f, 7.211f, 0.0f)
                curveToRelative(1.991f, -1.991f, 1.991f, -5.22f, 0.0f, -7.211f)
                lineTo(12.0f, 12.0f)
                curveToRelative(0.996f, 0.996f, 0.996f, 2.61f, 0.0f, 3.605f)
                curveToRelative(-0.996f, 0.996f, -2.61f, 0.996f, -3.605f, 0.0f)
                curveToRelative(-2.987f, -2.987f, -2.987f, -7.83f, 0.0f, -10.816f)
                curveToRelative(2.987f, -2.987f, 7.83f, -2.987f, 10.816f, 0.0f)
                lineToRelative(1.803f, -1.803f)
                curveTo(19.022f, 0.995f, 16.413f, 0.0f, 13.803f, 0.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(-0.996f, -0.996f, -0.996f, -2.61f, 0.0f, -3.605f)
                curveToRelative(0.996f, -0.996f, 2.61f, -0.996f, 3.605f, 0.0f)
                curveToRelative(2.987f, 2.987f, 2.987f, 7.83f, 0.0f, 10.816f)
                curveToRelative(-2.987f, 2.987f, -7.83f, 2.987f, -10.816f, 0.0f)
                lineToRelative(-1.803f, 1.803f)
                curveToRelative(3.982f, 3.982f, 10.44f, 3.982f, 14.422f, 0.0f)
                curveToRelative(3.982f, -3.982f, 3.982f, -10.44f, 0.0f, -14.422f)
                curveToRelative(-0.996f, -0.996f, -2.301f, -1.492f, -3.605f, -1.492f)
                curveToRelative(-1.305f, 0.0f, -2.61f, 0.497f, -3.605f, 1.492f)
                curveToRelative(-1.991f, 1.991f, -1.991f, 5.22f, 0.0f, 7.211f)
                close()
            }
        }
        .build()
        return _upstash!!
    }

private var _upstash: ImageVector? = null
