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

public val Twbs.Watch: ImageVector
    get() {
        if (_watch != null) {
            return _watch!!
        }
        _watch = Builder(name = "Watch", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.667f, 16.0f)
                curveTo(4.747f, 16.0f, 4.0f, 15.254f, 4.0f, 14.333f)
                verticalLineToRelative(-1.86f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 2.0f, 8.0f)
                curveToRelative(0.0f, -1.777f, 0.772f, -3.374f, 2.0f, -4.472f)
                verticalLineTo(1.667f)
                curveTo(4.0f, 0.747f, 4.746f, 0.0f, 5.667f, 0.0f)
                horizontalLineToRelative(4.666f)
                curveTo(11.253f, 0.0f, 12.0f, 0.746f, 12.0f, 1.667f)
                verticalLineToRelative(1.86f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.918f, 3.48f)
                arcToRelative(0.502f, 0.502f, 0.0f, false, true, 0.582f, 0.493f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.582f, 0.493f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 12.473f)
                verticalLineToRelative(1.86f)
                curveToRelative(0.0f, 0.92f, -0.746f, 1.667f, -1.667f, 1.667f)
                close()
                moveTo(13.0f, 8.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, false, 3.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
            }
        }
        .build()
        return _watch!!
    }

private var _watch: ImageVector? = null
