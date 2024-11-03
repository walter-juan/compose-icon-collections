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

public val Twbs.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) {
            return _rewindCircle!!
        }
        _rewindCircle = Builder(name = "RewindCircle", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.729f, 5.055f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.52f, 0.038f)
                lineToRelative(-3.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.814f)
                lineToRelative(3.5f, 2.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 8.0f, 10.5f)
                verticalLineTo(8.614f)
                lineToRelative(3.21f, 2.293f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 12.0f, 10.5f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.79f, -0.407f)
                lineTo(8.0f, 7.386f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.271f, -0.445f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveTo(1.0f, 8.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 14.0f, 0.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 1.0f, 8.0f)
            }
        }
        .build()
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null
