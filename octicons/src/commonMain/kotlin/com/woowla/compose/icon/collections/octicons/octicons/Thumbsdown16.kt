package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.Thumbsdown16: ImageVector
    get() {
        if (_thumbsdown16 != null) {
            return _thumbsdown16!!
        }
        _thumbsdown16 = Builder(name = "Thumbsdown16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.653f, 15.369f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.776f, 0.371f)
                lineToRelative(-0.238f, -0.04f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -2.591f, -4.099f)
                lineTo(4.506f, 10.0f)
                horizontalLineToRelative(-0.665f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 0.723f, 5.833f)
                lineToRelative(1.135f, -3.859f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.482f, 0.0f)
                lineTo(9.43f, 0.0f)
                curveToRelative(0.78f, 0.003f, 1.538f, 0.25f, 2.168f, 0.702f)
                arcTo(1.752f, 1.752f, 0.0f, false, true, 12.989f, 0.0f)
                horizontalLineToRelative(1.272f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 16.0f, 1.75f)
                verticalLineToRelative(6.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 10.0f)
                horizontalLineToRelative(-3.417f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.217f, 0.127f)
                close()
                moveTo(11.25f, 2.351f)
                lineToRelative(-0.396f, -0.33f)
                arcToRelative(2.248f, 2.248f, 0.0f, false, false, -1.44f, -0.521f)
                lineTo(4.496f, 1.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -1.199f, 0.897f)
                lineTo(2.162f, 6.256f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 3.841f, 8.5f)
                lineTo(5.5f, 8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.721f, 0.956f)
                lineToRelative(-0.731f, 2.558f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.127f, 2.14f)
                lineTo(9.31f, 9.389f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.523f, -0.889f)
                horizontalLineToRelative(0.417f)
                close()
                moveTo(12.75f, 8.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-6.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(13.0f, 1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
            }
        }
        .build()
        return _thumbsdown16!!
    }

private var _thumbsdown16: ImageVector? = null
