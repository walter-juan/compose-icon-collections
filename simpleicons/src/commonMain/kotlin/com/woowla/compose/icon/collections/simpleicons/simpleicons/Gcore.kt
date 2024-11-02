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

public val Simpleicons.Gcore: ImageVector
    get() {
        if (_gcore != null) {
            return _gcore!!
        }
        _gcore = Builder(name = "Gcore", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.285f, 12.0f)
                curveToRelative(0.0f, 6.627f, -5.361f, 12.0f, -11.973f, 12.0f)
                curveToRelative(-2.671f, 0.0f, -5.139f, -0.877f, -7.13f, -2.358f)
                curveToRelative(1.167f, 0.656f, 3.03f, 1.418f, 5.392f, 1.419f)
                curveToRelative(2.779f, 0.0f, 5.455f, -1.054f, 7.491f, -2.946f)
                arcToRelative(11.06f, 11.06f, 0.0f, false, false, 3.5f, -7.262f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 0.05f, -0.788f)
                curveToRelative(0.01f, -0.417f, -0.066f, -1.079f, -0.075f, -1.296f)
                lineToRelative(-0.01f, 0.01f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -0.102f, -0.814f)
                horizontalLineToRelative(-8.687f)
                curveToRelative(-0.748f, 1.398f, -1.486f, 2.802f, -2.226f, 4.204f)
                horizontalLineToRelative(6.564f)
                arcToRelative(6.91f, 6.91f, 0.0f, false, true, -1.075f, 2.019f)
                arcToRelative(6.82f, 6.82f, 0.0f, false, true, -2.403f, 1.981f)
                arcToRelative(6.796f, 6.796f, 0.0f, false, true, -3.031f, 0.708f)
                curveToRelative(-0.804f, 0.0f, -1.603f, -0.146f, -2.357f, -0.425f)
                arcToRelative(6.845f, 6.845f, 0.0f, false, true, -3.263f, -2.514f)
                arcTo(6.893f, 6.893f, 0.0f, false, true, 1.715f, 12.0f)
                arcToRelative(6.88f, 6.88f, 0.0f, false, true, 0.522f, -2.631f)
                arcToRelative(6.92f, 6.92f, 0.0f, false, true, 1.486f, -2.231f)
                arcToRelative(6.82f, 6.82f, 0.0f, false, true, 2.226f, -1.49f)
                curveToRelative(0.834f, -0.344f, 1.725f, -0.523f, 2.625f, -0.523f)
                arcToRelative(6.82f, 6.82f, 0.0f, false, true, 4.043f, 1.321f)
                curveToRelative(0.663f, -1.238f, 1.317f, -2.48f, 1.973f, -3.721f)
                curveTo(11.165f, 0.488f, 6.78f, 0.349f, 3.216f, 2.329f)
                curveTo(5.205f, 0.867f, 7.658f, 0.0f, 10.312f, 0.0f)
                curveToRelative(6.612f, 0.0f, 11.973f, 5.373f, 11.973f, 12.0f)
            }
        }
        .build()
        return _gcore!!
    }

private var _gcore: ImageVector? = null
