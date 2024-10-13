package com.woowla.compose.icon.collections.devicons.devicons.vercel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.VercelGroup

public val VercelGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(64.0f, 8.57f)
                lineToRelative(-0.43f, 0.74f)
                lineTo(0.0f, 119.43f)
                horizontalLineToRelative(128.0f)
                close()
                moveTo(64.0f, 10.55f)
                lineTo(126.29f, 118.44f)
                lineTo(1.71f, 118.44f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
