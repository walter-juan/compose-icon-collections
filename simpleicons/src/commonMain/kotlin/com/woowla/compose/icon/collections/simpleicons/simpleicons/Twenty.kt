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

public val Simpleicons.Twenty: ImageVector
    get() {
        if (_twenty != null) {
            return _twenty!!
        }
        _twenty = Builder(name = "Twenty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.97f, 0.0f)
                lineTo(3.03f, 0.0f)
                arcTo(3.03f, 3.03f, 0.0f, false, false, 0.0f, 3.03f)
                verticalLineToRelative(17.94f)
                arcTo(3.03f, 3.03f, 0.0f, false, false, 3.03f, 24.0f)
                horizontalLineToRelative(17.94f)
                arcTo(3.03f, 3.03f, 0.0f, false, false, 24.0f, 20.97f)
                lineTo(24.0f, 3.03f)
                arcTo(3.03f, 3.03f, 0.0f, false, false, 20.97f, 0.0f)
                close()
                moveTo(4.813f, 8.936f)
                arcToRelative(2.376f, 2.376f, 0.0f, false, true, 2.374f, -2.375f)
                horizontalLineToRelative(4.573f)
                curveToRelative(0.067f, 0.0f, 0.129f, 0.04f, 0.157f, 0.103f)
                arcToRelative(0.172f, 0.172f, 0.0f, false, true, -0.03f, 0.185f)
                lineToRelative(-1.002f, 1.088f)
                arcToRelative(0.924f, 0.924f, 0.0f, false, true, -0.678f, 0.299f)
                lineTo(7.2f, 8.236f)
                arcToRelative(0.713f, 0.713f, 0.0f, false, false, -0.713f, 0.713f)
                verticalLineToRelative(1.796f)
                arcToRelative(0.418f, 0.418f, 0.0f, false, true, -0.418f, 0.419f)
                horizontalLineToRelative(-0.836f)
                arcToRelative(0.418f, 0.418f, 0.0f, false, true, -0.419f, -0.419f)
                lineTo(4.814f, 8.936f)
                close()
                moveTo(19.037f, 15.064f)
                arcToRelative(2.376f, 2.376f, 0.0f, false, true, -2.374f, 2.375f)
                horizontalLineToRelative(-1.944f)
                arcToRelative(2.376f, 2.376f, 0.0f, false, true, -2.375f, -2.375f)
                verticalLineToRelative(-3.401f)
                curveToRelative(0.0f, -0.231f, 0.087f, -0.454f, 0.243f, -0.625f)
                lineToRelative(1.134f, -1.23f)
                arcToRelative(0.172f, 0.172f, 0.0f, false, true, 0.298f, 0.115f)
                verticalLineToRelative(5.13f)
                curveToRelative(0.0f, 0.393f, 0.32f, 0.713f, 0.713f, 0.713f)
                horizontalLineToRelative(1.92f)
                curveToRelative(0.393f, 0.0f, 0.713f, -0.32f, 0.713f, -0.713f)
                lineTo(17.365f, 8.949f)
                arcToRelative(0.713f, 0.713f, 0.0f, false, false, -0.713f, -0.713f)
                horizontalLineToRelative(-2.233f)
                curveToRelative(-0.255f, 0.0f, -0.499f, 0.108f, -0.674f, 0.295f)
                lineToRelative(-6.658f, 7.235f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.232f, 0.0f, 0.419f, 0.187f, 0.419f, 0.418f)
                verticalLineToRelative(0.837f)
                arcToRelative(0.418f, 0.418f, 0.0f, false, true, -0.419f, 0.418f)
                horizontalLineToRelative(-5.39f)
                arcToRelative(0.886f, 0.886f, 0.0f, false, true, -0.886f, -0.886f)
                verticalLineToRelative(-0.443f)
                curveToRelative(0.0f, -0.223f, 0.083f, -0.436f, 0.234f, -0.6f)
                lineToRelative(7.465f, -8.109f)
                arcToRelative(2.603f, 2.603f, 0.0f, false, true, 1.916f, -0.84f)
                horizontalLineToRelative(2.235f)
                arcToRelative(2.376f, 2.376f, 0.0f, false, true, 2.375f, 2.375f)
                verticalLineToRelative(6.128f)
                close()
            }
        }
        .build()
        return _twenty!!
    }

private var _twenty: ImageVector? = null
