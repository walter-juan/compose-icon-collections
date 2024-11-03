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

public val Twbs.AlarmFill: ImageVector
    get() {
        if (_alarmFill != null) {
            return _alarmFill!!
        }
        _alarmFill = Builder(name = "AlarmFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(1.07f)
                arcToRelative(7.001f, 7.001f, 0.0f, false, true, 3.274f, 12.474f)
                lineToRelative(0.601f, 0.602f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, 0.708f)
                lineToRelative(-0.746f, -0.746f)
                arcTo(6.97f, 6.97f, 0.0f, false, true, 8.0f, 16.0f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, true, -3.422f, -0.892f)
                lineToRelative(-0.746f, 0.746f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, -0.708f)
                lineToRelative(0.602f, -0.602f)
                arcTo(7.001f, 7.001f, 0.0f, false, true, 7.0f, 2.07f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(-0.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 0.5f)
                moveToRelative(2.5f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(3.362f)
                lineToRelative(-1.429f, 2.38f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.858f, 0.515f)
                lineToRelative(1.5f, -2.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 8.5f, 9.0f)
                close()
                moveTo(0.86f, 5.387f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 4.387f, 1.86f)
                arcTo(8.04f, 8.04f, 0.0f, false, false, 0.86f, 5.387f)
                moveTo(11.613f, 1.86f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 3.527f, 3.527f)
                arcToRelative(8.04f, 8.04f, 0.0f, false, false, -3.527f, -3.527f)
            }
        }
        .build()
        return _alarmFill!!
    }

private var _alarmFill: ImageVector? = null
