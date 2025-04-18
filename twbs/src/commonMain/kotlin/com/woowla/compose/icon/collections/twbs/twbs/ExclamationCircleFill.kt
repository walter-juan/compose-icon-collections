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

public val Twbs.ExclamationCircleFill: ImageVector
    get() {
        if (_exclamationCircleFill != null) {
            return _exclamationCircleFill!!
        }
        _exclamationCircleFill = Builder(name = "ExclamationCircleFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveTo(8.0f, 4.0f)
                arcToRelative(0.905f, 0.905f, 0.0f, false, false, -0.9f, 0.995f)
                lineToRelative(0.35f, 3.507f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, false, 1.1f, 0.0f)
                lineToRelative(0.35f, -3.507f)
                arcTo(0.905f, 0.905f, 0.0f, false, false, 8.0f, 4.0f)
                moveToRelative(0.002f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _exclamationCircleFill!!
    }

private var _exclamationCircleFill: ImageVector? = null
