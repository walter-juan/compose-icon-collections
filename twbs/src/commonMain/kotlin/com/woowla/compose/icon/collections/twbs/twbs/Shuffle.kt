package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val Twbs.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(name = "Shuffle", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.0f, 3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.5f, 3.0f)
                horizontalLineTo(1.0f)
                curveToRelative(2.202f, 0.0f, 3.827f, 1.24f, 4.874f, 2.418f)
                curveToRelative(0.49f, 0.552f, 0.865f, 1.102f, 1.126f, 1.532f)
                curveToRelative(0.26f, -0.43f, 0.636f, -0.98f, 1.126f, -1.532f)
                curveTo(9.173f, 4.24f, 10.798f, 3.0f, 13.0f, 3.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-1.798f, 0.0f, -3.173f, 1.01f, -4.126f, 2.082f)
                arcTo(9.6f, 9.6f, 0.0f, false, false, 7.556f, 8.0f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, false, 1.317f, 1.918f)
                curveTo(9.828f, 10.99f, 11.204f, 12.0f, 13.0f, 12.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-2.202f, 0.0f, -3.827f, -1.24f, -4.874f, -2.418f)
                arcTo(10.6f, 10.6f, 0.0f, false, true, 7.0f, 9.05f)
                curveToRelative(-0.26f, 0.43f, -0.636f, 0.98f, -1.126f, 1.532f)
                curveTo(4.827f, 11.76f, 3.202f, 13.0f, 1.0f, 13.0f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineTo(1.0f)
                curveToRelative(1.798f, 0.0f, 3.173f, -1.01f, 4.126f, -2.082f)
                arcTo(9.6f, 9.6f, 0.0f, false, false, 6.444f, 8.0f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, false, -1.317f, -1.918f)
                curveTo(4.172f, 5.01f, 2.796f, 4.0f, 1.0f, 4.0f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 5.466f)
                verticalLineTo(1.534f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.41f, -0.192f)
                lineToRelative(2.36f, 1.966f)
                curveToRelative(0.12f, 0.1f, 0.12f, 0.284f, 0.0f, 0.384f)
                lineToRelative(-2.36f, 1.966f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.41f, -0.192f)
                moveToRelative(0.0f, 9.0f)
                verticalLineToRelative(-3.932f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.41f, -0.192f)
                lineToRelative(2.36f, 1.966f)
                curveToRelative(0.12f, 0.1f, 0.12f, 0.284f, 0.0f, 0.384f)
                lineToRelative(-2.36f, 1.966f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.41f, -0.192f)
            }
        }
        .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
