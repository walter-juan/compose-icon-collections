package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Bezier2: ImageVector
    get() {
        if (_bezier2 != null) {
            return _bezier2!!
        }
        _bezier2 = Builder(name = "Bezier2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 2.5f)
                horizontalLineToRelative(4.134f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 1.0f)
                horizontalLineToRelative(-2.01f)
                quadToRelative(0.269f, 0.27f, 0.484f, 0.605f)
                curveTo(8.246f, 5.097f, 8.5f, 6.459f, 8.5f, 8.0f)
                curveToRelative(0.0f, 1.993f, 0.257f, 3.092f, 0.713f, 3.7f)
                curveToRelative(0.356f, 0.476f, 0.895f, 0.721f, 1.787f, 0.784f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.5f, 11.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                lineTo(6.866f, 13.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -1.0f)
                horizontalLineToRelative(1.711f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.165f, -0.2f)
                curveTo(7.743f, 11.407f, 7.5f, 10.007f, 7.5f, 8.0f)
                curveToRelative(0.0f, -1.46f, -0.246f, -2.597f, -0.733f, -3.355f)
                curveToRelative(-0.39f, -0.605f, -0.952f, -1.0f, -1.767f, -1.112f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 5.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.0f, 3.5f)
                close()
                moveTo(2.5f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(12.5f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
            }
        }
        .build()
        return _bezier2!!
    }

private var _bezier2: ImageVector? = null
