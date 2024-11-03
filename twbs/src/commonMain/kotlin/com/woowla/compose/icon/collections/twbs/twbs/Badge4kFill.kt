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

public val Twbs.Badge4kFill: ImageVector
    get() {
        if (_badge4kFill != null) {
            return _badge4kFill!!
        }
        _badge4kFill = Builder(name = "Badge4kFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.577f, 8.9f)
                verticalLineToRelative(0.03f)
                horizontalLineToRelative(1.828f)
                verticalLineTo(5.898f)
                horizontalLineToRelative(-0.062f)
                arcToRelative(47.0f, 47.0f, 0.0f, false, false, -1.766f, 3.001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(16.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(4.372f, 5.715f)
                lineTo(4.807f, 5.001f)
                horizontalLineToRelative(1.71f)
                verticalLineToRelative(3.93f)
                horizontalLineToRelative(0.733f)
                verticalLineToRelative(0.957f)
                horizontalLineToRelative(-0.733f)
                lineTo(6.517f, 11.0f)
                lineTo(5.405f, 11.0f)
                lineTo(5.405f, 9.888f)
                lineTo(2.5f, 9.888f)
                verticalLineToRelative(-0.971f)
                curveToRelative(0.574f, -1.077f, 1.225f, -2.142f, 1.872f, -3.202f)
                moveToRelative(7.73f, -0.714f)
                horizontalLineToRelative(1.306f)
                lineToRelative(-2.14f, 2.584f)
                lineTo(13.5f, 11.0f)
                horizontalLineToRelative(-1.428f)
                lineToRelative(-1.679f, -2.624f)
                lineToRelative(-0.615f, 0.7f)
                lineTo(9.778f, 11.0f)
                lineTo(8.59f, 11.0f)
                lineTo(8.59f, 5.001f)
                horizontalLineToRelative(1.187f)
                verticalLineToRelative(2.686f)
                horizontalLineToRelative(0.057f)
                lineTo(12.102f, 5.0f)
                close()
            }
        }
        .build()
        return _badge4kFill!!
    }

private var _badge4kFill: ImageVector? = null
