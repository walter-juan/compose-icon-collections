package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Tv: ImageVector
    get() {
        if (_tv != null) {
            return _tv!!
        }
        _tv = Builder(name = "Tv", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
                16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 13.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 13.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineTo(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                moveTo(13.991f, 3.0f)
                lineToRelative(0.024f, 0.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.538f, 0.143f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, 0.302f, 0.254f)
                curveToRelative(0.067f, 0.1f, 0.145f, 0.277f, 0.145f, 0.602f)
                verticalLineToRelative(5.991f)
                lineToRelative(-0.001f, 0.024f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.143f, 0.538f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, -0.254f, 0.302f)
                curveToRelative(-0.1f, 0.067f, -0.277f, 0.145f, -0.602f, 0.145f)
                horizontalLineTo(2.009f)
                lineToRelative(-0.024f, -0.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.538f, -0.143f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, -0.302f, -0.254f)
                curveTo(1.078f, 10.502f, 1.0f, 10.325f, 1.0f, 10.0f)
                verticalLineTo(4.009f)
                lineToRelative(0.001f, -0.024f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.143f, -0.538f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, 0.254f, -0.302f)
                curveTo(1.498f, 3.078f, 1.675f, 3.0f, 2.0f, 3.0f)
                close()
                moveTo(14.0f, 2.0f)
                horizontalLineTo(2.0f)
                curveTo(0.0f, 2.0f, 0.0f, 4.0f, 0.0f, 4.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.0f, 0.0f, 2.0f, -2.0f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -2.0f, -2.0f, -2.0f, -2.0f, -2.0f)
            }
        }
        .build()
        return _tv!!
    }

private var _tv: ImageVector? = null
