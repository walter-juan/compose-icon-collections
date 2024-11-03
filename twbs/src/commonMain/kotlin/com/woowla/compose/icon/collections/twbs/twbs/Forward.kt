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

public val Twbs.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.502f, 5.513f)
                arcToRelative(0.144f, 0.144f, 0.0f, false, false, -0.202f, 0.134f)
                verticalLineTo(6.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(2.5f)
                verticalLineToRelative(2.9f)
                horizontalLineToRelative(6.3f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.003f)
                curveToRelative(0.0f, 0.108f, 0.11f, 0.176f, 0.202f, 0.134f)
                lineToRelative(3.984f, -2.933f)
                lineToRelative(0.042f, -0.028f)
                arcToRelative(0.147f, 0.147f, 0.0f, false, false, 0.0f, -0.252f)
                lineToRelative(-0.042f, -0.028f)
                close()
                moveTo(8.3f, 5.647f)
                arcToRelative(1.144f, 1.144f, 0.0f, false, true, 1.767f, -0.96f)
                lineToRelative(3.994f, 2.94f)
                arcToRelative(1.147f, 1.147f, 0.0f, false, true, 0.0f, 1.946f)
                lineToRelative(-3.994f, 2.94f)
                arcToRelative(1.144f, 1.144f, 0.0f, false, true, -1.767f, -0.96f)
                verticalLineToRelative(-0.503f)
                horizontalLineTo(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-3.9f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(6.3f)
                close()
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
