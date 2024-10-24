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

public val Octicons.Thumbsup24: ImageVector
    get() {
        if (_thumbsup24 != null) {
            return _thumbsup24!!
        }
        _thumbsup24 = Builder(name = "Thumbsup24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.349f, 2.378f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, 0.808f, -0.361f)
                lineToRelative(0.127f, 0.027f)
                arcToRelative(3.875f, 3.875f, 0.0f, false, true, 2.879f, 4.97f)
                lineTo(16.527f, 9.0f)
                horizontalLineToRelative(1.137f)
                curveToRelative(2.645f, 0.0f, 4.513f, 2.591f, 3.676f, 5.1f)
                lineToRelative(-1.559f, 4.678f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 16.698f, 21.0f)
                horizontalLineToRelative(-5.289f)
                arcToRelative(4.503f, 4.503f, 0.0f, false, true, -2.828f, -0.999f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 7.0f, 21.0f)
                lineTo(4.75f, 21.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 3.0f, 19.25f)
                verticalLineToRelative(-8.5f)
                curveTo(3.0f, 9.784f, 3.784f, 9.0f, 4.75f, 9.0f)
                horizontalLineToRelative(4.67f)
                arcToRelative(0.251f, 0.251f, 0.0f, false, false, 0.217f, -0.126f)
                lineToRelative(3.712f, -6.496f)
                close()
                moveTo(8.75f, 18.16f)
                lineToRelative(0.683f, 0.598f)
                arcToRelative(3.003f, 3.003f, 0.0f, false, false, 1.976f, 0.742f)
                horizontalLineToRelative(5.289f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.66f, -1.197f)
                lineToRelative(1.559f, -4.677f)
                arcToRelative(2.375f, 2.375f, 0.0f, false, false, -2.253f, -3.126f)
                lineTo(15.5f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.714f, -0.979f)
                lineToRelative(0.948f, -2.964f)
                arcToRelative(2.375f, 2.375f, 0.0f, false, false, -1.373f, -2.927f)
                lineToRelative(-3.422f, 5.988f)
                arcToRelative(1.749f, 1.749f, 0.0f, false, true, -1.519f, 0.882f)
                horizontalLineToRelative(-0.67f)
                verticalLineToRelative(7.66f)
                close()
                moveTo(7.25f, 10.5f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                lineTo(7.0f, 19.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(7.25f, 10.5f)
                close()
            }
        }
        .build()
        return _thumbsup24!!
    }

private var _thumbsup24: ImageVector? = null
