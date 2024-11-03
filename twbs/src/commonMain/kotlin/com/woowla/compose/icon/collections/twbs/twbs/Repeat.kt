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

public val Twbs.Repeat: ImageVector
    get() {
        if (_repeat != null) {
            return _repeat!!
        }
        _repeat = Builder(name = "Repeat", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.466f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.584f, 5.777f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.896f, 0.446f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(1.534f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.41f, -0.192f)
                lineToRelative(2.36f, 1.966f)
                curveToRelative(0.12f, 0.1f, 0.12f, 0.284f, 0.0f, 0.384f)
                lineToRelative(-2.36f, 1.966f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.41f, -0.192f)
                moveToRelative(3.81f, 0.086f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.67f, 0.225f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 11.0f, 13.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(1.466f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.41f, 0.192f)
                lineToRelative(-2.36f, -1.966f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, -0.384f)
                lineToRelative(2.36f, -1.966f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.41f, 0.192f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.585f, -5.777f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.225f, -0.67f)
                close()
            }
        }
        .build()
        return _repeat!!
    }

private var _repeat: ImageVector? = null
