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

public val Simpleicons.Koreader: ImageVector
    get() {
        if (_koreader != null) {
            return _koreader!!
        }
        _koreader = Builder(name = "Koreader", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.849f, 0.0f)
                verticalLineToRelative(14.558f)
                lineTo(6.2f, 13.178f)
                lineTo(4.55f, 14.558f)
                lineTo(4.55f, 0.026f)
                curveToRelative(-1.364f, 0.177f, -2.427f, 1.351f, -2.427f, 2.763f)
                verticalLineToRelative(18.422f)
                curveToRelative(0.0f, 1.336f, 0.951f, 2.46f, 2.208f, 2.728f)
                arcToRelative(7.909f, 7.909f, 0.0f, false, true, -0.236f, -1.92f)
                curveToRelative(0.0f, -4.36f, 3.54f, -7.907f, 7.892f, -7.907f)
                curveToRelative(4.352f, 0.0f, 7.891f, 3.547f, 7.891f, 7.907f)
                arcToRelative(7.95f, 7.95f, 0.0f, false, true, -0.082f, 1.129f)
                curveToRelative(0.486f, -0.503f, 0.788f, -1.186f, 0.788f, -1.937f)
                lineTo(20.584f, 2.789f)
                curveToRelative(0.0f, -1.162f, -0.719f, -2.162f, -1.733f, -2.58f)
                lineTo(12.204f, 7.323f)
                curveToRelative(0.733f, 0.864f, 3.202f, 3.269f, 6.399f, 6.001f)
                curveToRelative(0.671f, 0.573f, 1.186f, 1.006f, 1.722f, 1.234f)
                curveToRelative(-1.16f, 0.002f, -2.37f, -0.005f, -2.762f, 0.0f)
                curveToRelative(-2.283f, 0.031f, -2.335f, -0.415f, -3.069f, -1.003f)
                curveToRelative(-1.122f, -0.897f, -3.682f, -3.447f, -4.938f, -4.613f)
                curveToRelative(-0.428f, -0.398f, -0.67f, -0.86f, -0.67f, -1.292f)
                verticalLineToRelative(-0.352f)
                curveToRelative(0.0f, -0.575f, 0.216f, -1.13f, 0.605f, -1.553f)
                lineTo(14.778f, 0.0f)
                close()
                moveTo(18.447f, 0.0f)
                curveToRelative(1.531f, 0.0f, 2.784f, 1.255f, 2.784f, 2.789f)
                verticalLineToRelative(18.422f)
                curveToRelative(0.0f, 1.534f, -1.253f, 2.789f, -2.784f, 2.789f)
                horizontalLineToRelative(0.646f)
                curveToRelative(1.531f, 0.0f, 2.784f, -1.255f, 2.784f, -2.789f)
                lineTo(21.877f, 2.789f)
                curveTo(21.877f, 1.255f, 20.624f, 0.0f, 19.093f, 0.0f)
                close()
                moveTo(11.987f, 17.084f)
                curveToRelative(-2.716f, 0.0f, -4.925f, 2.214f, -4.925f, 4.935f)
                curveToRelative(0.0f, 0.705f, 0.151f, 1.374f, 0.418f, 1.981f)
                horizontalLineToRelative(9.015f)
                arcToRelative(4.91f, 4.91f, 0.0f, false, false, 0.418f, -1.981f)
                curveToRelative(0.0f, -2.721f, -2.209f, -4.935f, -4.925f, -4.935f)
                close()
            }
        }
        .build()
        return _koreader!!
    }

private var _koreader: ImageVector? = null
