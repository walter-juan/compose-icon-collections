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

public val Twbs.RewindBtnFill: ImageVector
    get() {
        if (_rewindBtnFill != null) {
            return _rewindBtnFill!!
        }
        _rewindBtnFill = Builder(name = "RewindBtnFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                moveToRelative(7.729f, 1.055f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 5.5f)
                verticalLineToRelative(1.886f)
                lineToRelative(3.21f, -2.293f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 12.0f, 5.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.79f, 0.407f)
                lineTo(8.0f, 8.614f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.79f, 0.407f)
                lineToRelative(-3.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.814f)
                lineToRelative(3.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.519f, -0.038f)
            }
        }
        .build()
        return _rewindBtnFill!!
    }

private var _rewindBtnFill: ImageVector? = null
