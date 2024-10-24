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

public val Octicons.Thumbsdown24: ImageVector
    get() {
        if (_thumbsdown24 != null) {
            return _thumbsdown24!!
        }
        _thumbsdown24 = Builder(name = "Thumbsdown24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.651f, 21.622f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, -0.808f, 0.361f)
                lineToRelative(-0.127f, -0.027f)
                arcToRelative(3.875f, 3.875f, 0.0f, false, true, -2.879f, -4.97f)
                lineTo(7.473f, 15.0f)
                lineTo(6.336f, 15.0f)
                curveToRelative(-2.645f, 0.0f, -4.513f, -2.591f, -3.676f, -5.1f)
                lineToRelative(1.559f, -4.678f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 7.302f, 3.0f)
                horizontalLineToRelative(5.289f)
                curveToRelative(1.031f, 0.0f, 2.029f, 0.354f, 2.828f, 0.999f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 17.0f, 3.0f)
                horizontalLineToRelative(2.25f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(8.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 19.25f, 15.0f)
                horizontalLineToRelative(-4.67f)
                arcToRelative(0.251f, 0.251f, 0.0f, false, false, -0.217f, 0.126f)
                lineToRelative(-3.712f, 6.496f)
                close()
                moveTo(15.25f, 5.84f)
                lineToRelative(-0.684f, -0.598f)
                arcToRelative(2.999f, 2.999f, 0.0f, false, false, -1.975f, -0.742f)
                lineTo(7.302f, 4.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.66f, 1.197f)
                lineToRelative(-1.559f, 4.677f)
                arcTo(2.375f, 2.375f, 0.0f, false, false, 6.336f, 13.5f)
                lineTo(8.5f, 13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.714f, 0.979f)
                lineToRelative(-0.948f, 2.964f)
                arcToRelative(2.375f, 2.375f, 0.0f, false, false, 1.373f, 2.927f)
                lineToRelative(3.422f, -5.988f)
                arcToRelative(1.749f, 1.749f, 0.0f, false, true, 1.519f, -0.882f)
                horizontalLineToRelative(0.67f)
                lineTo(15.25f, 5.84f)
                close()
                moveTo(16.75f, 13.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(17.0f, 4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(8.75f)
                close()
            }
        }
        .build()
        return _thumbsdown24!!
    }

private var _thumbsdown24: ImageVector? = null
