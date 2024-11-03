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

public val Twbs.StopFill: ImageVector
    get() {
        if (_stopFill != null) {
            return _stopFill!!
        }
        _stopFill = Builder(name = "StopFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.5f)
                horizontalLineToRelative(6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.5f, 5.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 11.0f)
                verticalLineTo(5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 3.5f)
            }
        }
        .build()
        return _stopFill!!
    }

private var _stopFill: ImageVector? = null
