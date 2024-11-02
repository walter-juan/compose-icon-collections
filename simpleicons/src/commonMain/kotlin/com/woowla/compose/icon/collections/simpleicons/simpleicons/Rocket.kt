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

public val Simpleicons.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.735f, 0.238f)
                verticalLineTo(0.236f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, false, -0.2f, -0.188f)
                curveToRelative(-0.256f, -0.04f, -6.336f, -0.924f, -14.17f, 7.051f)
                arcToRelative(28.44f, 28.44f, 0.0f, false, false, -2.12f, 2.576f)
                lineToRelative(-4.047f, 1.166f)
                arcToRelative(0.246f, 0.246f, 0.0f, false, false, -0.124f, 0.08f)
                lineToRelative(-2.856f, 3.5f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, false, 0.126f, 0.394f)
                lineToRelative(3.887f, 1.096f)
                lineToRelative(0.484f, -0.566f)
                curveToRelative(0.178f, -0.208f, 0.37f, -0.4f, 0.574f, -0.58f)
                lineToRelative(0.54f, -0.472f)
                lineToRelative(-0.38f, 0.608f)
                arcToRelative(5.556f, 5.556f, 0.0f, false, true, -0.482f, 0.66f)
                lineToRelative(-0.52f, 0.606f)
                curveToRelative(0.008f, 0.79f, 0.214f, 1.488f, 0.62f, 2.068f)
                lineTo(3.68f, 19.653f)
                curveToRelative(-0.148f, 0.16f, -0.036f, 0.272f, 0.12f, 0.428f)
                lineToRelative(1.11f, 1.086f)
                curveToRelative(0.153f, 0.16f, 0.255f, 0.258f, 0.41f, 0.1f)
                lineToRelative(1.505f, -1.534f)
                curveToRelative(0.34f, 0.122f, 1.162f, 0.334f, 2.4f, 0.14f)
                lineToRelative(0.75f, -0.576f)
                curveToRelative(0.212f, -0.164f, 0.438f, -0.312f, 0.672f, -0.442f)
                lineToRelative(0.644f, -0.36f)
                lineToRelative(-0.514f, 0.53f)
                curveToRelative(-0.187f, 0.192f, -0.387f, 0.37f, -0.6f, 0.534f)
                lineToRelative(-0.62f, 0.476f)
                lineToRelative(1.424f, 3.804f)
                arcToRelative(0.246f, 0.246f, 0.0f, false, false, 0.404f, 0.09f)
                lineToRelative(3.242f, -3.144f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, false, 0.072f, -0.136f)
                lineToRelative(0.698f, -4.108f)
                curveToRelative(0.884f, -0.78f, 1.78f, -1.686f, 2.66f, -2.694f)
                curveToRelative(5.072f, -5.806f, 5.798f, -10.315f, 5.78f, -12.487f)
                curveToRelative(-0.008f, -0.702f, -0.094f, -1.094f, -0.1f, -1.122f)
                horizontalLineToRelative(-0.002f)
                close()
                moveTo(16.49f, 11.165f)
                curveToRelative(-1.274f, 1.296f, -3.1f, 1.564f, -4.082f, 0.6f)
                curveToRelative(-0.98f, -0.962f, -0.744f, -2.794f, 0.53f, -4.09f)
                reflectiveCurveToRelative(3.1f, -1.566f, 4.08f, -0.602f)
                curveToRelative(0.982f, 0.964f, 0.746f, 2.796f, -0.528f, 4.092f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
