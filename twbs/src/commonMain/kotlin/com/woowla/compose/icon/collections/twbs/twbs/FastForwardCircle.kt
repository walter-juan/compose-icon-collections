package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) {
            return _fastForwardCircle!!
        }
        _fastForwardCircle = Builder(name = "FastForwardCircle", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 15.0f)
                arcTo(7.0f, 7.0f, 0.0f, true, true, 8.0f, 1.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.0f, 14.0f)
                moveToRelative(0.0f, 1.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.271f, 5.055f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.52f, 0.038f)
                lineTo(8.0f, 7.386f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.79f, -0.407f)
                lineToRelative(3.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.814f)
                lineToRelative(-3.5f, 2.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 10.5f)
                verticalLineTo(8.614f)
                lineToRelative(-3.21f, 2.293f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 10.5f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.271f, -0.445f)
            }
        }
        .build()
        return _fastForwardCircle!!
    }

private var _fastForwardCircle: ImageVector? = null
