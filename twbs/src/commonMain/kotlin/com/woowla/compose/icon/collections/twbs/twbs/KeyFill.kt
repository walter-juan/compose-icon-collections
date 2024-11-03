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

public val Twbs.KeyFill: ImageVector
    get() {
        if (_keyFill != null) {
            return _keyFill!!
        }
        _keyFill = Builder(name = "KeyFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 11.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 3.163f, -5.0f)
                horizontalLineTo(14.0f)
                lineTo(15.5f, 8.0f)
                lineTo(14.0f, 9.5f)
                lineToRelative(-1.0f, -1.0f)
                lineToRelative(-1.0f, 1.0f)
                lineToRelative(-1.0f, -1.0f)
                lineToRelative(-1.0f, 1.0f)
                lineToRelative(-1.0f, -1.0f)
                lineToRelative(-1.0f, 1.0f)
                horizontalLineTo(6.663f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.163f, 2.0f)
                moveTo(2.5f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
            }
        }
        .build()
        return _keyFill!!
    }

private var _keyFill: ImageVector? = null
