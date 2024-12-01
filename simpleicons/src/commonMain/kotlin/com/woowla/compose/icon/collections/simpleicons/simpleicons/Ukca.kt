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

public val Simpleicons.Ukca: ImageVector
    get() {
        if (_ukca != null) {
            return _ukca!!
        }
        _ukca = Builder(name = "Ukca", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.138f, 11.001f)
                lineTo(3.852f, 11.001f)
                curveTo(1.728f, 11.001f, 0.0f, 9.296f, 0.0f, 7.201f)
                lineTo(0.0f, 0.011f)
                horizontalLineToRelative(2.498f)
                verticalLineToRelative(7.155f)
                curveToRelative(0.0f, 0.737f, 0.622f, 1.336f, 1.388f, 1.336f)
                horizontalLineToRelative(3.218f)
                curveToRelative(0.766f, 0.0f, 1.388f, -0.599f, 1.388f, -1.336f)
                lineTo(8.492f, 0.011f)
                horizontalLineToRelative(2.498f)
                verticalLineToRelative(7.19f)
                curveToRelative(0.0f, 2.095f, -1.728f, 3.8f, -3.852f, 3.8f)
                moveTo(24.0f, 0.011f)
                horizontalLineToRelative(-3.23f)
                lineToRelative(-5.285f, 4.16f)
                lineTo(15.485f, 0.011f)
                horizontalLineToRelative(-2.498f)
                lineTo(12.987f, 11.0f)
                horizontalLineToRelative(2.498f)
                lineTo(15.485f, 6.814f)
                lineToRelative(5.284f, 4.187f)
                horizontalLineToRelative(3.217f)
                lineToRelative(-6.952f, -5.508f)
                close()
                moveTo(10.99f, 23.99f)
                lineTo(3.8f, 23.99f)
                curveToRelative(-2.095f, 0.0f, -3.8f, -1.761f, -3.8f, -3.885f)
                verticalLineToRelative(-3.22f)
                curveTo(0.0f, 14.762f, 1.705f, 13.0f, 3.8f, 13.0f)
                horizontalLineToRelative(7.19f)
                verticalLineToRelative(2.498f)
                lineTo(3.834f, 15.498f)
                curveToRelative(-0.737f, 0.0f, -1.336f, 0.622f, -1.336f, 1.388f)
                verticalLineToRelative(3.219f)
                curveToRelative(0.0f, 0.765f, 0.6f, 1.387f, 1.336f, 1.387f)
                horizontalLineToRelative(7.156f)
                close()
                moveTo(15.485f, 18.995f)
                verticalLineToRelative(-2.16f)
                curveToRelative(0.0f, -0.738f, 0.622f, -1.337f, 1.387f, -1.337f)
                horizontalLineToRelative(3.22f)
                curveToRelative(0.765f, 0.0f, 1.387f, 0.6f, 1.387f, 1.336f)
                verticalLineToRelative(2.16f)
                close()
                moveTo(20.125f, 13.0f)
                lineTo(16.84f, 13.0f)
                curveToRelative(-2.124f, 0.0f, -3.852f, 1.705f, -3.852f, 3.8f)
                verticalLineToRelative(7.19f)
                horizontalLineToRelative(2.498f)
                verticalLineToRelative(-2.498f)
                horizontalLineToRelative(5.994f)
                verticalLineToRelative(2.497f)
                horizontalLineToRelative(2.498f)
                lineTo(23.978f, 16.8f)
                curveToRelative(0.0f, -2.094f, -1.728f, -3.799f, -3.852f, -3.799f)
            }
        }
        .build()
        return _ukca!!
    }

private var _ukca: ImageVector? = null
