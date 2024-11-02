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

public val Simpleicons.Bluesound: ImageVector
    get() {
        if (_bluesound != null) {
            return _bluesound!!
        }
        _bluesound = Builder(name = "Bluesound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.327f, 14.893f)
                lineToRelative(-8.396f, 0.003f)
                arcToRelative(4.549f, 4.549f, 0.0f, false, false, -4.546f, 4.543f)
                curveToRelative(0.0f, 2.05f, 0.007f, 3.737f, 0.007f, 3.737f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(12.955f)
                lineToRelative(0.191f, -0.002f)
                curveToRelative(4.678f, -0.099f, 8.077f, -3.577f, 8.077f, -8.273f)
                arcToRelative(8.733f, 8.733f, 0.0f, false, false, -0.805f, -3.721f)
                arcToRelative(8.77f, 8.77f, 0.0f, false, false, 0.805f, -3.724f)
                curveToRelative(0.0f, -4.695f, -3.399f, -8.173f, -8.084f, -8.275f)
                lineTo(1.392f, 0.0f)
                verticalLineToRelative(0.833f)
                reflectiveCurveToRelative(-0.007f, 1.681f, -0.007f, 3.733f)
                arcToRelative(4.548f, 4.548f, 0.0f, false, false, 4.546f, 4.541f)
                lineToRelative(8.399f, 0.013f)
                curveToRelative(2.375f, 0.0f, 4.392f, 1.048f, 5.567f, 2.884f)
                curveToRelative(-1.178f, 1.838f, -3.197f, 2.889f, -5.57f, 2.889f)
                moveToRelative(0.219f, -7.452f)
                lineToRelative(-8.615f, 0.002f)
                arcToRelative(2.88f, 2.88f, 0.0f, false, true, -2.879f, -2.877f)
                verticalLineTo(1.665f)
                horizontalLineTo(14.33f)
                curveToRelative(3.835f, 0.0f, 6.62f, 2.782f, 6.62f, 6.615f)
                curveToRelative(0.0f, 0.681f, -0.092f, 1.339f, -0.271f, 1.97f)
                curveToRelative(-1.47f, -1.726f, -3.669f, -2.75f, -6.133f, -2.809f)
                moveToRelative(6.133f, 6.314f)
                curveToRelative(0.179f, 0.629f, 0.271f, 1.29f, 0.271f, 1.97f)
                curveToRelative(0.0f, 3.831f, -2.785f, 6.611f, -6.62f, 6.611f)
                lineToRelative(-11.278f, 0.002f)
                verticalLineToRelative(-2.899f)
                arcToRelative(2.882f, 2.882f, 0.0f, false, true, 2.879f, -2.879f)
                horizontalLineToRelative(8.446f)
                lineToRelative(0.288f, -0.015f)
                curveToRelative(2.412f, -0.084f, 4.564f, -1.088f, 6.014f, -2.79f)
            }
        }
        .build()
        return _bluesound!!
    }

private var _bluesound: ImageVector? = null
