package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsComponent: ImageVector
    get() {
        if (_bxsComponent != null) {
            return _bxsComponent!!
        }
        _bxsComponent = Builder(name = "BxsComponent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.553f, 18.895f)
                lineToRelative(4.0f, 2.0f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, 0.894f, 0.0f)
                lineTo(12.0f, 19.118f)
                lineToRelative(3.553f, 1.776f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, false, 0.894f, 0.001f)
                lineToRelative(4.0f, -2.0f)
                curveToRelative(0.339f, -0.17f, 0.553f, -0.516f, 0.553f, -0.895f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.379f, -0.214f, -0.725f, -0.553f, -0.895f)
                lineTo(17.0f, 10.382f)
                lineTo(17.0f, 6.0f)
                curveToRelative(0.0f, -0.379f, -0.214f, -0.725f, -0.553f, -0.895f)
                lineToRelative(-4.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.895f, 0.0f)
                lineToRelative(-4.0f, 2.0f)
                curveTo(7.214f, 5.275f, 7.0f, 5.621f, 7.0f, 6.0f)
                verticalLineToRelative(4.382f)
                lineToRelative(-3.447f, 1.724f)
                arcTo(0.998f, 0.998f, 0.0f, false, false, 3.0f, 13.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.379f, 0.214f, 0.725f, 0.553f, 0.895f)
                close()
                moveTo(8.0f, 12.118f)
                lineToRelative(2.264f, 1.132f)
                lineToRelative(-2.913f, 1.457f)
                lineToRelative(-2.264f, -1.132f)
                lineTo(8.0f, 12.118f)
                close()
                moveTo(12.0f, 9.618f)
                lineTo(15.0f, 8.118f)
                verticalLineToRelative(2.264f)
                lineToRelative(-3.0f, 1.5f)
                lineTo(12.0f, 9.618f)
                close()
                moveTo(18.264f, 13.25f)
                lineTo(15.382f, 14.691f)
                lineTo(13.118f, 13.559f)
                lineTo(16.0f, 12.118f)
                lineToRelative(2.264f, 1.132f)
                close()
                moveTo(8.0f, 18.882f)
                lineToRelative(-0.062f, -0.031f)
                lineTo(7.938f, 16.65f)
                lineTo(11.0f, 15.118f)
                verticalLineToRelative(2.264f)
                lineToRelative(-3.0f, 1.5f)
                close()
                moveTo(16.0f, 18.882f)
                verticalLineToRelative(-2.264f)
                lineToRelative(3.0f, -1.5f)
                verticalLineToRelative(2.264f)
                lineToRelative(-3.0f, 1.5f)
                close()
                moveTo(12.0f, 5.118f)
                lineToRelative(2.264f, 1.132f)
                lineToRelative(-2.882f, 1.441f)
                lineToRelative(-2.264f, -1.132f)
                lineTo(12.0f, 5.118f)
                close()
            }
        }
        .build()
        return _bxsComponent!!
    }

private var _bxsComponent: ImageVector? = null
