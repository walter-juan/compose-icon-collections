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

public val Simpleicons.Robinhood: ImageVector
    get() {
        if (_robinhood != null) {
            return _robinhood!!
        }
        _robinhood = Builder(name = "Robinhood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.84f, 24.0f)
                horizontalLineToRelative(0.53f)
                curveToRelative(0.096f, 0.0f, 0.192f, -0.048f, 0.224f, -0.128f)
                curveTo(7.591f, 13.696f, 11.94f, 8.656f, 14.67f, 5.638f)
                curveToRelative(0.112f, -0.128f, 0.064f, -0.225f, -0.096f, -0.225f)
                horizontalLineToRelative(-4.88f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, false, -0.45f, 0.225f)
                lineTo(5.746f, 9.972f)
                curveToRelative(-0.514f, 0.642f, -0.642f, 1.236f, -0.642f, 2.086f)
                verticalLineToRelative(4.43f)
                curveToRelative(-1.14f, 3.194f, -1.862f, 5.361f, -2.392f, 7.32f)
                curveToRelative(-0.032f, 0.125f, 0.016f, 0.192f, 0.129f, 0.192f)
                moveTo(20.447f, 0.646f)
                curveToRelative(-0.754f, -0.802f, -4.157f, -0.834f, -5.73f, -0.224f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.786f, 0.465f)
                arcToRelative(41.0f, 41.0f, 0.0f, false, false, -3.323f, 3.178f)
                curveToRelative(-0.112f, 0.113f, -0.064f, 0.225f, 0.097f, 0.225f)
                horizontalLineToRelative(5.409f)
                curveToRelative(0.497f, 0.0f, 0.786f, 0.289f, 0.786f, 0.786f)
                verticalLineToRelative(6.1f)
                curveToRelative(0.0f, 0.16f, 0.128f, 0.208f, 0.225f, 0.064f)
                lineToRelative(3.258f, -4.254f)
                curveToRelative(0.53f, -0.69f, 0.69f, -0.898f, 0.835f, -1.861f)
                curveToRelative(0.192f, -1.413f, 0.08f, -3.58f, -0.77f, -4.479f)
                moveToRelative(-6.982f, 16.18f)
                lineToRelative(2.231f, -3.676f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.064f, -0.29f)
                verticalLineTo(6.73f)
                curveToRelative(0.0f, -0.16f, -0.112f, -0.225f, -0.224f, -0.097f)
                curveToRelative(-3.355f, 3.74f, -5.971f, 7.672f, -8.395f, 12.407f)
                curveToRelative(-0.06f, 0.12f, 0.016f, 0.225f, 0.16f, 0.177f)
                lineToRelative(5.009f, -1.54f)
                curveToRelative(0.565f, -0.174f, 0.882f, -0.402f, 1.155f, -0.852f)
            }
        }
        .build()
        return _robinhood!!
    }

private var _robinhood: ImageVector? = null
