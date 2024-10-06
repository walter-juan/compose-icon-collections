package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Salad: ImageVector
    get() {
        if (_salad != null) {
            return _salad!!
        }
        _salad = Builder(name = "Salad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.53f, 3.152f)
                lineToRelative(3.742f, 2.339f)
                quadToRelative(1.492f, -0.491f, 3.472f, -0.491f)
                horizontalLineToRelative(2.256f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineToRelative(-0.001f, 1.336f)
                lineToRelative(-0.05f, 0.895f)
                lineToRelative(-0.042f, 0.585f)
                curveToRelative(-0.037f, 0.457f, -0.08f, 0.84f, -0.134f, 1.185f)
                lineToRelative(0.227f, -0.001f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.694f, -2.247f, 5.49f, -3.983f, 6.983f)
                lineToRelative(-0.017f, 0.013f)
                verticalLineToRelative(0.504f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.85f, 1.995f)
                lineToRelative(-0.15f, 0.005f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-0.496f)
                lineToRelative(-0.065f, -0.053f)
                curveToRelative(-1.76f, -1.496f, -3.794f, -4.965f, -3.928f, -6.77f)
                lineToRelative(-0.007f, -0.181f)
                verticalLineToRelative(-0.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(0.078f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -0.078f, -1.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(1.755f)
                curveToRelative(0.138f, 0.0f, 0.287f, 0.034f, 0.44f, 0.092f)
                lineToRelative(0.835f, -3.335f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.5f, -0.605f)
                moveToRelative(-2.193f, 5.847f)
                lineToRelative(-1.335f, 0.001f)
                lineToRelative(0.027f, 0.42f)
                quadToRelative(0.025f, 0.292f, 0.064f, 0.58f)
                horizontalLineToRelative(0.942f)
                quadToRelative(0.078f, -0.533f, 0.302f, -1.001f)
                moveToRelative(10.663f, -1.999f)
                horizontalLineToRelative(-1.256f)
                curveToRelative(-1.712f, 0.0f, -3.003f, 0.31f, -3.922f, 0.88f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 1.143f, 2.12f)
                horizontalLineToRelative(3.774f)
                curveToRelative(0.127f, -0.615f, 0.194f, -1.4f, 0.261f, -2.714f)
                close()
                moveTo(10.5f, 9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.414f, 1.0f)
                horizontalLineToRelative(2.828f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.845f, -0.888f)
                lineToRelative(-0.166f, -0.056f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.403f, -0.056f)
                moveToRelative(-0.864f, -3.424f)
                lineToRelative(-0.415f, 1.665f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 1.502f, -0.234f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.497f, -0.442f)
                close()
            }
        }
        .build()
        return _salad!!
    }

private var _salad: ImageVector? = null
