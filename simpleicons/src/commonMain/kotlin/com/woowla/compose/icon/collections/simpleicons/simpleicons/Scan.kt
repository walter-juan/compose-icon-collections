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

public val Simpleicons.Scan: ImageVector
    get() {
        if (_scan != null) {
            return _scan!!
        }
        _scan = Builder(name = "Scan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.363f, 9.13f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, 5.285f)
                lineToRelative(-3.376f, 5.948f)
                arcToRelative(6.11f, 6.11f, 0.0f, false, true, -4.603f, 2.853f)
                horizontalLineToRelative(-6.76f)
                arcToRelative(6.09f, 6.09f, 0.0f, false, true, -4.605f, -2.83f)
                lineToRelative(-3.384f, -6.03f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, -5.276f)
                lineToRelative(3.384f, -5.806f)
                arcTo(5.73f, 5.73f, 0.0f, false, true, 8.623f, 0.784f)
                horizontalLineToRelative(6.76f)
                arcToRelative(5.74f, 5.74f, 0.0f, false, true, 4.605f, 2.49f)
                close()
                moveTo(8.893f, 15.07f)
                arcToRelative(2.22f, 2.22f, 0.0f, false, false, -1.542f, 0.73f)
                arcToRelative(5.41f, 5.41f, 0.0f, false, false, 4.43f, 2.44f)
                arcToRelative(4.305f, 4.305f, 0.0f, false, false, 4.886f, -3.716f)
                curveToRelative(0.124f, -3.02f, -2.04f, -3.834f, -4.264f, -4.248f)
                curveToRelative(-1.12f, -0.232f, -2.207f, -0.382f, -2.207f, -1.427f)
                curveToRelative(0.0f, -0.888f, 0.946f, -1.26f, 1.95f, -1.26f)
                arcToRelative(2.49f, 2.49f, 0.0f, false, true, 2.132f, 1.21f)
                lineToRelative(2.182f, -1.46f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, false, -4.314f, -2.256f)
                curveToRelative(-2.298f, 0.0f, -4.513f, 1.27f, -4.662f, 3.683f)
                curveToRelative(0.0f, 2.821f, 2.04f, 3.759f, 4.048f, 4.066f)
                curveToRelative(1.319f, 0.183f, 2.489f, 0.43f, 2.489f, 1.535f)
                curveToRelative(0.0f, 1.302f, -1.012f, 1.6f, -2.15f, 1.6f)
                curveToRelative(-1.658f, 0.0f, -1.658f, -0.88f, -2.92f, -0.88f)
            }
        }
        .build()
        return _scan!!
    }

private var _scan: ImageVector? = null
