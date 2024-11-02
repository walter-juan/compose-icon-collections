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

public val Simpleicons.Fanfou: ImageVector
    get() {
        if (_fanfou != null) {
            return _fanfou!!
        }
        _fanfou = Builder(name = "Fanfou", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.96f, 0.065f)
                lineToRelative(1.369f, 2.082f)
                curveToRelative(-3.266f, 0.904f, -6.862f, 1.514f, -10.788f, 1.83f)
                verticalLineToRelative(3.806f)
                lineTo(22.736f, 7.784f)
                curveToRelative(-0.448f, 4.427f, -1.616f, 7.944f, -3.504f, 10.552f)
                curveToRelative(1.239f, 1.475f, 2.827f, 2.788f, 4.768f, 3.938f)
                lineToRelative(-1.7f, 1.66f)
                arcToRelative(25.133f, 25.133f, 0.0f, false, true, -4.582f, -3.74f)
                arcToRelative(20.946f, 20.946f, 0.0f, false, true, -4.993f, 3.74f)
                lineToRelative(-1.528f, -1.726f)
                curveToRelative(2.143f, -1.212f, 3.815f, -2.476f, 5.019f, -3.793f)
                curveToRelative(-1.599f, -2.52f, -2.644f, -5.291f, -3.135f, -8.312f)
                horizontalLineToRelative(-0.54f)
                curveToRelative(0.07f, 5.559f, -0.892f, 10.16f, -2.885f, 13.806f)
                lineToRelative(-2.002f, -1.396f)
                curveToRelative(1.73f, -3.03f, 2.594f, -7.294f, 2.594f, -12.792f)
                lineTo(10.247f, 1.897f)
                curveToRelative(4.287f, -0.167f, 8.19f, -0.776f, 11.712f, -1.83f)
                close()
                moveTo(20.063f, 10.104f)
                horizontalLineToRelative(-4.61f)
                curveToRelative(0.35f, 2.3f, 1.115f, 4.413f, 2.292f, 6.335f)
                curveToRelative(1.184f, -1.861f, 1.957f, -3.973f, 2.318f, -6.335f)
                close()
                moveTo(9.405f, 3.623f)
                curveToRelative(-0.123f, 1.984f, -0.51f, 4.044f, -1.159f, 6.177f)
                lineToRelative(-2.146f, -0.618f)
                curveToRelative(0.308f, -0.887f, 0.584f, -1.955f, 0.83f, -3.2f)
                lineTo(3.583f, 5.982f)
                curveTo(2.96f, 7.5f, 2.314f, 8.83f, 1.646f, 9.971f)
                lineTo(0.0f, 8.18f)
                curveTo(1.186f, 6.082f, 2.138f, 3.385f, 2.858f, 0.092f)
                lineToRelative(2.24f, 0.646f)
                arcToRelative(63.566f, 63.566f, 0.0f, false, true, -0.764f, 2.884f)
                close()
                moveTo(8.444f, 19.377f)
                curveToRelative(-1.616f, 1.616f, -3.153f, 2.902f, -4.61f, 3.86f)
                lineTo(2.45f, 21.327f)
                curveToRelative(0.255f, -0.22f, 0.382f, -0.554f, 0.382f, -1.002f)
                lineTo(2.832f, 8.431f)
                horizontalLineToRelative(2.345f)
                verticalLineToRelative(10.84f)
                curveToRelative(0.623f, -0.483f, 1.396f, -1.185f, 2.318f, -2.107f)
                close()
            }
        }
        .build()
        return _fanfou!!
    }

private var _fanfou: ImageVector? = null
