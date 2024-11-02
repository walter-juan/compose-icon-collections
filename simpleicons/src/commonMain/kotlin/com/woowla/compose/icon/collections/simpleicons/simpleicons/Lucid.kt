package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Lucid: ImageVector
    get() {
        if (_lucid != null) {
            return _lucid!!
        }
        _lucid = Builder(name = "Lucid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(3.694f, 4.8f)
                lineTo(3.694f, 24.0f)
                lineTo(12.0f, 19.2f)
                close()
                moveTo(12.0f, 19.2f)
                verticalLineToRelative(4.502f)
                horizontalLineToRelative(8.305f)
                lineTo(20.305f, 14.4f)
                close()
            }
        }
        .build()
        return _lucid!!
    }

private var _lucid: ImageVector? = null
