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

public val Twbs.Number1CircleFill: ImageVector
    get() {
        if (_number1CircleFill != null) {
            return _number1CircleFill!!
        }
        _number1CircleFill = Builder(name = "Number1CircleFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveTo(9.283f, 4.002f)
                horizontalLineTo(7.971f)
                lineTo(6.072f, 5.385f)
                verticalLineToRelative(1.271f)
                lineToRelative(1.834f, -1.318f)
                horizontalLineToRelative(0.065f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(1.312f)
                close()
            }
        }
        .build()
        return _number1CircleFill!!
    }

private var _number1CircleFill: ImageVector? = null
