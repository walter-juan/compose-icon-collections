package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.WindowDesktop: ImageVector
    get() {
        if (_windowDesktop != null) {
            return _windowDesktop!!
        }
        _windowDesktop = Builder(name = "WindowDesktop", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.375f, 1.0f)
                arcTo(2.366f, 2.366f, 0.0f, false, false, 0.0f, 3.357f)
                verticalLineToRelative(9.286f)
                arcTo(2.366f, 2.366f, 0.0f, false, false, 2.375f, 15.0f)
                horizontalLineToRelative(11.25f)
                arcTo(2.366f, 2.366f, 0.0f, false, false, 16.0f, 12.643f)
                verticalLineTo(3.357f)
                arcTo(2.366f, 2.366f, 0.0f, false, false, 13.625f, 1.0f)
                close()
                moveTo(1.0f, 3.357f)
                curveTo(1.0f, 2.612f, 1.611f, 2.0f, 2.375f, 2.0f)
                horizontalLineToRelative(11.25f)
                curveTo(14.389f, 2.0f, 15.0f, 2.612f, 15.0f, 3.357f)
                verticalLineTo(4.0f)
                horizontalLineTo(1.0f)
                close()
                moveTo(1.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(7.643f)
                curveToRelative(0.0f, 0.745f, -0.611f, 1.357f, -1.375f, 1.357f)
                horizontalLineTo(2.375f)
                arcTo(1.366f, 1.366f, 0.0f, false, true, 1.0f, 12.643f)
                close()
            }
        }
        .build()
        return _windowDesktop!!
    }

private var _windowDesktop: ImageVector? = null
