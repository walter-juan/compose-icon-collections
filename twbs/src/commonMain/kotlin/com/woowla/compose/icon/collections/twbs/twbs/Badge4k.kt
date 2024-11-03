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

public val Twbs.Badge4k: ImageVector
    get() {
        if (_badge4k != null) {
            return _badge4k!!
        }
        _badge4k = Builder(name = "Badge4k", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.807f, 5.001f)
                curveTo(4.021f, 6.298f, 3.203f, 7.6f, 2.5f, 8.917f)
                verticalLineToRelative(0.971f)
                horizontalLineToRelative(2.905f)
                lineTo(5.405f, 11.0f)
                horizontalLineToRelative(1.112f)
                lineTo(6.517f, 9.888f)
                horizontalLineToRelative(0.733f)
                lineTo(7.25f, 8.93f)
                horizontalLineToRelative(-0.733f)
                lineTo(6.517f, 5.001f)
                close()
                moveTo(3.577f, 8.931f)
                verticalLineToRelative(-0.032f)
                arcToRelative(47.0f, 47.0f, 0.0f, false, true, 1.766f, -3.001f)
                horizontalLineToRelative(0.062f)
                lineTo(5.405f, 8.93f)
                close()
                moveTo(13.408f, 5.001f)
                horizontalLineToRelative(-1.306f)
                lineTo(9.835f, 7.687f)
                horizontalLineToRelative(-0.057f)
                lineTo(9.778f, 5.0f)
                lineTo(8.59f, 5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.187f)
                lineTo(9.777f, 9.075f)
                lineToRelative(0.615f, -0.699f)
                lineTo(12.072f, 11.0f)
                lineTo(13.5f, 11.0f)
                lineToRelative(-2.232f, -3.415f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _badge4k!!
    }

private var _badge4k: ImageVector? = null
