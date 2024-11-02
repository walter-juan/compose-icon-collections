package com.woowla.compose.icon.collections.feather.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.feather.Feather

public val Feather.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }
        _thumbsDown = Builder(name = "ThumbsDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 15.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineToRelative(4.0f, -9.0f)
                lineTo(17.0f, 2.0f)
                lineTo(5.72f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 1.7f)
                lineToRelative(-1.38f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.3f)
                close()
                moveTo(17.0f, 2.0f)
                horizontalLineToRelative(2.67f)
                arcTo(2.31f, 2.31f, 0.0f, false, true, 22.0f, 4.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(2.31f, 2.31f, 0.0f, false, true, -2.33f, 2.0f)
                lineTo(17.0f, 13.0f)
            }
        }
        .build()
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
